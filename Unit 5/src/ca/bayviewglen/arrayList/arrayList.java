package ca.bayviewglen.arrayList;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		/*
		 * The array list is a class that implements the list interface
		 * It only stores objects 
		 * ArrayList<Type> the arrow brackets hold the generic (the type)
		 * The initial size of the array is 0;
		 */
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(10); //add to end
		arrList.add(0, 2); // add 2 to index 0
		arrList.remove(0); //remove element at index 0
		arrList.set(0, 5); //set the object at index 0 to 5
		arrList.get(0); //get object at index 0
		arrList.size(); //length of list
		System.out.println(arrList);

	}

}
