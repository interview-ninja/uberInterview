package com.uber.logger.models;

import jdk.nashorn.internal.runtime.options.LoggingOption;

public class UberLogger extends LoggerClass implements Logger  {

    private static UberLogger instance;

    private UberLogger(OutputWriter outputWriter, LoggerLevel threshold) {
        super(outputWriter,threshold);
    }

    public static UberLogger getInstance(OutputWriter outputWriter, LoggerLevel thresholdLogLevel) {
        if (instance == null) {
            synchronized (UberLogger.class) {
                if (instance == null) {
                    instance = new UberLogger(outputWriter, thresholdLogLevel);
                    System.out.println("First instance of SingletonLogger created.");
                }
            }
        }
        return instance;
    }

    @Override
    public void info(String message) {
        if(LoggerLevel.INFO.value >= thersholdLogLevel.value)
            this.outputWriter.write(new LogMessage(message, LoggerLevel.INFO, System.currentTimeMillis()));
    }

    @Override
    public void error(String message) {
        if(LoggerLevel.ERROR.value >= thersholdLogLevel.value)
            this.outputWriter.write(new LogMessage(message, LoggerLevel.ERROR, System.currentTimeMillis()));
    }

    @Override
    public void debug(String message) {
        if(LoggerLevel.DEBUG.value >= thersholdLogLevel.value)
            this.outputWriter.write(new LogMessage(message, LoggerLevel.DEBUG, System.currentTimeMillis()));
    }
}
