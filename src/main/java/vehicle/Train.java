package vehicle;

public class Train implements Vehicle {
    private String type;

    public Train(String type) {
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println("This is " + type + "! Attention please, next station Moscow central station!");
    }
}
