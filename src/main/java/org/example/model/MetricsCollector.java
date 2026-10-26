package org.example.model;

@SuppressWarnings("ALL")
public interface MetricsCollector {
    void increment(String name);

    void timer(String name, int millis);

    int computeRate();
}
