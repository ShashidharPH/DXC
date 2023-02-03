 package Test;

import java.util.*;
import static java.lang.Math.*;

public class Circle {
	private final double PI = 3.14;
	private double diameter;
	private double circumference;
	private double area;

	public Circle(double diameter) {
		this.diameter = diameter;
	}

	void calculateCircumference() {
		circumference = PI * diameter;
		System.out.println("circumference is :" + circumference);
	}

	void calculateArea() {

		area = PI * (diameter / 2) * (diameter / 2);
		System.out.println("Area  is :" + area);
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public static void main(String[] args) {
		 
		 Circle C1 = new Circle(10.2);
		 Circle C2 = new Circle(5.7);
		 //Create more objects of Circle class and add to the array given below for testing your code 
		 Circle[] circles = {C1, C2};
		 for (Circle circle : circles) {
		 circle.calculateCircumference();
		 circle.calculateArea();
		 System.out.println("Diameter of the circle is "+circle.getDiameter());
		// System.out.println("Circumference of the circle is " + Math.round(circle.getCircumference()*100)/100.0);
		 System.out.println("Area of the circle is " + Math.round((circle.getArea()*100)/100.0));
	      System.out.println("");
		}
		 
	}
}

