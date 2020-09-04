package ru.job4j.calculate;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        int result = a * x * x + b * x + c;
        return result;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        System.out.println(calc(a, b, c, x));
    }
}
