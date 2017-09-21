/*
 * Calculates the sum of the 2'nd and 4'th digits in a 5 digit number.
 */

package ca.bayviewglen.dayfour;

public class HomeworkThree {

	public static void main(String[] args) {
		
		/*Precondition: num is a 5 digit number*/
		
		int num = 12345, sum = 0;
		
		sum += (num/1000)%10;
		sum += (num/10)%10;
		
		System.out.println("The sum of the 2nd and 4th digits of "+num+" is "+sum+".");
				
	}

}
