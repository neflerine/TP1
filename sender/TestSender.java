package com.hemebiotech.analytics.sender;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class TestSender extends Sender {

	public TestSender(String filepath) {
		super(filepath);
		
	}

	/**
	 * 
	 * Pour chaque couple clé valeur, on écrit dans writer avec un retour à la ligne à chaque passage
	 * @param map
	 * 
	 * 
	 */
	public void send(Map<String, Integer> map) {

		try {
			FileWriter writer = new FileWriter (filepath);
			for ( String key : map.keySet() ) { 
				writer.write( key + " " + map.get(key) + "\r\n");
				System.out.print(key + " " + map.get(key) + "\r\n");
				
			
				
			}
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
