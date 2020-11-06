package vehicle;

public class Transport {
    public static void main(String[] args) {
        Vehicle plane = new AirPlane("777");
        Vehicle plane1 = new AirPlane("707");
        Vehicle bus = new Bus("45");
        Vehicle bus1 = new Bus("1045");
        Vehicle train = new Train("Coupe");
        Vehicle train1 = new Train("SV");
        Vehicle[] vehicles = new Vehicle[]{plane, plane1, bus1, bus, train1, train};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
