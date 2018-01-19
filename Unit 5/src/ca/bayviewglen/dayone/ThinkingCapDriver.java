package ca.bayviewglen.dayone;

public class ThinkingCapDriver {

	public static void main(String[] args) {
		
		ThinkingCap cap = new ThinkingCap();
		// cap.redWords = "blue"; cannot do this b/c redWords is private
		
		ThinkingCap cap2 = new ThinkingCap();
		
		cap.slots("That test was a breeze", "I should have studied harder");
		cap2.slots("That test was a breeze!!!!", "I should have studied much harder");
		
		cap.pushGreen();
		cap.pushRed();
	}

}
