package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < result.length; i++) {
           if (left.length != leftIndex && right.length != rightIndex) {
               if (left[leftIndex] < right[rightIndex]) {
                   result[i] = left[leftIndex++];
               } else if (left[leftIndex] == right[rightIndex]) {
                   result[i] = left[leftIndex++];
                   ++i;
                   result[i] = right[rightIndex++];
               } else {
                   result[i] = right[rightIndex++];
               }
           } else if (left.length == leftIndex) {
               result[i] = right[rightIndex++];
           } else {
               result[i] = left[leftIndex++];
           }
        }
        return result;
    }
}
