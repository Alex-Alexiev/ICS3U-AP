package ca.bayviewglen.daythree;

public class ExampleFour {

	public static void main(String[] args) {
		
		//int with int gives int
		//double with double gives double
		//double with int gives double
		//int divided by int truncates the decimal
		//division with at least one double gives a double answer (if stored in double)
						
		int a = 2; 
		int b = 3; //int is 32 bit //long is 64 bit
		double c = 2.0, d = 5.0; //double is 64 bit precision //float is 32 bit
		double e;
		int f;
		
		double radius = 6;
		double areaOfCircle;
		
		areaOfCircle = Math.PI * radius * radius;

		e = c * d;
		System.out.println(e);

		e = c / d;
		System.out.println(e);

		f = a * b;
		System.out.println(f);

		f = b / a; // Integer division -> long division where we don't care about the remainder
		System.out.println(f);

		e = b / a; // even though it is stored in a double, 
		//whenever int is divided by int you get a truncated int
		System.out.println(e);

	}

}
