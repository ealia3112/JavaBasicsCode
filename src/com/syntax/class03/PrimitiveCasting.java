package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// ctrl+space--> it auto completes
		// main ctrl space --> public static void etc
		
		int i=100; 
		double d=100;
		System.out.println(i);//100
		System.out.println(d);//100.0
		/*
		 * Casting in Java-> converting 1 type to another
		 * 
		 *  widening/ implicit/ automatic
		 *  byte->short->int-> long-> float-> double
		 *   putting smaller values on bigger type of values is not an issue
		 *   when we want to store bigger values on smaller variables 
		 *   thats when you get an error 
		 */
	long l=10000;
	
	 long h=190; // dont need an l because is int 
	 long k=57474849494400404l;// this need the l because is truly long
		/*
		 * narrowing/ explicit /manually
		 * double -> float -> long -> int -> char -> short -> byte
		 */
	//int x=100.99; Type mismatch: cannot convert from double to int [error]
	
	int x=(int)99.99; //potenitial loss of information / narrowing 
	// is a bigger vaule (double) being fit into a smaller variable (int)
	
	System.out.println(x);//99
	
	
	//byte b=130; //Type mismatch: cannot convert from int to byte [error]
	// trying to fit int inside a byte [error]
	
	byte b=(byte)130;
	System.out.println(b); // -126 
	
	/*
	 * Widening casting is done automatically when 
	 * passing a smaller size type to a larger size type
	 * 
	 * Narrowing casting must be done manually by placing 
	 * the type in parentheses in front of the value.
	 */
	
	
		
	}
	
		 
	
		

	}


