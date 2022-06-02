package com.syntax.class10;

public class TwodArrays {

	public static void main(String[] args) {
		// TO CREATE 2D ARRAY WE WILL SPECIFY NUMBER OF ROWS AND COLS=SIZE
		int [][] numbers =new int[3][4];
		// 1 row
		
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		//2 row 
		numbers[1][0]=1;
		numbers[1][1]=2;
		numbers[1][2]=3;
		numbers[1][3]=4;
		//3 
		numbers[2][0]=9;
		numbers[2][1]=8;
		numbers[2][2]=7;
		numbers[2][3]=6;
		
		System.out.println(numbers[1][3]);//4
		System.out.println(numbers [0][1]);//20
		// it will show me how many numbers of rows we have (3)
		int rows=numbers.length;
 System.out.println("Number of rows="+ rows);
	}
 //int colsOf1row= numbers[0].length;
   
 
 
}
