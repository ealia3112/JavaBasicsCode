package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char choice= 'Y';
		String meaning;
		switch (choice) {
		//switch does not allow to have duplicated cases
		// variable and matching cases must be all same type IF CHAR CASE SHOULD BE CHAR 
		case 'Y':
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
		case 'N':
			meaning="No";
			break;
			default:
				meaning="Unknown";
		}
 System.out.println(meaning);
	}

}
