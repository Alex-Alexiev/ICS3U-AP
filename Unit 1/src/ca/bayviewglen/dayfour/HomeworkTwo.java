/*
 * Given the total marks on a test, and the student's score, 
 * the program will print out the student's mark as a percent 
 * out of the total score.
 */

package ca.bayviewglen.dayfour;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		int total = 100, mark = 60;
		
		double percent = ((double)mark/total)*100.0;
		
		System.out.println("By getting "+mark+" out of "+total+
				", you received a mark of "+percent+"%.");

	}

}
