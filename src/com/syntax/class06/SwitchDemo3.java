package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		/*
		 *  let's ask a user where is he from 
		 *  based on the country we will define favorite food 
		 */
	Scanner scan= new Scanner(System.in);
	String country, favoriteFood;
	System.out.println("Please tell me where are you from");
	 country=scan.nextLine();
	 
	 switch (country) { // (country.toLowerCase()) or (country.toUpperCase())
	 case "Mexico":
		 favoriteFood="tacos";
		 break;
	 case "Canada":
	 favoriteFood="poutine";
	 break;
	 case "Turkey":
		 favoriteFood="lahmacun";
		 break;
	 case "Albania":
		 favoriteFood="byrek";
		 break;
	 case "USA":
		 favoriteFood="burgers";
		 break;
		 default:
			 favoriteFood="Unknown";
	 // we can skip break on deafault when is the very last code
	// ignoreCase does not work with switch		 
	 }
	System.out.println("you are from "+country+ " and your favorite food is "+ favoriteFood);
	}

}
