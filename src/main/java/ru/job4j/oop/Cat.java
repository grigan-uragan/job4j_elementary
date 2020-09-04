package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String food) {
        this.food = food;
    }

    public void show() {
        System.out.println("Котик по имени " + this.name + " кушал - " + this.food);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("Burger");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("Mouse");
        black.show();
    }
}
