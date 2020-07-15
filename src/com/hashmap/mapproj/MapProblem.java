package com.hashmap.mapproj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapProblem {
	
	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		HashMap<String,String> element=new HashMap<>();

		System.out.println("Enter the range ");
		Integer n=ab.nextInt();
		System.out.println("Enter the key value pair");
		for(int i=0;i<n;i++) {
			
			String a=ab.next();
			String b=ab.next();
			element.put(a,b);
		}
		
		
		for(Map.Entry<String,String> x:element.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		ab.close();
	}

}
