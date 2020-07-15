package com.hashset.toarray;

import java.util.HashSet;
import java.util.Scanner;

public class Convert {
	
	public static void main(String[] args) {
		Scanner z= new Scanner(System.in);

		HashSet<Integer> atom= new HashSet<>();
		System.out.println("enter the range: ");
		Integer n=z.nextInt();
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) {
			atom.add(z.nextInt());
		}
		System.out.println("the set is : "+atom);
		
		Object[] arr= atom.toArray();
		System.out.println("The array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		z.close();
	}

}
