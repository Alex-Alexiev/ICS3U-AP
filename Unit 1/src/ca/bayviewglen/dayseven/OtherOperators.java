package ca.bayviewglen.dayseven;

public class OtherOperators {
	
	static int x = 8;
	static double y = 7.2;

	public static void main(String[] args) {
		
		print();
		
		x += 3; 
		y -= 2;
		print();
		
		x *= 2.1; //it is being stored in an int!
		y /= -2;
		print();
	}
	
	public static void print() {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println();
	}
	
}
