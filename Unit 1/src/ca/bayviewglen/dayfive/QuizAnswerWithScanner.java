package ca.bayviewglen.dayfive;

import java.util.Scanner;

public class QuizAnswerWithScanner {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Hey, please enter a 5 integer: ");
		
		int num = in.nextInt();
		in.close();
		
		int firstDigit = num/10000;
		int lastDigit = num%10;
		
		System.out.println(firstDigit*lastDigit);

	}

}
