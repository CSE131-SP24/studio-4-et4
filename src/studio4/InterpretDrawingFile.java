package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		System.out.println(shape);
		boolean filled = in.nextBoolean();
		double[] x = new double[] {in.nextDouble(),in.nextDouble(),in.nextDouble()};
		double[] y = new double[] {in.nextDouble(),in.nextDouble(),in.nextDouble()};
		

//		double doublex = in.nextDouble();
//		double doubley = in.nextDouble();
//		double halfW = in.nextDouble();
//		double halfH = in.nextDouble();

		StdDraw.setPenColor(red,green,blue); 
		if (filled = true) {
			if (shape.equals("ellipse")) {
				StdDraw.filledEllipse(x[0], x[1], x[2], y[0]);
			}
			if (shape.equals("rectangle")) {
				StdDraw.filledRectangle(x[0], x[1], x[2], y[0]);
			}
			if (shape.equals("triangle")) {
				StdDraw.filledPolygon(x,y);
			}
		}
		else {
			if (shape.equals("ellipse")) {
				StdDraw.ellipse(x[0], x[1], x[2], y[0]);
			}
			if (shape.equals("rectangle")) {
				StdDraw.rectangle(x[0], x[1], x[2], y[0]);
			}
			if (shape.equals("triangle")) {
				StdDraw.polygon(x,y);
			}
		}

	}
}
