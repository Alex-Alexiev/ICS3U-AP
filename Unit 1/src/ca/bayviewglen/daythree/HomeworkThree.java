/*
 * This program solves a quadratic equation
 */

package ca.bayviewglen.daythree;

public class HomeworkThree {

	public static void main(String[] args) {
		
		double a, b, c, x1, x2;
		
		a = -5;
		b = 5;
		c = 5;
		
		x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
		x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
		
		System.out.println(x1 +" or "+ x2);

	}

}
