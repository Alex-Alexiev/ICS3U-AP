package ca.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		/*Precondition: num is a 5 digit number*/
		
		System.out.print("Please enter a 5 digit number: ");
		
		int num = in.nextInt();
		int sum = 0;
		
		sum += (num/1000)%10;
		sum += (num/10)%10;
		
		System.out.println("The sum of the 2nd and 4th digits of "+num+" is "+sum+".");
				
		in.close();
	}
	
}
