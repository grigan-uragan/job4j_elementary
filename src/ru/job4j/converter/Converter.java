package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int ruble) {
        int result = ruble / 70;
        return result;
    }

    public static int rubleToDollar(int ruble) {
        int result = ruble / 60;
        return result;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles 2 euro. Test result: " + passed);

        in = 240;
        expected = 4;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("240 rubles are 4 dollar. Test result: " + passed);
    }
}
