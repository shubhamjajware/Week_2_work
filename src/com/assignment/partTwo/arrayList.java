package com.assignment.partTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		List<Integer> b= new ArrayList<>();
		System.out.println("Enter the range of array List");
		int n=Integer.parseInt( sc.nextLine());
		System.out.println("ENter the values");
		
		for(int i=0;i<n;i++) {
			b.add(sc.nextInt());
		}
		System.out.println("The array List is:");
			System.out.println(b);
		
			System.out.println("insert at first position and replace element at 4th position");
			b.add(0, 6);
			b.set(4, 8);
			b.remove(3);
	
	System.out.println(b);

	}

}
