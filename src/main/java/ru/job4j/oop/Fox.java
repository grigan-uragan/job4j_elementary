package ru.job4j.oop;

public class Fox {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ask(Ball ball) {
        System.out.println(this.getName() + " : " + ball.getName() + " I'll eat you!");
        ball.answer(this);
        System.out.println(this.getName() + " : " + "Oh, honey... this is unlikely....");
        System.out.println(this.getName() + " : " + "Nom nom nom...... " + ball.getName() + " R.I.P");

    }
}
