package com.assignment.partTwo;

import java.util.HashMap;

public class Copying {
	public static void main(String[] args) {
		HashMap<Integer,String> ab=new HashMap<>();
		HashMap<Integer,String> cd=new HashMap<>();
		ab.put(1,"jsme");
		ab.put(2,"hwh");
		ab.put(6,"dgp");
		System.out.println("first Map"+ab);
		cd.put(4,"kol");
		cd.put(5,"ccu");
		cd.put(3,"blr");
		System.out.println("second map: "+cd);
		cd.putAll(ab);
		System.out.println("New Value is: "+cd);
		
	}

}
