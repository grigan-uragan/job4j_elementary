package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        load = charge;
    }

    public void exchange(Battery another) {
        this.load += another.load;
        another.setLoad(0);
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int level) {
        this.load = level;
    }

    public static void main(String[] args) {
        Battery first = new Battery(15);
        Battery second = new Battery(10);
        System.out.println("After:\n First battery level: " + first.getLoad()
                + " Second battery level: " + second.getLoad());
        first.exchange(second);
        System.out.println("Before:\n First battery level: " + first.getLoad()
                + " Second battery level: " + second.getLoad());
    }
}
