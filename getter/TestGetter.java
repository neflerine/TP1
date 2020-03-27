package com.hemebiotech.analytics.getter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestGetter extends Getter {

	public TestGetter(String filepath) {
		super(filepath);
		
	}
/**
 * Lis le path et lis chaque ligne pour la mettre dans line
 * Renvoie line
 * @param path
 */
	@Override
	public List<String> get(String path) {
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
