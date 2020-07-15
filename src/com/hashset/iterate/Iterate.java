package com.hashset.iterate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Iterate {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		HashSet<String> proton=new HashSet<>();
		System.out.println("Enter the range");
		int i=n.nextInt();
		for(int a=0;a<i;a++) {
			proton.add(n.next());
			
		}
		Iterator<String> p= proton.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
		n.close();
		
	}

}
