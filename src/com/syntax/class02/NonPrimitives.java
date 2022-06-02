package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Oleg";
		
		String lastName= "Smith";
		
		long phone= 1234567892l;
		// xxx-xxx-xxxx if i add the dashes wich is not numeric we use string
		 
		String phoneNumber= "123-234-4567";
		
		String address= "123 Washington str";
		
		// int age="10"; // if we use "" is always a String is not int anymore
		 
		String age="10";
		String city= "Miami";
		age="30";
		
				//shortcut for printing 
		// type syso+ ctrl + space--> hit enter 
		/*
		 * when we want to attach string to string we can use +
		 * string to string 
		 * string to int 
		 * string to double 
		 * to any other type  
		 */
		
		System.out.println(name+" "+ lastName);// Oleg Smith 
		
		//oleg lives in miami 
		System.out.println(name+" lives in "+city);
		
		// Oleg is 10 years old 
		
		System.out.println(name+" is "+ age+" years old ");
		
		
		
		/*
		 * Rules for identifiers
		 * 1-no space
		 * 2-no keywords
		 * 3-cannot start with numbers(number can be used only after the name)
		 * 4- cannot have special charachters (%, !) it will allow only ($ and_)
		 * example String break="Hello"; - wont work ,error
		 */
	
		int number1=10;
		
		//int number%=10; error
		double $price=3.99;
		float f_=2.09f;
		
		/*
		 * Preferences --Naming Conventions
		 * follow camel casings
		 * variable/methods names should start with lover case and then follow camel casing 
		 * class names should start with upper case 
		 */
		
		//String mycity="Tysons";(not preferable) 
		//String myCity="Tysons"; (preferable)
		
		
		

	}

}
