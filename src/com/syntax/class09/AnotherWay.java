package com.syntax.class09;

public class AnotherWay {

	public static void main(String[] args) {
 
		String [] fruits= {"mango", "apple", "kiwi","pear"};
		
		System.out.println(fruits[2]);
     //fruits[4]="peach"; run time error ArrayIndexOutOfBoundsException: 
		System.out.println("My favorite fruit is "+ fruits[0]);
		
		// i want to find a size of an array / how many elements?
		
		int size= fruits.length;
		System.out.println(size);
	}

}
