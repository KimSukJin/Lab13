package edu.handong.csee.java.lab13.prob4;
/**
 * This class is derived from Animal
 * @author KimSukJin
 *
 */
public class Dog extends Animal implements Pet{

	@Override
	public String food() {
	
		return "(Dog!)" + "Sausage"; //print out
	} //it overrides method 'food' in Master

}
