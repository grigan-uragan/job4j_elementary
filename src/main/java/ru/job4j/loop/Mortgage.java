package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double tax = amount * percent / 100;
            amount = (int) (amount + tax);
            amount = (amount - salary);
            year++;
        }
        return year;
    }
}
