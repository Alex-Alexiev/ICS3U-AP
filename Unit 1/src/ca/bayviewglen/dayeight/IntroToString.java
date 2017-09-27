package ca.bayviewglen.dayeight;

import java.util.Random;

public class IntroToString {

	public static void main(String[] args) {
		
		//there is not a single method in the string class
		//that will permenently change the string class
		
		String wordOne = "I am more than a word";
		String wordTwo = "I am more than a word";
		String wordThree = new String("I am more than a word");
		String wordFour = wordOne;
		//wordFour was given the same address as wordOne
		
		
		System.out.println(wordOne); 
		//string is non-primitive because it stores a reference to the
		//data and does not actually store the data
		
		System.out.println(wordOne.length());
		//length returns the # of characters
		
		System.out.println(wordOne.toLowerCase()); 
		//makes a temporary cop of the string
		
		System.out.println(wordOne.equals(wordThree));
		//this actually comapres what is inside of each of the strings 
		//since the == does not do that
		
		System.out.println(wordOne == wordTwo);
		//returns true because they are pointing to the same piece of 
		//memory
		
		System.out.println(wordOne == wordThree);
		//even though the strings are the same, the reference to them
		//is different because you made a new string in the memory
		
		System.out.println(wordOne == wordFour);
		//since they are pointing to the same object, they are equal
		
		System.out.println(wordOne.substring(3));
		//makes a substring STARTING from index 3 (m) 
		//the 3 is inlcusive
		
		System.out.println(wordOne.substring(wordOne.length()/2));
		//retusnt eh scond half of the string
		
		System.out.println(wordOne.substring(2, 6));
		//makes a substring from index 2 (inclusive) to 6 (exclusive)
		//the beginning is inlcusive and the end is exclusive 
		
		System.out.println(wordOne.indexOf("More"));
		//returns the index of the first letter of the string 
		//the capital M
		//this methods takes a string 
		//returns the index of teh FIRST OCCURENCE ONLY 
		
		System.out.println(wordOne.indexOf("more"));
		//returns -1 (meaning it is non-existant)
		
		//therefore to see if something is present in a string, just see
		//if .indexOf returns !-1
		
		System.out.println('A' + 1); //returns 66
		System.out.println("A" + 1); //returns A1
		System.out.println((char)('A'+1)); //returns B
		
		Random rand = new Random();     
		
		for (int i = 0; i < 100; i++) {
			char letter = (char)((rand.nextDouble()*26)+65);
			System.out.println(letter);
		}
		
		int c = 10;
		char hello = (char) c;
		
		//prints out random letters 
	}

}
