package edu.handong.csee.java.lab13.prob2;
/**
 * This class is derived from Book
 * @author KimSukJin
 *
 */
public class Science extends Book{
	private String publisher; //instantiating publisher
	
	public Science(String Name, String Publisher) {
		super(Name); // invoking constructor from Book
		this.publisher = Publisher; //instantiating Publisher in constructor
	}
	public String toString() {
		return super.toString() + "\n\tPublisher" + publisher;
		
	} //overrides method 'toString' in Book
	public void show() {
		System.out.println("<<<Science>>>" + this.toString());
	} //overrides method 'show' in Book

}
