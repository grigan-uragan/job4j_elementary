package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDivideByNumber(int number) {
        if (number == 0) {
            System.out.println("Could not divided by zero");
        } else if (number < 0) {
            System.out.println("This is negative numbers");
        } else {
            System.out.println("ok");
        }
    }

    public static void main(String[] args) {
        possibleDivideByNumber(0);
        possibleDivideByNumber(-10);
        possibleDivideByNumber(10);
    }
}
