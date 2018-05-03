package edu.handong.csee.java.lab13.prob3;
/**
 * This class is derived from Shape
 * @author KimSukJin
 *
 */
public class Rectangle extends Shape {
	private double length; //instantiating length
	private double width; //instantiating width
	public Rectangle (double length, double width)
	{
		this.length = length; //instantiating length
		this.width = width; //instantiating width
	} //constructor rectangle has length and width
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width; 
	} //override method 'area' in shape

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length + width);
	} //override method 'perimeter' in shape
	
	public double get_Length() {
		return length;
	} //getting length
	
	public double get_Width() {
		return width;
	} //getting width

}
