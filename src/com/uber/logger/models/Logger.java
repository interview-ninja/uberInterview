package com.uber.logger.models;

public interface Logger {
    void info(String message);
    void error(String message);
    void debug(String message);
}
