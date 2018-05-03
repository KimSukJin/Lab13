package edu.handong.csee.java.lab13.prob2;
/**
 * This is super class.
 * @author KimSukJin
 *
 */
public class Book {
	private static int idCount = 0; //instantiating idCount
	private String BookName; //instantiating BookName
	private int id; //instantiating id
	
	public Book(String Name) {
		this.BookName = Name; 
		idCount++; //idCount plus 1
		id = idCount; //idCount is id
	}
	
	public String toString() {
		return "\n\tId:  " + id + "\n\tBook Name:  " + BookName;
	} //returns information of book
	
	public void show() {
		System.out.println("<<<Book>>>"  + this.toString());
	} //prints out id and BookName
}
