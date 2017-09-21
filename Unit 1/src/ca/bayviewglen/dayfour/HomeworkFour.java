/*
 * Given the initial velocity of the car, its acceleration, 
 * and time it is accelerating at, this program will find the 
 * final velocity of the car.
 */

package ca.bayviewglen.dayfour;

public class HomeworkFour {

	public static void main(String[] args) {
		
		double a = 2; //acceleration in m/s^2
		double t = 5; //time elapsed in seconds 
		double vi = 10; //initial speed of the car in m/s
		double vf = vi + a*t;
		
		System.out.println("The final velocity is "+vf+" m/s.");
		
	}

}
