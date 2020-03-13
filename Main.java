package com.hemebiotech.analytics;

public class Main {
	
	public static void main(String args[]) {
		
		
		
		IGetter getter = new FileGetter(args[0]);
		ISender sender = new FileSender(args[1]);
		
		AnalyticsCounter analytics = new AnalyticsCounter ();
		

		analytics.process(getter, sender, args[0]);
		
	}
	
	

}
