package ru.job4j.condition;

public class SqArea {
    public static double square(int perimeter, int k ){
        int height = perimeter / (2 * (k + 1));
        int length = height * k;
        double result = height * length;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("perimeter = 4, k = 1, s = " + square(4, 1));
        System.out.println("perimeter = 6, k = 2, s = " + square(6, 2));
    }
}
