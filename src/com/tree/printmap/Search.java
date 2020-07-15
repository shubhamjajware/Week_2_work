package com.tree.printmap;

import java.util.Scanner;
import java.util.TreeMap;

public class Search {
	public static void main(String[] args) {
		Scanner am=new Scanner(System.in);
		TreeMap<Integer,String> neutron=new TreeMap<>();
		System.out.println("enter range");
		int n=am.nextInt();
		System.out.println("enter the pair");
		for(int i=0;i<n;i++) {
			
			Integer a=am.nextInt();
			String b=am.next();
			neutron.put(a,b);
		}
		System.out.println("Map is: "+neutron);
		if(neutron.containsKey(3)) {
			System.out.println("present");
		}
		else {
			System.out.println("Absent");
		}
		
		if(neutron.containsKey(9)) {
			System.out.println("present");
		}
		else {
			System.out.println("Absent");
		}
		
		am.close();
	}

}
