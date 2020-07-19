package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int notNullIndex = i; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        String temp = array[i];
                        array[i] = array[notNullIndex];
                        array[notNullIndex] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
