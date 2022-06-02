package com.syntax.project01;

public class Task3 {

	public static void main(String[] args) {
		/*Create a 2D array of integer values.
		 * Print the sum of all numbers.
		 */
				
				int [][] num={{1,2,3,4},
							{4,5,6},
							{10,20,30,44,33}};
				
				int sum=0;
				for(int[]nums:num) {
						for(int n:nums) {
							sum+=n;
					}
				}
				
				System.out.println("Sum of all elements = "+sum);
			
	}

}
