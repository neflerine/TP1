package com.hemebiotech.analytics;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Cleaner {
	
	
	
	
	static Map<String, Integer> clean (List<String> symptoms){
		Map<String, Integer> map = new TreeMap<>();
		Iterator<String> iterateur = symptoms.iterator();
		String maladieIt = new String();
		
		while(iterateur.hasNext()){	
			
			maladieIt = iterateur.next();
			map.put(maladieIt, map.getOrDefault(maladieIt, 0) + 1);
		}
		
		return map;
	}

}
