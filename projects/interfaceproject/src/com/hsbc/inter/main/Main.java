package com.hsbc.inter.main;

import java.nio.ReadOnlyBufferException;

import com.hsbc.inter.Rectangle;
import com.hsbc.inter.Shape;
import com.hsbc.inter.Square;

public class Main {
	final static double CARPET_RATE = 100;
	final static double PAINT_RATE = 50;

	public static void main(String[] args) {
		Rectangle r = new Rectangle(12, 10);
		calculate(r);

		Square s = new Square(15);
		calculate(s);
	}

	static void calculate(Shape s) {
		double area = s.getArea();
		double peri = s.getPeri();

		double paintCost = peri * PAINT_RATE;
		double carperCost = area * CARPET_RATE;

		System.out.println("Cost of Carpetting: " + carperCost);
		System.out.println("Cost of Painting: " + paintCost);
		System.out.println("Total Cost:" + (carperCost + paintCost));

	}

}
