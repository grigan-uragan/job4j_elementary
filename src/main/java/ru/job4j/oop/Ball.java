package ru.job4j.oop;

public class Ball {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void answer(Hare hare) {
        System.out.println(this.getName() + " : " + hare.getName() + " Don't eat me");
    }

    public void answer(Fox fox) {
        System.out.println(this.getName() + " : " + fox.getName() + " Don't eat me");
    }

    public void answer(Wolf wolf) {
        System.out.println(this.getName() + " : " + wolf.getName() + " Don't eat me");
    }
}
