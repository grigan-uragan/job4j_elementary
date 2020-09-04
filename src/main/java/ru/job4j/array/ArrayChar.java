package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] words, char[] pref) {
        boolean result = true;
        int length = words.length > pref.length ? pref.length : words.length;
        for (int i = 0; i < length; i++) {
            if (words[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
