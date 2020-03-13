package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class NetworkSender extends Sender {

	public NetworkSender(String filepath) {
		super(filepath);
		
	}

	@Override
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
