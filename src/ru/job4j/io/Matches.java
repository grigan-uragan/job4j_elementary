package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int start = 11;
        Scanner scanner = new Scanner(System.in);
        int player = 1;
        while (true) {
            System.out.println(player + " игрок возьмете от 1 до 3 спичек");
            int take = Integer.parseInt(scanner.nextLine());
            while (take < 1 || take > 3) {
                System.out.println("Попробуйте еще раз");
                take = Integer.parseInt(scanner.nextLine());
            }
            start = start - take;
            if (start <= 0) {
                System.out.println("Поздравляю " + player + " игрок вы выиграли");
                break;
            }
            System.out.println("На столе осталось " + start + " спичек");
            player = player == 1 ? 2 : 1;
        }
    }
}
