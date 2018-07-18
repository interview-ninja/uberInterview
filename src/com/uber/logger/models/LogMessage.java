package com.uber.logger.models;

public class LogMessage {
    String message;
    LoggerLevel loggerLevel;
    Long epoch;

    public LogMessage(String message, LoggerLevel loggerLevel, Long epoch) {
        this.message = message;
        this.loggerLevel = loggerLevel;
        this.epoch = epoch;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoggerLevel getLoggerLevel() {
        return loggerLevel;
    }

    public void setLoggerLevel(LoggerLevel loggerLevel) {
        this.loggerLevel = loggerLevel;
    }

    public Long getEpoch() {
        return epoch;
    }

    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }
}
