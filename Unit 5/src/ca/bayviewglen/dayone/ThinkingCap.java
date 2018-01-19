package ca.bayviewglen.dayone;

public class ThinkingCap {

	private String greenWords;
	private String redWords;
	
	//These are called instance variables because they are 
	//created for every object 
	
	public void slots(String newGreen, String newRed) {
		greenWords = newGreen;
		redWords = newRed;
	}
	
	public void pushGreen() {
		System.out.println(greenWords);
	}
	
	public void pushRed() {
		System.out.println(redWords);
	}
	
}
