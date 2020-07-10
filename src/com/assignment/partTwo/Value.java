package com.assignment.partTwo;

import java.util.HashMap;

public class Value {
	public static void main(String[] args) {
		HashMap<Integer,String> a_map=new HashMap<>();
		a_map.put(1,"Monday");
		a_map.put(2,"Tuesday");
		a_map.put(3,"wednesday");
		a_map.put(4,"Thurshday");
		a_map.put(5,"Friday");
		a_map.put(6,"Saturday");
		String temp=(String)a_map.get(3);
		System.out.println("Value for 3: "+temp);
		
	}

}