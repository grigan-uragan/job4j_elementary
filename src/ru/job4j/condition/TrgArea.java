package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return  result;
    }

    public static void main(String[] args) {
        System.out.println("area(2, 2, 2) = " + area(2, 2, 2));
    }
}