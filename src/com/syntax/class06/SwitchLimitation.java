package com.syntax.class06;

public class SwitchLimitation {

	public static void main(String[] args) {
	/*switch can only work with byte, short, int, char, string
	 *  switch has a datatype limitation
	 *  switch cannot work with , double,float, long, boolean
	 *  switch has operator limitations
	 *  cannot use logical operators inside switch && ||
	 *  same thing with relational operators >, <, etc
	 */
		
		double price=10;
		/*switch(price) { ->CE: Cannot switch on a value of type double.
		}
		*/
		boolean hungry=true;
		/*switch(hungry) { -> CE: Cannot switch on a value of type boolean. 
		}
		*/
		/*
		 * switch has a operators limitations
		 * cannot use logical operators inside switch
		 * cannot use relational operators
		 */
		char choice='Y';
		String meaning;
		/*switch(choice) {
		case 'Y' || 'y': --> CE: cannot use ||
		meaning="Yes";
		break;
		}
		*/
		int day=5;
		/*
		 * switch(day) {
		case >5:
		}
		 */
		}
		
		
	}
	


