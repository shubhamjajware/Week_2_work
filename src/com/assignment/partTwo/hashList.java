package com.assignment.partTwo;

import java.util.HashSet;
import java.util.Iterator;

public class hashList {
	
	public static void main(String[] args) {
		HashSet<String> ab= new HashSet<>();
		ab.add("shubham");
		ab.add("abhinav");
		ab.add("akshay");
		ab.add("rajesh");
		ab.add("rakesh");
		int b=0;
		
		for(String i:ab) {
			b++;
		}
		System.out.println("all elements: "+b);
	}

}
