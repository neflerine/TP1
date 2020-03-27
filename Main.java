package com.hemebiotech.analytics;

import com.hemebiotech.analytics.getter.FileGetter;
import com.hemebiotech.analytics.getter.IGetter;
import com.hemebiotech.analytics.process.AnalyticsCounter;
import com.hemebiotech.analytics.sender.FileSender;
import com.hemebiotech.analytics.sender.ISender;

public class Main {
	
	public static void main(String args[]) {
		
		
		
		IGetter getter = new FileGetter(args[0]);
		ISender sender = new FileSender(args[1]);
		
		AnalyticsCounter analytics = new AnalyticsCounter ();
		

		analytics.process(getter, sender, args[0]);
		
	}
	
	

}
