import java.awt.Color;
/**
 * Demonstrates three Instush.java services: flipping an image horizontally, flipping an image 
 * vertically, and greyscaling an image.
 * 
 * The program recieves two command-line arguments: the name of the PPM file that represents 
 * the source image (a string), and one of the strings "fh", "fv", or "gs" (a string). The program
 * creates and displays a new image which is either the horizontally flipped version of the source
 * image ("fh"), or the vertically flipped version of the source image ("fv"), or the greyscaled 
 * version of the source image ("gs"). For example: 
 * java Editor1 thor.ppm gs
 */
public class Editor1 {
	// "C:\Users\avrah\OneDrive\מסמכים\GitHub\Learning-Java\HW 5\images\thor.ppm"
	// "HW 5\images\thor.ppm"
	public static void main (String[] args){
		Color [][] image = Instush.read(args[0]);
		switch (args[1]){
			case "fh":
			  image = Instush.flippedHorizontally(image);
			  break;
			case "fv":
				image = Instush.flippedVertically(image);
				break;
			case "gs":
				image = Instush.greyscaled(image);
				break;
		}
		Instush.show(image);
	}							
}
