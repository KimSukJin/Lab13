package edu.handong.csee.java.lab13.prob4;
/**
 * This class is derived from Animal
 * @author KimSukJin
 *
 */
public class Cat extends Animal implements Pet{

	@Override
	public String food() {
		
		return "(Cat!)" + "Fish"; //print out
	} //it overrides method 'food' in Master
	
}
