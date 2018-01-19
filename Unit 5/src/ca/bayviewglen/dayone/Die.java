package ca.bayviewglen.dayone;

public class Die {
	
	private int topSide;
	private int numSides;
	
	private static final int NUM_SIDES = 6;
	
	public Die() {
		numSides = NUM_SIDES;
		roll();
	}
	
	public Die(int numSides) {
		if (numSides < 4) {
			throw new IllegalArgumentException("The die must have at least 4 sides");
		}
		this.numSides = numSides;
		roll();
	}
	
	public void roll() {
		topSide = (int) (Math.random()*numSides)+1; 
	}
	
	public String toString() {
		return "" + topSide;
	}
	
	public int getTopSide() {
		return topSide;
	}

	public void setTopSide(int topSide) {
		this.topSide = topSide;
	}

	public int getNumSides() {
		return numSides;
	}
	
}
