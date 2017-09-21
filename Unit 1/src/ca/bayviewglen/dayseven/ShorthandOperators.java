package ca.bayviewglen.dayseven;

public class ShorthandOperators {
	
	static int x = 7;
	static int y = 8; //int and double and boolean are primative data types

	public static void main(String[] args) {
		
		print(); //prints x: 7 and y: 8
		
		y++; //y = y+1
		x--; //x = x+1
		print(); //prints x: 6 and y: 9
		
		++x; //x = x+1
		--y; //y = y-1
		print(); //prints x:7 and y: 8
		
		//BUT THERE IS A DIFFERENCE BETWEEN x++ and ++x
		//x = 7 
		//y = 8
		
		System.out.println("x: " + x++); //prints x then adds 1 (7)
		System.out.println("y: " + y--); //prints y then subtracts 1 (8)
		System.out.println();
		
		System.out.println("x: " + ++x); //adds one then prints (9)
		System.out.println("y: " + --y); //subtracts one then prints (6)
		System.out.println();
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println();
			
	}
	
	public static void print() {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println();
	}

}
