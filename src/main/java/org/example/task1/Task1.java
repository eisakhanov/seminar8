package org.example.task1;

import org.example.model.Metric;

public class Task1 {

    public static void main(String[] args) {
        describe(new Metric("db-1", 45));   // запись Metric, наследует Record <- Object
        describe(new int[0]);               // массив: int, 1 измерение
        describe("db-1");                // класс String, наследует Object
    }

    public static String describe(Object o) {
        // ваш код
        return "";
    }
}
