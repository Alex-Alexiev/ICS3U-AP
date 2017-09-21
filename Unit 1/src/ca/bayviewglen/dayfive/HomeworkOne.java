package ca.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter a double: ");
		double num = in.nextDouble();

		System.out.println("The square of " + num + " is " + Math.pow(num, 2));

	}
}
