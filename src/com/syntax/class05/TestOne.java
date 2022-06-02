package com.syntax.class05;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	
	  Scanner scan=new Scanner(System.in);
		System.out.println("Do you need a loan");
		boolean loan = scan.nextBoolean();
		
		if (loan) {
			System.out.println("What is your credit score");
			int score = scan.nextInt();
			
		if (score<600) {
		System.out.println(“No eligible");
	
		}else if(score>=600&&score<=700) {
			System.out.println(“Maybe eligible”);
		}else if(score>=701&&score<=800) {
			System.out.println(“Eligible”);
		}else if(score>800) {
			System.out.println(“Definitly eligible”);
		
		}
		else {
			System.out.println(“Unknown”);
		}
		}
		}
}