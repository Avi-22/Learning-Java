// International School Recitation 1 9:45
import java.awt.Color;
public class Lamp1 {
    private int shamashPos; // 9 
    private boolean [] areLit;
    private Color color;
    // private double size;
    private double price;
    private final double originalPrice;
    private String owner;
    

    public Lamp1 (){
        this.areLit = new boolean [9];
        this.shamashPos = 0;
        this.color = Color.PINK;
        this.owner = "Itai";
        this.price = 1000;
        this.originalPrice = 1000;
    }
    public Lamp1 (Color color, String owner, double price){
        if (price < 0){
            throw new IllegalArgumentException("The price must be bigger than 0");   
        }
        this.areLit = new boolean [9];
        this.shamashPos = 0;
        this.color = color;
        this.owner = owner;
        this.price = price;
        this.originalPrice = price;
    }
    public Lamp1 (Color color, String owner, double price, int shamashPos){
        if (price < 0){
            throw new IllegalArgumentException("The price must be bigger than 0");   
        }
        this.areLit = new boolean [9];
        this.shamashPos = shamashPos;
        this.color = color;
        this.owner = owner;
        this.price = price;
        this.originalPrice = price;
    }
    public Lamp1 (String owner, double price){
        this(Color.BLUE, owner, price);
    }
    public boolean [] getAreLit() {
        return this.areLit;
    }
    public double getPrice() {
        return this.price;
    }
    private void setAreLit(boolean lighted, int index) {
        this.areLit[index] = lighted;
    }
    public void setCandlesState(int index) {
        this.setAreLit(!this.areLit[index], index);
    }
    public void lightUpHanukiya (int candles){
        if (candles >= 0 && candles <= 8){
            this.areLit[shamashPos] = true;
            int count = 0;
            for (int i = 0; i < this.areLit.length; i++) {
                if (count <= candles && !this.areLit[i]){
                    count++;
                    this.setCandlesState(i);
                } 
            }
            System.out.println("Maoz tsur yeshuati...");
        }        
    }
    public void setCost (double cost, int mode){
        if (mode == 0){
            // precent
            this.setPriceByPercent(cost);
            return;
        } 
        if (mode == 1) {
            this.setPrice(cost);
            return;
        } 
        if (mode == 2){
            this.revert();
            return;
        }
    }
    private void setPriceByPercent (double price){
        if (price >= 1){
            this.price = this.getPrice() * price;
        } else {
            this.price = (1 - price) * this.getPrice();
        }
    }
    private void revert(){
        this.price = this.originalPrice;
    }
    private void setPrice(double price){
        this.price = price;
    }
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("owner :" ).append(this.owner );
        sb.append(", price :" ).append(this.price );
        sb.append(", color :" ).append(this.color );
        sb.append(", candles :" ).append(arrayToString(this.areLit));
        return sb.toString();
    }

    public static String arrayToString(boolean [] candles){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < candles.length; i++) {
            sb.append(i);
            sb.append(" : ");
            sb.append(candles[i]);
            if (i == candles.length -1){
                sb.append("}");
            } else {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /// setter to price which changes by precent
    /// setter total price
    public static void main(String[] args) {
        Lamp1 lamp = new Lamp1();
        Lamp1 lampA = new Lamp1("Dana",100);
        Lamp1 lampB = new Lamp1(Color.MAGENTA,"Aviad",5);
        System.out.println(lamp); 
        System.out.println(lampA); 
        System.out.println(lampB); 
    }
}
