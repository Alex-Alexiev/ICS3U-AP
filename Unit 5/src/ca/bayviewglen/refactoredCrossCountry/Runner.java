package ca.bayviewglen.refactoredCrossCountry;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Runner {
	
	public static Scanner in = new Scanner(System.in);

	private String firstName, lastName;
	private String mileOneTime, mileTwoTime, fiveKmTime;
	private String splitOne, splitTwo, splitThree;
	
	private static final int SECONDS_IN_MINUTE = 60;
	
	/*
	 * This constructor uses the console to get inputs used to 
	 * initialize the instance variables of this runner
	 */
	public Runner() {
		System.out.print("Please enter your first and last name: ");
		firstName = in.next();
		lastName = in.next();
		System.out.print(firstName + ", please enter your Mile One Time (mm:ss.sss): ");
		mileOneTime = in.next();
		System.out.print(firstName + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		mileTwoTime = in.next();
		System.out.print(firstName + ", please enter your time to the end of the 5km (mm:ss.sss): ");
		fiveKmTime = in.next();
		findSplits();
		printRunnerInfo();
	}
	
	/*
	 * Prints out the information for this runner
	 */
	
	public void printRunnerInfo() {
		System.out.println("\nRunner Summary");
		System.out.println("**************");
		System.out.println("Runner: " + lastName + ", " + firstName);
		System.out.println("Split One: " + splitOne);
		System.out.println("Split Two: " + splitTwo);
		System.out.println("Split Three: " + splitThree);
		System.out.println("Total: " + fiveKmTime + "\n");
	}
	
	/*
	 * Calculate the split times for the runner
	 */	
	
	private void findSplits() {
		splitOne = mileOneTime;
		splitTwo = subtractTimes(mileTwoTime, mileOneTime);
		splitThree = subtractTimes(fiveKmTime, mileTwoTime);
	}
	
	/*
	 * Subtract two times in the String format by 
	 * first converting them to doubles using the stringToTime function, 
	 * subtracting those doubles, and them converting result back into a 
	 * String using the timeToString function
	 */
	
	private static String subtractTimes(String timeTwo, String timeOne) {
		return timeToString(stringToTime(timeTwo) - stringToTime(timeOne));
	}
	
	/*
	 * Uses the Double.parseDouble method to parse the input time String in the
	 * format mm:ss.sss and convert it into a double which stores the number of
	 * seconds
	 */
	
	private static double stringToTime(String time) {
		/*Take the seconds from the minutes section of the String before the colon*/
		/*This is done by parsing the substring before the colon for the minutes, the multiplying by 60 to get the seconds*/
		double seconds = (Double.parseDouble(time.substring(0, time.indexOf(":")))) * SECONDS_IN_MINUTE;
		/*Add the time in seconds after the colon*/
		seconds += Double.parseDouble(time.substring(time.indexOf(":") + 1));
		return seconds;
	}
	
	/*
	 * uses the DecimalFormat class to convert the time as a double of
	 * seconds into a String with the format mm:ss.sss
	 */
	
	private static String timeToString(double time) {
		/*Find the number of full minutes by diving the time by 60 and then casting to an int*/
		int minutes = (int) (time / SECONDS_IN_MINUTE);
		DecimalFormat secondsFormat = new DecimalFormat("00.000");
		/*Find the number of left over seconds by taking the time modulus 60*/
		String seconds = secondsFormat.format(time % SECONDS_IN_MINUTE);
		return minutes + ":" + seconds;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFiveKmTime() {
		return fiveKmTime;
	}

	public String getSplitOne() {
		return splitOne;
	}

	public String getSplitTwo() {
		return splitTwo;
	}

	public String getSplitThree() {
		return splitThree;
	}

}
