package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// NESTED IF [if inside another if]
/*
 * if (boolean expression); {// outer if
 * Code A;
 * 
 * when boolean exp is true Java will excecute Code A , if not true Java will excecute 
 * statement outside the If 
 * 
 * if (boolean expression); {
 * Code A;
 * if (boolean expression) { //nestesd /inner if 
 * Code B;
 *}// is both ifs are true it Java will read it 
 *if the first if is false Java will not read anything 
 *if the nested if is false it will olny read the main true one 
 *and whatever code it is outside the block of code 
 *  WHERE WE USE NESTED IF?
 *   when we want to do further checks for example when you fill out your medical 
 *   record for allergies and their types
 *   [one condition depended on another]
 */
		boolean vaccine= false;
		int dose=1;
		if (vaccine) {
			System.out.println("let me check how many doeses you have");
			if (dose ==1) {
				System.out.println("you need one more shot"); // neseted if shoud be inside the {}of the main if
			}}else {
				System.out.println("you are fully vaccinated");
			} // the whole block of code will not be read if outter condition is false
			
		
			
			String month="June";
			int day=8;
			 if (month.equals("May")) {
				 System.out.println("let me check day in May");
				 if (day==8) {
					 System.out.println("today is mothers day ");
				 }}
				 else if (month.equals("June")) {
					 System.out.println("let me check day i June");
				 }
					 if (day==19){
						 System.out.println("it's fathers day");
					}
				}
			 }