package com.syntax.class03;

public class Homework {

	public static void main(String[] args) {
		
		int month= 7;
		
		 if (month==1) {
			   System.out.println("jan");
			   }else if(month==2){
			    System.out.println("feb");
			   }else if(month==3){
			    System.out.println("march");
			   }else if(month==4){
			    System.out.println("april");
			     }else if(month==5){
			    System.out.println("may");
			    }else if(month==6){
			    System.out.println("june");
			    }else if(month==7){
			    System.out.println("july");
			    }else if(month==8){
				    System.out.println("august");
			     }else if(month==9){
			    System.out.println("sept");
			    }else if(month==10){
			    System.out.println("oct");
			    }else if(month==11){
			    System.out.println("nov");
			    }else if(month==12){
				    System.out.println("dec");
				    }
		 // condition is always a boolean 
		 
		 int number=-7;
		 if (number>0){
			 System.out.println(number +" is positive");
		 }else if (number==0) { // alwasys need a boolen expression [==; !=; etc]
			 System.out.println(number+" is not positive or negative");
		 }else {
			 System.out.println(number+" is negative");
		 }
			
	}
	
}

