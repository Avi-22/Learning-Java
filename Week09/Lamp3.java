// Israeli school
public class Lamp3 {
    private int voltage;
    private String brand;
    private String type;
    private double price;
    private final double originalPrice;
    private boolean isOn;

    public Lamp3(double originalPrice, String brand, String type) {
        this.originalPrice = originalPrice;
        this.brand = brand;
        this.type = type;
        this.voltage = 0;
        this.price = originalPrice;
        this.isOn = false;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getState() {
        return this.isOn;
    }

    public String toString() {
        return "Lamp " + brand + " State is on: " + isOn;
    }

    public void switchState() {
        this.isOn = !this.isOn;
    }
}
