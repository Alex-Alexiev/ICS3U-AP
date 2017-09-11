/*
 * This program calculates the volume of a sphere given the radius
 */

package ca.bayviewglen.daythree;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		double volume, radius;
		
		radius = 10;
		
		volume = (4 * Math.PI * Math.pow(radius, 3))/3;
		
		System.out.println(volume);

	}

}
