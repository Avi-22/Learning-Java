// The lamp in the slides
import java.awt.Color;
public class Lamp {
    // Fields \ Properties \ Attributes
    private int voltage;
    private String brand;
    private double price;
    private final double originalPrice;
    private boolean isOn;
    private Color light; 
    private Color color; 

    // Constructor
    public Lamp(int voltage, String brand, double price, boolean isOn, Color light, Color color) {
        this.voltage = voltage;
        this.brand = brand;
        this.price = price;
        this.originalPrice = price;
        this.isOn = isOn;
        this.color = color;
        this.light = light;
    }

    public Lamp(int voltage, String brand, double price) {
        this.voltage = voltage;
        this.brand = brand;
        this.price = price;
        this.originalPrice = price;
        this.isOn = false;
        this.color = Color.ORANGE;
        this.light = Color.YELLOW;
    }

    public Lamp(int voltage, String brand) {
        this(voltage, brand, 75, false, Color.BLUE, Color.BLUE);
    }

    // getters
    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public String isLightOn() {
        return this.isOn ? "On" : "Off";
    }

    // setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /*
     T -> F
     F -> T
     */
    public void switchOnOff() {
          this.setIsOn(!this.isOn);
    }
    private void setIsOn(boolean other){
	this.isOn = other;
   }
    public void setPrice(double value, boolean isTotalChange) {
        if (isTotalChange) {
            totalChange(value);
        } else {
            changePrecent(value);
        }
    }

    private void changePrecent(double precent) {
        double newPrecent = precent / 100;
        if (newPrecent <= 0) {
            return;
        }
        if (newPrecent < 1) {
            this.price = this.price * (1 - newPrecent);
        } else {
            this.price = this.price * newPrecent;
        }
    }

    private void totalChange(double value) {
        if (value <= 0) {
            return;
        }
        this.price = value;
    }

    public void revertPrice() {
        this.price = this.originalPrice;
    }



    public String toString() {
        return "Lamp : \nvoltage:" + this.voltage + ", brand: " + this.brand + ", price: " + this.price + ", state: " + this.isLightOn();
    }
}
