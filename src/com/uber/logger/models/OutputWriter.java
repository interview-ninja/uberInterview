package com.uber.logger.models;

public interface OutputWriter {
    void write(LogMessage logMessage);
}
