package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;
/**
 * This is main class
 * @author KimSukJin
 *
 */
public class Demonstrator {
	public static void main(String []args) {
		double n1, n2; //instantiating n1 and n2
		Scanner keyboard = new Scanner(System.in); //keyboard for input
		
		System.out.println("Enter radius: "); //prints out message
		n1 = keyboard.nextDouble(); //input to n1
		Circle c1 = new Circle(n1); //instantiating c1
		
		System.out.println("Radius: " + c1.get_Radius()); //prints out radius
		c1.display(); //prints out area and perimeter
		
		System.out.println("Enter length and width: "); //prints out message
		n1 = keyboard.nextDouble(); //input to n1
		n2 = keyboard.nextDouble(); //input to n2
		Rectangle r1 = new Rectangle(n1,n2); //instantiating r1
		
		System.out.println("Length: " + r1.get_Length()); //prints out length
		System.out.println("Width: " + r1.get_Width()); //prints out width
		r1.display(); //prints out area and perimeter
	}
}
