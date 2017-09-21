package ca.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the acceleration as a double in m/s^2: ");
		double a = in.nextDouble(); // acceleration in m/s^2
		System.out.print("Please enter the tiem elapsed in seconds as a double: ");
		double t = in.nextDouble(); // time elapsed in seconds
		System.out.print("Please enter the initial speed of the car in m/s as a double: ");
		double vi = in.nextDouble(); // initial speed of the car in m/s
		
		double vf = vi + a * t;

		System.out.println("The final velocity is " + vf + " m/s.");
		
		in.close();
	}
}
