package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// scanner will giev yu the ability to type in console and grap it and send it to the coding window

		String str="hello";
		// Scanner is a non primitive data type
		// creating a scanner
		Scanner input= new Scanner(System.in);
		// send instruction to the console
		System.out.println("please enter your name");
		
		 // make sure to enable console to grab the value from console
		 
		String name =input.next(); // after you type the value scanner will grab it 
		System.out.println(name);
		
		// let's send instructions 
		System.out.println(name=" please enter your age");
		
		// need to capture and store age
		int age=input.nextInt();
		System.out.println(name+" is "+age+" years old ");
	}

}
