package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int empty = i; empty < array.length; empty++) {
                    if (array[empty] != null) {
                        String temp = array[i];
                        array[i] = array[empty];
                        array[empty] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
