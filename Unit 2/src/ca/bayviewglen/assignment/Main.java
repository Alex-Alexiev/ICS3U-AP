/*
 * Clarfications
 * 
 */

package ca.bayviewglen.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	private static Scanner in = new Scanner(System.in);
	
	private static String firstName, lastName;
	private static String splitOneString, splitTwoString, splitThreeString, totalString;
	private static String table = String.format("%32s%20s%20s%20s%20s\n", "Runner Name", "Split One Time", "Split Two Time", "Split Three Time", "Total Time");
	private static double mileOneTimeDouble, mileTwoTimeDouble, fiveKmTimeDouble;
	private static final int SECONDS_IN_MINUTE = 60;
	
	public static void main(String[] args) {
		evaluateRunner();
		evaluateRunner();
		evaluateRunner();
		evaluateRunner();
		evaluateRunner();   
		System.out.println(table);
	}
	
	/*
	 *This method calls all the functions necessary to evaluate a runner's
	 *performance, and to print their results.
	 */
	private static void evaluateRunner() {
		getInput();
		getSummary();
		addTableRow();
		printSummary();   
	}
	
	/*
	 *This method prints out prompts to collect information
	 *from the runner, and stores the data in global variables.
	 */
	private static void getInput() {
		System.out.print("Please enter your first and last name: ");
		firstName = in.next();
		lastName = in.next();
		System.out.print(firstName + ", please enter your Mile One Time (mm:ss.sss): ");
		mileOneTimeDouble = stringToTime(in.next());
		System.out.print(firstName + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		mileTwoTimeDouble = stringToTime(in.next());
		System.out.print(firstName + ", please enter your time to the end of the 5km (mm:ss.sss): ");
		fiveKmTimeDouble = stringToTime(in.next());
	}
	
	/*
	 *This method uses the mile times to calculate the splits.
	 *It then converts the values from doubles to strings to display.
	 */
	private static void getSummary() {
		System.out.println("Runner: " + lastName + ", " + firstName);
		splitOneString = timeToString(mileOneTimeDouble);
		splitTwoString = timeToString(mileTwoTimeDouble-mileOneTimeDouble);
		splitThreeString = timeToString(fiveKmTimeDouble-mileTwoTimeDouble);
		totalString = timeToString(fiveKmTimeDouble);
	}	
	
	/*
	 *This method uses the current global variables
	 *which store the runner's information and print that 
	 *information in a neat manner.
	 */
	private static void printSummary() {
		System.out.println("\nRunner Summary");
		System.out.println("**************");
		System.out.println("Runner: " + lastName + ", " + firstName);
		System.out.println("Split One: " + splitOneString);
		System.out.println("Split Two: " + splitTwoString);
		System.out.println("Split Three: " + splitThreeString);
		System.out.println("Total: " + totalString);		
	}
	
	/*
	 *Uses the current values of the global variables and the 
	 *String.format method to add one row to the table string.
	 */
	private static void addTableRow() {
		table += String.format("%15s, %15s%20s%20s%20s%20s\n", lastName, firstName, splitOneString, splitTwoString, splitThreeString, totalString); 
	}
	
	/*
	 *Uses the Double.parseDouble method to parse the input
	 *time String in the format mm:ss.sss and converts it 
	 *into a double which stores the number of seconds.
	 */
	private static double stringToTime (String time) {
		double seconds = (Double.parseDouble(time.substring(0, time.indexOf(":"))))*SECONDS_IN_MINUTE;
		seconds += Double.parseDouble(time.substring(time.indexOf(":")+1));
		return seconds;
	}

	/*
	 *This method uses the DecimalFormat class
	 *to convert the time as a double of seconds
	 *into a String with the format mm:ss.sss
	 */
	private static String timeToString (double time) {
		int minutes = (int) (time/SECONDS_IN_MINUTE);
		DecimalFormat secondsFormat = new DecimalFormat("00.000");
		String seconds = secondsFormat.format(time%60); 
		return minutes + ":" + seconds;
	}

}
