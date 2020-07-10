package com.assignment.partTwo;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
	
	public static void main(String[] args) {
		HashSet<String> a=new HashSet<>();
		a.add("ram");
		a.add("ramesh");
		a.add("aman");
		a.add("ravi");
		a.add("shubham");
		//a.add("shubham");
		//a.add("aman");
		
		Iterator<String> p= a.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
	}

}
