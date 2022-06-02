package com.syntax.project01;

public class task10 {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array
		
				int[] array= {1,2,3,4,5,6};
				int max=0;
				int scdMax=0;
				
				for(int i=0; i<array.length; i++) {
					if(array[i]>max) {
						scdMax=max;
						max=array[i];
					}else if(array[i]>scdMax) {
						scdMax=array[i];
					}
				}
				System.out.println("The second largest number in the array is "+scdMax);
				
			}
		

	}

}
