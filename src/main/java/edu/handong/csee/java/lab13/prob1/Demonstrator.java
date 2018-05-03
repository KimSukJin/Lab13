package edu.handong.csee.java.lab13.prob1;
/**
 * This class is main class.
 * @author KimSukJin
 *
 */
public class Demonstrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend friend1 = new Friend(); //instantiating friend1
		Friend friend2 = new ClassFriend(); //instantiating friend2
		Friend friend3 = new SchoolFriend(); //instantiating friend3
		
		InstanceOf.WharFriend(friend1); //prints out which friend is
		InstanceOf.WharFriend(friend2); //prints out which friend is
		InstanceOf.WharFriend(friend3); //prints out which friend is
	}

}
