package com.uber.logger.models;

public enum  LoggerLevel {
    INFO(1),
    DEBUG(0),
    ERROR(2),;
    int value;

    LoggerLevel(int i) {
        value=i;
    }
}
