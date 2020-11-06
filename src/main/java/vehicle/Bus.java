package vehicle;

public class Bus implements Vehicle {
    private String routeNumber;

    public Bus(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    @Override
    public void move() {
        System.out.println("Автобус едет по маршруту номер: "
                + routeNumber
                + " Граждане!!! Передаем за проезд!!!");
    }
}
