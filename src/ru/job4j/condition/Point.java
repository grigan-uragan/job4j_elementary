package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        int x = point.x - this.x;
        int y = point.y - this.y;
        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return result;
    }

    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(10, 10);
        System.out.println(first.distance(second));
    }
}
