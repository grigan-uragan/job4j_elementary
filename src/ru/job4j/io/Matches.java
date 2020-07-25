package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int start = 11;
        Scanner scanner = new Scanner(System.in);
        int player = 1;
        while (true) {
            System.out.println("Игрок номер " + player + "  возьмите от 1 до 3 спичек");
            int take = Integer.parseInt(scanner.nextLine());
            if (take >= 1 && take <= 3) {
                start = start - take;
            } else {
                System.out.println("Будьте Внимательнее от 1 до 3 спичек");
                continue;
            }
            if (start > 0) {
                System.out.println("Спасибо! На столе осталось " + start);
            } else {
                System.out.println("Поздравляю игрок номер " + player + ", Вы выиграли!");
                break;
            }
            player = player == 1 ? 2 : 1;
        }
    }
}
