package ca.bayviewglen.formatting;

public class PrintEff {

	public static void main(String[] args) {
		
		//print f used placeholder for the variable within the String
		//the variables go into the place holders in the order that they are listed
		
		double number = 3.45677;
		int number2 = 3;
		
		//the place holders start with percent to indicate to the printer
		
		// f is decimal # (floating point but can also use double)
		// d is integer 
		// s is a String
		// %width.decimalPlacesTYPE
		// %10.2f means width of 10 and 2 decimal places for a deciaml number
		// the width refers from space from the right side of the value
		// if needed it will ROUND the decimals 
		// the decimal uses up one space
		
		System.out.printf("This is a string-%10.2f-%4d", number, number2);
		
	}

}
