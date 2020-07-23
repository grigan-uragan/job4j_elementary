package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] result = new int[100];
        int size = 0;
        int delta = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (delta >= COINS[i]) {
                delta = delta - COINS[i];
                result[size++] = COINS[i];
            }
        }

        return Arrays.copyOf(result, size);
    }
}
