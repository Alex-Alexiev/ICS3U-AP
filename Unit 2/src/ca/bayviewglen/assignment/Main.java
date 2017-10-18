package ca.bayviewglen.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	
	static String firstName, lastName, splitOne, splitTwo, splitThree, total;
	static double mileOneTime, mileTwoTime, fiveKmTime;

	public static void main(String[] args) {
		evaluateRunner();
		evaluateRunner();
		evaluateRunner();
		evaluateRunner();
		evaluateRunner();
	}
	
	public static void evaluateRunner() {
		getInput();
		printSummary();
	}
	
	public static void getInput() {
		System.out.print("Please enter your first and last name: ");
		firstName = in.next();
		lastName = in.next();
		System.out.print(firstName + ", please enter your Mile One Time (mm:ss.sss): ");
		mileOneTime = stringToTime(in.next());
		System.out.print(firstName + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		mileTwoTime = stringToTime(in.next());
		System.out.print(firstName + ", please enter your time to the end of the 5km (mm:ss.sss): ");
		fiveKmTime = stringToTime(in.next());
	}
	
	public static void printSummary() {
		getSummary();
		System.out.println("Runner One Summary");
		System.out.println("******************\n");
		System.out.println("Runner: " + lastName + ", " + firstName);
		System.out.println("Split One: " + splitOne);
		System.out.println("Split Two: " + splitTwo);
		System.out.println("Split Three: " + splitThree);
		System.out.println("Total: " + total);		
	}
	
	public static void getSummary() {
		System.out.println("Runner: " + lastName + ", " + firstName);
		splitOne = timeToString(mileOneTime);
		splitTwo = timeToString(mileTwoTime-mileOneTime);
		splitThree = timeToString(fiveKmTime-mileTwoTime);
		total = timeToString(fiveKmTime);
	}	

	
	public static double stringToTime (String time) {
		double seconds = (Double.parseDouble(time.substring(0, time.indexOf(":"))))*60;
		seconds += Double.parseDouble(time.substring(time.indexOf(":")+1));
		return seconds;
	}
	
	public static String timeToString (double time) {
		int minutes = (int) (time/60);
		DecimalFormat secondsFormat = new DecimalFormat("00.000");
		String seconds = secondsFormat.format(time%60);
		return minutes + ":" + seconds;
	}

}
