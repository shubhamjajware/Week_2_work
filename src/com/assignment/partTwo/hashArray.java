package com.assignment.partTwo;

import java.util.HashSet;
import java.util.*;

public class hashArray {
	public static void main(String[] args) {
		HashSet<Integer> ab= new HashSet<>();
		ab.add(0);
		ab.add(9);
		ab.add(1);
		ab.add(3);
		ab.add(6);
		ab.add(8);
		
		System.out.println("hash set is: "+ab);
		
		Object[] arr= ab.toArray();
		System.out.println("The array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
