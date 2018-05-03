package edu.handong.csee.java.lab13.prob3;
/**
 * This class is derived from Shape
 * @author KimSukJin
 *
 */
public class Circle extends Shape {
	private double radius; //instantiating radius
	public Circle(double r)
	{
		radius = r;
	} //constructor Circle has double perimeter
	@Override
	public double area() {
		
		return Math.PI * Math.pow(radius, 2); //PI * r * r
	} //override method 'area' in shape

	@Override
	public double perimeter() {
		
		return 2.0 * Math.PI * radius; //2 * PI * radius
	} //override method 'perimeter' in shape
	public double get_Radius() {
		return radius;
	} //getting radius
}
