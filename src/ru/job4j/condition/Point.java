package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(distance(0, 0, 3, 3));
    }
}
