// International School Recitation 2 11:45
import java.awt.Color;
public class Lamp2 {
    private boolean isOn;
    private Color color; 
    private int watts;
    private String kind;
    private double cost; 
    private final double ogCost; 

    
    public Lamp2 () {
        this.isOn = false;
        this.color = Color.WHITE;
        this.watts = 100;
        this.kind = "Street";
        this.cost = 10;
        this.ogCost = this.cost;
    } 
    public Lamp2 (Color color, String kind, double cost) {
        if (cost <= 0){
            throw new IllegalArgumentException("Please, pass a cost bigger than 0");
        }
        this.isOn = false;
        this.watts = 100;
        this.color = color;
        this.kind = kind;
        this.cost = cost;
        this.ogCost = cost;
    }
    public Lamp2(Color color, String kind){
        this(color,kind,1);
    }

    public double getCost(){
        return this.cost;
    }
    public String getKind(){
        return this.kind;
    }
    public Color getColor(){
        return this.color;
    }
    public boolean checkIsOn(){
        return this.isOn;
    }
    public void flip(){
        this.setIsOn(!this.checkIsOn());
    }
    private void setIsOn (boolean isOn){
        this.isOn = isOn; 
    }
    public void setCost (double cost, int mode){
        if (mode == 0){
            // precent
            this.setCostByPercent(cost);
            return;
        } 
        if (mode == 1) {
            this.setCost(cost);
            return;
        } 
        if (mode == 2){
            this.revert();
            return;
        }
    }
    private void setCostByPercent (double cost){
        if (cost >= 1){
            this.cost = this.getCost() * cost;
        } else {
            this.cost = (1 - cost) * this.getCost();
        }
    }
    private void revert(){
        this.cost = this.ogCost;
    }
    private void setCost(double cost){
        this.cost = cost;
    }

    // PARTY MODE
    public void partyMode(int seconds){
        if (this.isOn){
            this.flip();
        }
        for (int i = 0; i < seconds * 2; i++) {
            if (i % 2 == 0){
                this.setRandomColor();
            }
            this.flip();
            System.out.println(this.isOn ? "On": "Off");
            if (i % 2 == 0){
                System.out.println("Party time : r:" +  color.getRed() + " b:"+ color.getBlue() + "g:" +color.getGreen() );
            } 
        }
    }

    public void setColor(Color color){
        this.color = color;
    }
    public void setColor(int red, int blue, int green){
        this.color = new Color (red, blue, green);
    }
    public void setRandomColor(){
        this.setColor(this.randomInColorRange(), this.randomInColorRange(), this.randomInColorRange());
    }

    public int randomInColorRange(){
        return (int) (Math.random() * 256);
    }

    public boolean equals(Lamp2 other){
        return this.cost == other.getCost() && this.color.equals(other.getColor()) && this.kind.equals(other.getKind());
    }
    // equals
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("kind : ").append(this.kind);
        sb.append(", color : ").append(this.color);
        sb.append(", cost : ").append(this.cost);
        sb.append(", isOn : ").append(this.isOn);
        return sb.toString();
    }
    public static void main(String[] args) {
        Lamp2 lamp = new Lamp2();
        Lamp2 lampA = new Lamp2(Color.PINK, "Spotlight", 1000);
        Lamp2 lampB = new Lamp2(Color.GRAY, "Creepy Basement Lab");

        System.out.println(lamp);
        System.out.println();
        System.out.println(lampA);
        System.out.println();
        System.out.println(lampB);
    }
}   
