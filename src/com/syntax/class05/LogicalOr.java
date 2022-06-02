package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/*
		 * Monday and Friday -> No Class 
		 * Tuesday and Wednesday -> Manual Testing
		 * thursday -> Review
		 * Sturday and Sunday-> Java
		 * we want for a logical OR if we want at least one of the conditions to be true
		 */
       String day="Monday";
       
       if(day.equals("Monday")|| day.equals("Friday")) {
    	  System.out.println("I have no class"); 
    	  
       }else if (day.equals("Tuesday")|| day.equals("Wednesday")) {
    	   System.out.println("I have manual testing class");
    	   
       }else if (day.equals("Thursday")){
       System.out.println("I have review class");
       
	   }else if (day.equals("Saturday")|| day.equals("Sunday")){
		   System.out.println("I have Java Class");
	   }
	
	/*
	 * Prompt the user to enter person heights in inches. Person should be classified as one of the following:
       short (under 60 inch)
        medium(between 60 -72 inch)
          tall (over 72 inch) 
           
	 */
		int height= 59;
		 
		if (height<60) {
			System.out.println("you are short");
		}else if (height >=60 && height	<=72) {
			System.out.println("you are medium");
		}else if (height>72) {
			System.out.println("you are tall");
		}
   
			}
	
	}
  


