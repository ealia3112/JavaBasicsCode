package com.syntax.class02;

public class ArithmetalOperators {

	public static void main(String[] args) {

    int num1=10;
    int num2=20;
    int sum, sub, mult, div;
    
    System.out.println(num1+num2); //this is not stored anywhere
    
    sum=num1+num2;
    System.out.println(sum);
 
    sub=num1-num2;
    System.out.println(sub);
		
	mult=num1*num2;
	System.out.println(mult);
	
	double num3=9.99;
	double num4=3.50;
	 double sum1, sub2, mult3, div4;
	 
	 sum1=num3+num4;
	 int a=10;
	 int b=3;
	 int result=a/b;
	 System.out.println(result); //result will be 3 because is int(whole number)
	 // try not to use int for division
	 
	 
	 double c=10.0;
	 double d=3.0;
	 double result2=c/d;
	 System.out.println(result2); //result will be 3.33333 -
	 
	 /*
	  * float will give you accuracy up to 6 digits
	  * double will give you accuracy up to 16 
	  * industry uses duouble more 
	  */
	 
	 float e=10.0f;
	 float f=3.0f;
	 float result3=e/f;
	 System.out.println(result3);// result will be 3.33333333335
	 
	 
	  
	 
	 
			 
	
	

	}

}
