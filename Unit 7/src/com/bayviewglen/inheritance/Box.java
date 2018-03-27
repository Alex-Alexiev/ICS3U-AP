package com.bayviewglen.inheritance;

public class Box extends Rectangle{
	
		private double height;
		
		public Box(double length, double width, double height) {
			super(length, width);
			this.height = height;
		}
		
		public double getHeight() {
			return height;
		}
		
		public double getArea() {
			return 2*super.getArea() + 2*getLength()*height + 2*getWidth()*height;
		}
		
		public double getVolume() {
			return getArea()*height;
		}
		
		@Deprecated
		public double getPerimeter() {
			throw new IllegalStateException("No perimeter of a box");
		}
		
	
}
