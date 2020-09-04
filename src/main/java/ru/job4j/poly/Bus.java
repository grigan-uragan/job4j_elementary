package ru.job4j.poly;

public class Bus implements Transport {
    private static final double DIESEL = 49.75;

    @Override
    public void drive() {
        System.out.println("Be careful, close the door! Next station Gorky Park");
    }

    @Override
    public void passengers(int pax) {
        System.out.println("Passengers in bus " + pax);
    }

    @Override
    public double refuel(int litres) {
        return litres * DIESEL;
    }
}
