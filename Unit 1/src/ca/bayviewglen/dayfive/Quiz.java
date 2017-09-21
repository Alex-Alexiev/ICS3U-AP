/*
 * This program prints out the product of the first and last digits of
 * a five digit integer.
 */

package ca.bayviewglen.dayfive;

public class Quiz {

	public static void main(String[] args) {
		
		/*Precondition: num must be a five digit integer*/	
		
		int num = 12345;
		int firstDigit = (num/10000)%10; 
		int lastDigit = num%10;
		int product = firstDigit * lastDigit;
		
		System.out.println("The product of the first and last digits"
				+ " of "+num+" is "+product);

	}

}
