package com.syntax.project01;

public class Task4 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */
				
				
				int [][] num={{1,2,3,4},
						{4,5,6},
						{10,20,30,44,33}};
				
				
				for(int i=0; i<num.length; i++) {
				   for(int j=0; j<num[i].length; j++) {
					   if(num[i][j]%2==0) {
						
					  System.out.println(num[i][j]+" ");}
					}
			}

	}

}
