package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;
/**
 * This is main class
 * @author KimSukJin
 *
 */
public class Master {
	public void feed(Pet pet) {
		System.out.println("feed: " + pet.food());
	} //prints out what animal feed
	
	public static void main (String[] args) {
		String cat_name, dog_name; //instantiating cat name and dog name
		
		Master master = new Master(); //instantiating master
		Cat cat = new Cat(); //instantiating cat
		Dog dog = new Dog(); //instantiating dog
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the cat name and dog name: "); 
		cat_name = keyboard.next(); //getting input to cat name
		dog_name = keyboard.next(); //getting input to dog name
		
		cat.setName(cat_name);
		cat.getName();
		master.feed(cat); //print out
		
		dog.setName(dog_name);
		dog.getName();
		master.feed(dog); //prints out
	}
}
