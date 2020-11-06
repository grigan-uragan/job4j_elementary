package vehicle;

public class AirPlane implements Vehicle {

    private String flightNumber;

    public AirPlane(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public void move() {
        System.out.println("flight number: " + flightNumber +  "ready to take off, fasten your seat belts");
    }
}
