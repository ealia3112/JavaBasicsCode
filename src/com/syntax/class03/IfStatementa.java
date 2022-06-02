package com.syntax.class03;

public class IfStatementa {

	public static void main(String[] args) {
		
		/*Conditional Statemtents
		 * 1-if statements
		 * declare a variable rate
		 * if rate is more than 5--> I am not bying a house 
		 */
		//Use the if statement to specify a block of
		//Java code to be executed if a condition is true.
		
		double mortageRate=5.5;
		if (mortageRate>5) {
			System.out.println(" I am not bying a house");
		}
		 /*
		  *  only when condition is true Java will allow to enter block of code->{}
		  *  (mortageRate>5) --> condition
		  *  if condition is false java wont read the statement " I am not
		  *   bying a house"
		  */
		// declafre 2 variables and check if num1 is > than num2
		int num1=99;
		int num2=10;
		
		if (num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		} // condition is true so Java will exececute in console
		
		/*
		 *  declare a temperature - if temp is higher than 75  i will go for a walk 
		 */
		
        int temp=68;
		
		if (temp>75){// code goes inside if {}
			         // when condition is true
			System.out.println("I will go for a walk");
			
		}else {// otherwise. Code comes to else{}
			   // when condition is false
			System.out.println("I am going to study Java");}
			
			/*
			 * Use if to specify a block of code to be executed,
			 *  if a specified condition is true
             *Use else to specify a block of code to be executed,
              *if the same condition is false
			 */
		
			
			char gender='m';
			if(gender=='f') {
				System.out.println("I dont like to go for shoping");
			}else {
				System.out.println("I want to go for walking");}
			
			

		String browser="chrome";
		 if (browser.equals("chrome")) {
		 System.out.println("all test will be excecuted on chrome");
		 }else {  
			System.out.println("i am not doing tests"); // with string dont use realtions operations
		}
	}
}
