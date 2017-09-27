package ca.bayviewglen.dayeight;

import java.util.Scanner;

public class PractiseProblems {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println((int)((Math.random()*99)+1));
		System.out.println((int)((Math.random()*100)-50));
		
		System.out.print("Please enter the min: ");
		int min = scanner.nextInt(); //inclusive
		System.out.print("Please enter the max: ");
		int max = scanner.nextInt(); //exclusive
		
		System.out.println((int)((Math.random()*(max-min))+min));
		
		System.out.println("You rolled a "+(int)((Math.random()*6)+1));
		
		System.out.print("Please enter a string: ");
		String string = scanner.next();
		
		System.out.println(string.charAt((int)(Math.random()*string.length())));

		System.out.println((char)((Math.random()*26)+65));
		
		System.out.println((char)((Math.random()*26)+97));
	}

}
