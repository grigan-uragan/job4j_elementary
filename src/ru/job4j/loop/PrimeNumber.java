package ru.job4j.loop;

public class PrimeNumber {
    public static int primeNumberCounter(int finish) {
        int count = 0;
        for (int i = 0; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
