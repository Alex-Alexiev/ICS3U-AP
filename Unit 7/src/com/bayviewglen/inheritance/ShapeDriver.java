package com.bayviewglen.inheritance;

public class ShapeDriver {
	
	public static void main (String[] args) {
		
		Rectangle rect1 = new Rectangle(5,4);
		System.out.println("Area: "+rect1.getArea());
		System.out.println("Perimeter: "+rect1.getPerimeter());
		System.out.println("Length: "+rect1.getLength());
		System.out.println("Width: "+rect1.getWidth());
		
		
		Box box1 = new Box(5,4,6);
		System.out.println("Volume: "+box1.getVolume());
		System.out.println("Length: "+box1.getLength());
		System.out.println("Width: "+box1.getWidth());
		System.out.println("Height: "+box1.getHeight());
		
	}

}
