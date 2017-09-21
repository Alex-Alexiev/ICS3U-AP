package ca.bayviewglen.dayseven;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		double x = Math.random(); //returns a double in the following range [0,1]
		//square brackets [0,1] are inclusive
		//round brackets (0,1) are exclusive (so only 0 and 1)
		System.out.println("x: "+x);
		
		Random random = new Random();
		//the word new is reserved for constructing and creating instances of a class
		
		double y = random.nextDouble();
		//does the same thing as Math.random()
		System.out.println("y: "+y);
		
		/*
		 * Although they return the same value:
		 * Math.random() returns the value directly through the class
		 * 	ie the method returns the value
		 * nextDouble() is not called through the random class, but 
		 * through the instance of the random class
		 * You cannot call it directly from the random class because the 
		 * nextDouble() method is not static 
		 */
		
		int z = random.nextInt(12);
		//returns a random int [0,11]
		//means between 0 and 11 inclusive 
		//can also be written as [0,12) 
		
		//however, this cannot return a negative number		
		System.out.println("z: "+z);
		
		//to get a number in a range we have to do operations ->
		
		//example: get a random number in the range [-10,10]
		
		//using random.nextInt();
		
		int r = random.nextInt(21) - 10;
		//21 represents the total number of ints
		//-10 represents the lower limit
		//so this range is [-10,10]
		System.out.println(r);
		
		//using nextDouble() or Math.random()
		
		int s = (int)(Math.random()*21)-10;
		//21 is the total number of ints
		//-10 represents the lower limit 
		
		
		
		

	}

}
