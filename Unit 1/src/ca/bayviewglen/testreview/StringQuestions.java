package ca.bayviewglen.testreview;

public class StringQuestions {

	public static void main(String[] args) {
		
		String s = "heat";
		System.out.println(s.substring(s.length()/2-1, s.length()/2+2));
		System.out.println(s.substring(s.length()/2));
		System.out.println(s.charAt((int)((Math.random()*s.length()/2))));
		System.out.println(s.substring(s.length()/2) + s.substring(0, s.length()/2));
	}

}
