package com.practoo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	
public static void main(String [] args) {
	
	String str = "love of my life of love leave ";
	
	String [] splitted =str.split(" ");
	
	java.util.Map<String ,Integer> nounmap = new HashMap<String ,Integer>();
	
	for(String simbu : splitted) {
		
		if(nounmap.containsKey(simbu)) {
			Integer value = nounmap.get(simbu);
			
			nounmap.put(simbu , value+1);
		}
		
		else {
			nounmap.put(simbu , 1);
		}
	}
	System.out.println(nounmap);
	
	Set<Entry<String ,Integer>> log = nounmap.entrySet();
	for(Entry<String, Integer> entry :log ) {
		
		if (entry.getValue()>1) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " =" + value);
		}
	
	}
	
	
	}
}
