package com.third.hashsetproj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Copy {
	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		HashMap<String,String> element=new HashMap<>();
		HashMap<String,String> compound=new HashMap<>();

		System.out.println("Enter the range ");
		Integer n=ab.nextInt();
		System.out.println("Enter the key value pair for first map");
		for(int i=0;i<n;i++) {
			
			String a=ab.next();
			String b=ab.next();
			element.put(a,b);
		}
		
		System.out.println("first map is: ");
		for(Map.Entry<String,String> x:element.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		System.out.println("Enter the key value pair for Second map");
		for(int i=0;i<n;i++) {
			
			String c=ab.next();
			String d=ab.next();
			compound.put(c,d);
		}
		
		System.out.println("second map is:");
		for(Map.Entry<String,String> y:compound.entrySet()) {
			System.out.println(y.getKey()+" "+y.getValue());
		}
		
		compound.putAll(element);
		System.out.println("Copied map is: "+compound);
		ab.close();
	}

}
