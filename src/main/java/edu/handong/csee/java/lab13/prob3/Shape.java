package edu.handong.csee.java.lab13.prob3;
/**
 * This is super class
 * @author KimSukJin
 *
 */
public abstract class Shape {
	public abstract double area(); //instantiating area
	public abstract double perimeter(); //instantiating perimeter
	public void display() {
		System.out.println("Area: " + area() + "\nPerimeter: " + perimeter() + "\n");
	} //prints out area and perimeter
}
