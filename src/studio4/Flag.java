package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color blue = new Color(0, 0, 255);
		StdDraw.setPenColor(blue);
		StdDraw.filledRectangle(0.2, .5, 0.2, 0.5);
		Color red = new Color(255, 0, 0);
		StdDraw.setPenColor(red);
		StdDraw.filledRectangle(0.7, .25, 0.3, 0.25);
		double[]x = new double[] {0.1,0.2,0.3};
		double[]y = new double[] {0.45,0.6,0.45};
		double[]x2 = new double[] {0.1,0.2,0.3};
		double[]y2 = new double[] {0.55,0.4,0.55};
		Color white = new Color(255,255,255);
		StdDraw.setPenColor(white);
		StdDraw.filledPolygon(x,y);
		StdDraw.setPenColor(white);
		StdDraw.filledPolygon(x2,y2);
		
	}
}