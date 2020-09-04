package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.setName("kolobok");
        Hare hare = new Hare();
        hare.setName("Zaichik");
        Wolf wolf = new Wolf();
        wolf.setName("Seriy Volk");
        Fox fox = new Fox();
        fox.setName("Lisa Alisa");
        hare.ask(ball);
        wolf.ask(ball);
        fox.ask(ball);
    }
}
