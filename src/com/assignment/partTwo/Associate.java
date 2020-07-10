package com.assignment.partTwo;

import java.util.HashMap;
import java.util.Map;

public class Associate {
	public static void main(String[] args) {
		HashMap<String,String> h_map=new HashMap<>();
		h_map.put("shubham","VPS");
		h_map.put("shivam","JNV");
		h_map.put("siddharth","JNU");
		h_map.put("sanjay","Du");
		h_map.put("Subhangi","IIt");
		h_map.put("ravi","Heritage");
		h_map.put("Aman","Hit");
		for(Map.Entry x:h_map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		
	}

}
