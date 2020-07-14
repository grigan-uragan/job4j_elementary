package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int ruble){
        int result = ruble / 70;
        return result;
    }

    public static int rubleToDollar(int ruble){
        int result = ruble / 60;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("210 rubles are " + rubleToEuro(210) + " euro.");
        System.out.println("240 rubles are " + rubleToDollar(240) + " dollar.");
    }
}
