package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point point) {
        int x = point.x - this.x;
        int y = point.y - this.y;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distance3d(Point point) {
        int x = point.x - this.x;
        int y = point.y - this.y;
        int z = point.z - this.z;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(0, 0, 0);
        Point second = new Point(10, 10, 10);
        System.out.println(first.distance3d(second));
    }
}
