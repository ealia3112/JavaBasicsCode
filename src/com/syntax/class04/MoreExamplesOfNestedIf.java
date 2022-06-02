package com.syntax.class04;

public class MoreExamplesOfNestedIf {

	public static void main(String[] args) {
		/*we need to check if repilt was completed
		 *  if replit is completed we want to see
		 *  if you did 15 and more--> great job
		 *  if you did more than 10-->good
		 *  less than 10--> try to complete all assignments
		 */
      boolean didRepl= true;
      int assignments;
      if (didRepl) {
    	  System.out.println("how many assignments have you done");
    	  assignments=17;
    	  if (assignments>15) {
    		  System.out.println("great job");
    	  } else if (assignments>10) {
    		  System.out.println("good job");
    	  }else {
    		  System.out.println("please complete all your homework");
    	  }
    		 
    	 
      }else {
    	  System.out.println("you should omplete your homework");
      }

		
		
		
		
	}

}
