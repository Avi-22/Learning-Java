import java.awt.Color;
public class Editor4 {
    public static void main(String[] args) {
        Color[][] image = Instush.read(args[0]);
        Color[][] gsImage = Instush.greyscaled(image);
        int num = Integer.parseInt(args[1]);
        Instush.morph(image, gsImage, num);
    }
}
