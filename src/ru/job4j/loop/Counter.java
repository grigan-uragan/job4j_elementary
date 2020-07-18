package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result = result + i;
        }
        return result;
    }

    public static int sumByEven(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }
        }
        return result;
    }
}
