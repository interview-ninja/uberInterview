package com.uber.logger.models;

public abstract class LoggerClass {
    protected OutputWriter outputWriter;
    protected LoggerLevel thersholdLogLevel;

    public LoggerClass(OutputWriter outputWriter, LoggerLevel loggerLevel) {
        this.outputWriter = outputWriter;
        this.thersholdLogLevel = loggerLevel;
    }

    public OutputWriter getOutputWriter() {
        return outputWriter;
    }

    public void setOutputWriter(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }
}
