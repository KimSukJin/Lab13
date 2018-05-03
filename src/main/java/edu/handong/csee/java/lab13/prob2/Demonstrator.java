package edu.handong.csee.java.lab13.prob2;
/**
 * This is main class
 * @author KimSukJin
 *
 */
public class Demonstrator {

	public static void main(String[] args) {
		Book book = new Book("Simple Book"); //instantiating book
		Science science = new Science ("Hello Physics! ", "ScienceWorld"); //instantiating science
		History history1 = new History("What is history?", "E.H.Carr"); //instantiating history1
		History history2 = new History("The South Korea", "Judis"); //instantiating history2
		
		book.show(); //prints out information
		science.show(); //prints out information
		history1.show(); //prints out information
		history2.show(); //prints out information
	}

}
