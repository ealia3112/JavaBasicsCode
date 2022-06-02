package com.syntax.class04;

public class Task {

	public static void main(String[] args) {
		
		boolean diploma= true;
		 int gpa=4;
		if (diploma) {
			System.out.println("congratulaions");
			if (gpa>=3.5) {
				System.out.println("you are eligible for scholarship");
			} else if (gpa<3.4) {
				System.out.println("you should've studied harder");
			}
		}else {
			System.out.println("get a degree");
		}
		
		int price=500000;
		int rate=5 ;
		 if (rate>4.5) {
			 System.out.println("user will not buy a house");
		  if (price>50000) {
			  System.out.println("user will take a loan");
		  } else if (price<50000) {
			  System.out.println("user will pay cash");
		  }
		 } else {
			 System.out.println("user will consider bying");
		 }
		 }
	
		
	}


