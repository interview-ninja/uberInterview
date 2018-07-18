package com.uber.logger.models;

import java.util.LinkedList;
import java.util.Queue;

public class ConsoleWriter implements OutputWriter{

    private Queue<LogMessage> messageQueue = new LinkedList<>();
    private final int CAPACITY=100;
    Thread readThread = null;

    public ConsoleWriter() {
        readThread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    read();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        readThread.start();

    }

    @Override
    public void write(LogMessage logMessage) {
        if(messageQueue.size() >= CAPACITY) {
            System.out.println("ERROR Limit is full");
        }
        messageQueue.add(logMessage);
    }


    public void read() throws InterruptedException {

        while (true)
        {
            synchronized (this)
            {
                while (messageQueue.size()==0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                LogMessage logMessage = messageQueue.peek();
                System.out.println(logMessage.loggerLevel + " " + logMessage.getMessage() + " " + logMessage.epoch);
                messageQueue.remove();
            }
        }
    }


}
