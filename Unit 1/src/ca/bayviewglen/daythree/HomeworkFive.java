/*
 * Given the number of pennies, nickels, dimes, quarters, loonies, and toonies
 */

package ca.bayviewglen.daythree;

public class HomeworkFive {

	public static void main(String[] args) {

		int pennies, nickels, dimes, quarters, loonies, toonies;
		double total;
		
		pennies = 1;
		nickels = 1;
		dimes = 1;
		quarters = 1;
		loonies = 1;
		toonies = 1;
		
		total = (0.01*pennies)+(0.05*nickels)+(0.1*dimes)+(0.25*quarters)+(1*loonies)+(2*toonies);	
		
		System.out.println(total);
		
	}

}
