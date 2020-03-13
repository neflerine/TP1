package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileSender extends Sender {

	public FileSender (String path){
		super (path);
		
		
	}
	
	
	@Override
	public void send(Map<String, Integer> map) { //test avec boolean !

		try {
			FileWriter writer = new FileWriter (filepath);
			for ( String key : map.keySet() ) { 
				writer.write( key + " " + map.get(key) + "\r\n");
				System.out.print(key + " " + map.get(key) + "\r\n");
				
			
				
			}
			
			writer.close();
			//return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//return false;
		}

	}

}
