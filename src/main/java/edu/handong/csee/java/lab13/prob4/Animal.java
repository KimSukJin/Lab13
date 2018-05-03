package edu.handong.csee.java.lab13.prob4;
/**
 * This class is super class
 * @author KimSukJin
 *
 */
public class Animal {
	private String name; //instantiating name

	public void getName() {
		System.out.println("Name: " + name);
	} //getting name

	public void setName(String name) {
		this.name = name;
	} //setting name
	
}
