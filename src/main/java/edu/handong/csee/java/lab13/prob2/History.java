package edu.handong.csee.java.lab13.prob2;
/**
 * This class is derived from Book
 * @author KimSukJin
 *
 */
public class History extends Book{
	private String Author; //instantiating Author
	
	public History(String Name, String Author) {
		super(Name); // invoking constructor from Book
		this.Author = Author; //instantiating Author in constructor
	}
	public String toString() {
		return super.toString() + "\n\tAuthor: " + Author;
	} //overrides method 'toString' in Book
	public void show() {
		System.out.println("<<<History>>>" + this.toString());
	}//overrides method 'show' in Book
}
