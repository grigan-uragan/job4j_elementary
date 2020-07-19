package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1;
        if (start >= 0 && finish > start && finish < data.length) {
            for (int i = start; i <= finish; i++) {
                if (data[i] == el) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
