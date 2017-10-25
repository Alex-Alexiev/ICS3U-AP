package ca.bayviewglen.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	private static Scanner in = new Scanner(System.in);

	private static String firstName, lastName;
	private static String mileOneTimeString, mileTwoTimeString, fiveKmTimeString;
	private static String splitOneString, splitTwoString, splitThreeString, totalString;
	private static String table = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n"
			+ String.format("%-30s%20s%20s%20s%20s\n", "Runner Name", "Split One Time", "Split Two Time", "Split Three Time", "Total Time");
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
	 * This method calls all the functions necessary to evaluate a runner's
	 * performance, and to print their results. The process of evaluation includes
	 * getting the input, calculating the split times, adding a row to the table,
	 * and printing the runner's summary
	 */
	private static void evaluateRunner() {
		getInput();
		getSummary();
		addTableRow();
		printSummary();
	}

	/*
	 * This method prints out prompts to collect information from the runner, and
	 * stores the data as Strings in global variables.
	 */
	private static void getInput() {
		System.out.print("Please enter your first and last name: ");
		firstName = in.next();
		lastName = in.next();
		System.out.print(firstName + ", please enter your Mile One Time (mm:ss.sss): ");
		mileOneTimeString = in.next();
		System.out.print(firstName + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		mileTwoTimeString = in.next();
		System.out.print(firstName + ", please enter your time to the end of the 5km (mm:ss.sss): ");
		fiveKmTimeString = in.next();
	}

	/*
	 * This method uses the mile times to calculate the splits. It then converts the
	 * values from doubles to strings to display.
	 */
	private static void getSummary() {
		splitOneString = mileOneTimeString;
		splitTwoString = subtractTimes(mileTwoTimeString, mileOneTimeString);
		splitThreeString = subtractTimes(fiveKmTimeString, mileTwoTimeString);
		totalString = fiveKmTimeString;
	}

	/*
	 * This method uses the current global variables which store the runner's
	 * information and print that information in a neat manner.
	 */
	private static void printSummary() {
		System.out.println("\nRunner Summary");
		System.out.println("**************");
		System.out.println("Runner: " + lastName + ", " + firstName);
		System.out.println("Split One: " + splitOneString);
		System.out.println("Split Two: " + splitTwoString);
		System.out.println("Split Three: " + splitThreeString);
		System.out.println("Total: " + totalString + "\n");
	}

	/*
	 * Uses the current values of the global variables and the String.format method
	 * to add (concatenate) one row to the table string.
	 */
	private static void addTableRow() {
		table += String.format("%-30s%20s%20s%20s%20s\n", lastName + ", " + firstName, splitOneString, splitTwoString,
				splitThreeString, totalString);
	}

	/*
	 * This method takes two times as Strings, uses the stringToTime() method to
	 * convert them into doubles, and then subtracts those doubles and uses the
	 * timeToString() method to turn that back into a String which gets returned.
	 */
	private static String subtractTimes(String timeTwo, String timeOne) {
		return timeToString(stringToTime(timeTwo) - stringToTime(timeOne));
	}

	/*
	 * Uses the Double.parseDouble method to parse the input time String in the
	 * format mm:ss.sss and convert it into a double which stores the number of
	 * seconds.
	 */
	private static double stringToTime(String time) {
		/*Take the seconds from the minutes section of the String before the colon*/
		/*This is done by parsing the substring before the colon, the multiplying by 60 to get the seconds*/
		double seconds = (Double.parseDouble(time.substring(0, time.indexOf(":")))) * SECONDS_IN_MINUTE;
		/*Add the time in seconds after the colon*/
		seconds += Double.parseDouble(time.substring(time.indexOf(":") + 1));
		return seconds;
	}

	/*
	 * This method uses the DecimalFormat class to convert the time as a double of
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

}
