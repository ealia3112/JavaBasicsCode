package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		/*
		 *  create 2 d arrays of states
		 *  1 array NY-->all cities
		 *  2 array CA
		 *  3 array FL
		 *  4 array VA
		 *  
		 */
 String [][] usa = {
		 
		 {"New York", "Albany", "Buffalo"},
		 {"Los Angeles"," San Diego","San Jose"},
		 {"Miami","orlando","Tampa"},
		 {"Alexandria","Richmond", "Leesburg"},
 }; 
		System.out.println(usa [1][2]); // san jose
		  System.out.println(usa [2][0]);// Miami
		 
		 System.out.println("total num of 1D arrays is usa is "+usa.length);//4
		 
 int elem1array=usa[0].length;
  System.out.println("# of elements on first array "+ elem1array);//3
		
	int elem2array=usa[1].length;
	System.out.println("# of elements on second array "+ elem2array);//3
	}

}
