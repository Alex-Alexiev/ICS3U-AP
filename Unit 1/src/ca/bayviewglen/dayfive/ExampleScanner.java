package ca.bayviewglen.dayfive;

//java.util is the package, Scanner is one of the classes

import java.util.Scanner; 

public class ExampleScanner {

	public static void main(String[] args) {
				
		//System.in is the type of Scanner
		//keyboard is a resource, so we should close the resource after we
		//are done with it
		Scanner keyboard = new Scanner(System.in);
		
		//always prompt the user
		System.out.println("Please enter two integers: ");
		
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		int sum = x+y;
		
		/*
		 * Other scanner methods include
		 * nextInt()
		 * nextDouble()
		 * nextLine() --entire line
		 * next() -- string
		 */
		
		//close the keyboard once you are done with it because it is a resource
		keyboard.close();
		
		System.out.println("The sum of the numbers "+x+" and "+y+" is "+sum);
		
	}

}
