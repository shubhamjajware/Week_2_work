package com.hashlist.print;

import java.util.HashSet;
import java.util.Scanner;

public class Printing {
	public static void main(String[] args) {
		Scanner az= new Scanner(System.in);

		HashSet<String> electron = new HashSet<>();
		int temp=0;
		System.out.println("enter the range: ");
		Integer n=az.nextInt();
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) {
			electron.add(az.next());
		}
		System.out.println("the set is : "+electron);
		
		for(String b:electron) {
			temp++;
		}

		System.out.println("all elements: "+temp);
		
		az.close();
	}

}
