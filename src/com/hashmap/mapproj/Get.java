package com.hashmap.mapproj;

import java.util.HashMap;
import java.util.Scanner;

public class Get {
	public static void main(String[] args) {
		Scanner ef=new Scanner(System.in);
		HashMap<Integer,String> a_map=new HashMap<>();
		System.out.println("enter the range");
		Integer d=ef.nextInt();
		for(int i=0;i<d;i++) {
			Integer f=ef.nextInt();
			String g=ef.next();
			a_map.put(f, g);
			
		}
		System.out.println("Map is: "+a_map);
		System.out.println("enter the key: ");
		String temp=(String)a_map.get(ef.nextInt());
		System.out.println("Value is: "+temp);
		
		ef.close();

}
}