package com.arraylistproj.listproj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Neutron {
	public static void main(String[] args) {
		Scanner de=new Scanner(System.in);
		
	
		List<String> positron=new ArrayList<>();
		System.out.println("enter range");
		int n=de.nextInt();
		for(int i=0;i<n;i++) {
			String m=de.next();
			positron.add(m);
		}
		System.out.println("array list is: "+positron);
		de.close();

}
}