import java.awt.Color;

/**
 * Demonstrates the morphing service of Instush.java.
 * The program recieves three command-line arguments: the name of a PPM file
 * that represents the source image (a string), the name of a PPM file that
 * represents
 * the target image (a string), and the number of morphing steps (an int).
 * For example:
 * java Editor3 cake.ppm ironman.ppm 300
 * If the two images don't have the same dimensions, the program scales the
 * target image
 * to the dimensions of the source image.
 */
public class Editor3 {

	public static void main(String[] args) {
		Color[][] source = Instush.read(args[0]);
		Color[][] target = Instush.read(args[1]);
		int morphing = Integer.parseInt(args[2]);
		if (source.length != target.length || source[0].length != target[0].length) {
			Color[][] newTarget = Instush.scaled(target, source[0].length, source.length);
			Instush.morph(source, newTarget, morphing);

		} else {
			Instush.morph(source, target, morphing);
		}
		
	}
}
