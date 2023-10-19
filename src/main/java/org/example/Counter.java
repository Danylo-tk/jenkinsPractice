package org.example;

public class Counter {
    public static int count(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        }

        return inputString.length();
    }
}
