package Base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Triangle extends GeometricObject {
	
	
	 //Three double data fields named side1, side2, and side3 
	 //with default values 1.0 to denote three sides of the triangle.
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	//A no-arg constructor that creates a default triangle.
	public Triangle() {
	}

	//A constructor that creates a triangle with the specified side1, side2, and side3.
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	
	//The accessor methods for all three data fields.
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side2;
	}

	/**
	 * A method named getArea() that returns the area of this triangle.
	 * @return area
	 */
	public double getArea() {
		double s = (double) (getPerimeter() / 2);	
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	/**
	 * A method named getPerimeter() that returns the perimeter of this triangle.
	 * @return perimeter
	 */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	
	/**
	 * A method named toString() that returns a string description for the triangle.
	 *@return string 
	 */
	public String toString() {
		return "Triangle: Area is " + getArea() + " square units and perimeter is " + getPerimeter() + " units.";
	}
}