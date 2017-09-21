package ca.bayviewglen.daysix;

import java.util.Scanner;

public class Homework {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//questionOne();
		//questionTwo();
		//questionThree();
		//questionFour();
		//questionFive();
		//questionSix();
		//questionSeven();
		//questionEight();
		//questionNine();
		//questionEleven();		
		
	}
	
	public static void questionOne() {
		System.out.println("Enter the price then the taxes:");
		double price = scanner.nextDouble();
		double taxes = scanner.nextDouble();
		System.out.println("$"+Math.round((price*((taxes/100)+1))*100)/100.0);
	}
	
	public static void questionTwo() {
		System.out.println("Enter the length then the width:");
		double length = scanner.nextDouble();
		double width = scanner.nextDouble();
		System.out.println("Area: "+((int) (length*width)+0.5)); 
		System.out.println("Perimeter: "+((int) (2*length + 2*width)+0.5));
	}
	
	public static void questionThree() {
		int mInYear = 60*24*365;
		System.out.println("There are "+mInYear+" minutes in an year");
	}
	
	public static void questionFour() {
		double lightYear = (60*60*24*365)*3*100;
		System.out.println("There are "+lightYear+" meters in one lightyear.");
	}
	
	public static void questionFive() {
		System.out.println("Enter the # games won and the # games lost: ");
		int won = scanner.nextInt();
		int lost = scanner.nextInt();
		double winCent = ((double)won/(won+lost))*100.0;
		System.out.println("Winning percentage is "+Math.round(winCent*1000)/1000.0);
	}
	
	public static void questionSix() {
		System.out.println("Enter the mass (kg) and speed (m/s): ");
		double mass = scanner.nextDouble();
		double speed = scanner.nextDouble();
		double momentum = mass*speed;
		System.out.println("The momentum is "+momentum+" kg m/s");
	}
	
	public static void questionSeven() {
		System.out.println("Enter the degrees in Fahrenheit: ");
		double f = scanner.nextDouble();
		double c = Math.round((((f-32)*5)/9)*100)/100.0;
		System.out.println(f+" Fahrenheit in Celsius is "+c+" Celsius");
	}
	
	public static void questionEight() {
		System.out.println("Enter a positive number: ");
		double num = scanner.nextDouble();
		System.out.println("The square of "+num+" is "+num*num);
		System.out.println("The square root of "+num+" is "+Math.sqrt(num));
	}
	
	public static void questionNine() {
		System.out.println("Enter how many items they sold: ");
		double sold = scanner.nextDouble();
		System.out.println("They made $"+sold*0.27);
	}
	
	public static void questionEleven() {
		System.out.println("Enter the mass (kg) and speed (m/s) of an object: ");
		double mass = scanner.nextDouble();
		double speed = scanner.nextDouble();
		double kinEnergy = (mass*speed)/2;
		System.out.println("The kinetic energy of the object is "+kinEnergy+" Joules");
	}

}
