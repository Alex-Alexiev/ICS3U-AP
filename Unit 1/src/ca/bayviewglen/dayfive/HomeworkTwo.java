package ca.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter how much the test was out of as an integer: ");
		int total = in.nextInt();
		System.out.print("Please enter the mark you got on the test as an integer: ");
		int mark = in.nextInt(); 

		double percent = ((double) mark / total) * 100.0;

		System.out.println("By getting " + mark + " out of " + total + ", you received a mark of " + percent + "%.");

	}

}
