package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] arr) {
        int result = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int cell = 0; cell < arr[row].length; cell++) {
                    result = result + arr[row][cell];
            }
        }
        return result;
    }
}
