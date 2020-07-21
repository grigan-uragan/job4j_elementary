package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        first = a;
        second = b;
        third = c;
    }

    public double period(double ab, double bc, double ac) {
        return (ab + bc + ac) / 2;
    }

    public boolean exist(double ab, double bc, double ac) {
        return ((ab + ac) > bc && (ab + bc) > ac && (bc + ac) > ab);
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ac = first.distance(third);
        if (exist(ab, bc, ac)) {
            double p = period(ab, bc, ac);
            result = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return result;
    }
}
