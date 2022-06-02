package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// && operation all should be true if only one if false all is false

		boolean study=true;
		boolean homework=true;
		boolean practice=true;
		
		if(study&&homework&&practice) {
			System.out.println("you will succed in the course");
			}else {
				System.out.println("you will struggle");
			}
		int num1=65;
		int num2=66;
		int num3=23;
		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is " + num1);
			
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("The largest number is " + num3);
			
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The largest number is " + num2);
		}

	}
}
