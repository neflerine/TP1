package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileGetter extends Getter {
	
	
	public FileGetter (String path){
		super (path);
	}

	@Override
	public List<String> get(String path) throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		
		
		if (filepath != null) {
			
				
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
		}
		
		//TreeSet monset = new TreeSet();
		//monset.addAll(result);
		
		if (result.isEmpty())
				throw new IOException("Symptomes illisibles");
		
		return result;
	}

}
	

