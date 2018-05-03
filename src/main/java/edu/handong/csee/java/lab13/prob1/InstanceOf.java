package edu.handong.csee.java.lab13.prob1;
/**
 * This class gather all types of fiends.
 * @author KimSukJin
 *
 */
public class InstanceOf {
	public static void WharFriend(Friend friend) {
		if(friend instanceof ClassFriend)
			((ClassFriend) friend).classFriend(); //when Instanceof is ClssFriend 
		else if(friend instanceof SchoolFriend)
			((SchoolFriend) friend).schoolFriend(); //when Instanceof is SchoolFriend
		else
			friend.JustFrined(); //when Instanceof is JustFriend
	}

}
