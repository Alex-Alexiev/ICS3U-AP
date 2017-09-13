package ca.bayviewglen.dayfour;

public class ExampleTwo {

	public static void main(String[] args) {

		int age1 = 16;
		int age2 = 17;
		int age3 = 16;

		int numberOfStudents = 3;
		double averageAge = (age1 + age2 + age3) / (double) numberOfStudents; // int/double
		System.out.println(averageAge);

		System.out.println((int) ((age1 + age2 + age3) / (double) numberOfStudents));

		//averageAge is a double, but the operation returns 16. So averageAge stores 16.0
		averageAge = (int) ((age1 + age2 + age3) / (double) numberOfStudents);

		// We are explicitly casting twice
			//Explicit casting is putting the round bracket
			//the Developer is doing it
			//you can explicitly cast from double to int
		// Java performs an implicit cast
			//when Java does the casting
			//Trying to store an int in a double stores casts the int to a double
			//Java does not implicitly cast from double to int

		System.out.println(averageAge);

		// Narrowing Conversion less precision double -> int
			//After ccasting, the result is less precise
			//eg. (int) 3.246 = 3
		// Widening Conversion more precision int -> double
			//after casting, the result is more precise
			//eg. (double) 3 = 3.0
		
		
		/*
		 * Types of errors
		 * 
		 * Syntax error
		 * 		Something wrong with the syntax
		 * 
		 * Runtime errors
		 * 		it crashes while running
		 * 		throws an exception
		 * 
		 * Logic errors
		 * 		mistake in the logic
		 * 		doesn't crash but it does not give the right answer
		 * 
		 */
	}

}
