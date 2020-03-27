package com.hemebiotech.analytics.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**
 * Simple brute force implementation
 *
 */
public class SymptomReader implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public SymptomReader (String filepath) {
		this.filepath = filepath;
	}
	
		      
	
	@Override
	public ArrayList<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//TreeSet monset = new TreeSet();
		//monset.addAll(result);
		
		return result;
	}
	

}
	

