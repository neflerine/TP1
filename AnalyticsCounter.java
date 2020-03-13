package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	private String filepath;
		

	public AnalyticsCounter() {
	
	}
	/**
	 * Rempli la liste raw gr�ce � get(path)
	 * Ensuite raw est nettoy� avec clean dans un map
	 * ensuite le map est envoy� � result.out gr�ce � send(map)
	 * @param getter
	 * @param sender
	 * @param path
	 * 
	 */
	public void process (IGetter getter, ISender sender, String path){
		
		List<String> raw;
		try {
			raw = getter.get(path);
			Map<String, Integer> map = Cleaner.clean(raw);
			sender.send(map);
			
		} catch (IOException e) {
			
			System.out.println("Erreur sur AnalyticsCounter : " + e.getMessage());
		}
		
		
		
		
	}
	

}
