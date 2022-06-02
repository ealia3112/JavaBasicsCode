package com.syntax.class03;

public class RelationalOperations {

	public static void main(String[] args) {

//<,>,<=, >=, ==[equality], !=[not equal]
		int num1=20;
		int num2=22;
		System.out.println(num1>num2); // false
		System.out.println(num1<num2);//true
		System.out.println(num1!=num2); //true
		
		// result will always be boolean value 
		
		System.out.println(num1==num2); // no = false  // equality operator
		System.out.println(num1=num2);// 22 reassigning the value of num2 to num1
		
		System.out.println(num1==num2); // true bc now num1 is equal to num2 (22)
		
		boolean result=100>200; 
		System.out.println(result);//false
		 
		int result1=100+200;
		System.out.println(result1); //300
		
		String result2="Emre"+10;
		System.out.println(result2);//Emre10
		
		int num3=10;
				int num4=11;
		result=num3==num4;
		System.out.println(result); //false
		
		result=num3!=num4;
		System.out.println(result);// true
		
		/*
		 * result1=num3!=num4; error bc resukt 1 is an int and result=num3!=num4;
		System.out.println(result);

		 */
		
				
	}

}
