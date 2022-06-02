package com.syntax.class07;

public class WhileLoopsExamples {

	public static void main(String[] args) {
		
		int num=-1;
		 
		while (num<=-10) {
			num++;
			System.out.println(num+" ");
		}
		// print numbers from 10 to 100
		
		int a=10;
		
		while (a<=100) {
			System.out.print(a+" ");
			a++;
		}
		
		int b=100;
		 while (b>=50) {
			 System.out.print(b+"");
			 b--;
		 }
// 1st way 
		 int e=2;
			while(e<=20) {
				System.out.print(e+" ");
				e+=2;
			}
			System.out.println();
	// 2nd way 
			int f=1;
			if (f%2==0) {
			while (f<=20) {
			System.out.print(f+" ");
			}
			f++;
			}
			
			
			
	}
	

}
