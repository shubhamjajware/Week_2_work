package com.assignment.partTwo;

import java.util.TreeMap;

public class Search {
	public static void main(String[] args) {
		TreeMap<Integer,String> xy=new TreeMap<>();
		xy.put(1, "Jan");
		xy.put(2, "feb");
		xy.put(3, "mar");
		xy.put(4, "Jun");
		xy.put(5, "Jul");
		xy.put(6, "Aug");
		xy.put(7, "Sep");
		xy.put(8, "Oct");
		System.out.println(xy);
		
		if(xy.containsKey(3)) {
			System.out.println("present");
		}
		else {
			System.out.println("Absent");
		}
		
		if(xy.containsKey(9)) {
			System.out.println("present");
		}
		else {
			System.out.println("Absent");
		}
		
	}

}
