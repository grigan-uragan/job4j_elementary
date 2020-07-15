package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name == null) {
            System.out.println("Please, enter name");
            return;
        }
        if (name.equals("Super Mario")) {
            System.out.println("Start - Super Mario");
        }
        if (name.equals("Tanks")) {
            System.out.println("Start - Tanks");
        }
        if (name.equals("Tetris")) {
            System.out.println("Start - Tetris");
        }
    }

    public static void main(String[] args) {
        menu("Tetris");
    }
}
