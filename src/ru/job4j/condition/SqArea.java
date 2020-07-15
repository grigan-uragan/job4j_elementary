package ru.job4j.condition;

public class SqArea {
    public static double square(int perimeter, int k) {
        if (k <= 0 || perimeter <= 0) {
            return -1;
        } else {
            double height = perimeter / (2.0 * (k + 1));
            double length = height * k;
            double result = height * length;
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("perimeter = 4, k = 1, s = " + square(4, 1));
        System.out.println("perimeter = 6, k = 2, s = " + square(6, 2));
    }
}
