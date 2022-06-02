package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		/*
		 * we use if else if when we have multiple conditions within one if statement
		 *  nested if -> when we have on condition that is dependent on another condition
		 *  main if has to be true in oder to the console to read , if main if is not 
		 *  true , all nested ifs will not be read
		 *  if{} else if {} , else{}
		 */
		int age = 17;
		int weight = 110;
		if (age >= 18) {
			if (weight >= 110) {
				System.out.println("You are " + age + " years old, and your weight is " + weight + " lbs.");
				System.out.println("You are eligible to be a donor.");
			} else {
				System.out.println(
						"You are " + age + " years old, and your weight is " + weight + " lbs. It is less then 110 lbs.");
				System.out.println("You are not eligible to be a donor.");
			}
		} else {
			System.out.println("You are " + age + " years old, and your weight is " + weight + " lbs.");
			System.out.println("You are not eligible to be a donor. You are younger than 18 years old.");
		}
		
		
		int num1 = 45;
		int num2=44;
		int num3 = 23;
		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.println(num1 + " is largest number");
			} else {
				System.out.println(num3 + " is largest number");
			}
		} else {
			if (num2 >= num3) {
				System.out.println(num2 + " is the largest number");
			} else {
				System.out.println(num3 + " is the largest number");
			}
		}
		
		/*
		 * Scanner- used for user input 
		 * import java.util.Scanner;
		 * Scanner scanner = new Scanner(System.in)
		 * how to create a variable- data type and name
		 * non primitive data type 
		 * shortcut to import scanner 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter name");
		String name=scan.next(); //capure String
		
		System.out.println("Please enter age");
		int age1=scan.nextInt(); //capture int 
		
		System.out.println("Please enter price");
		double price=scan.nextDouble();
		
	    System.out.println("Please enter boolean");
	    boolean boo=scan.nextBoolean();
	    
	    System.out.println("Please enter any charachter");
	    char character=scan.next().charAt(0);
	    
	    
	}
}
	


