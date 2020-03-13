package com.hemebiotech.analytics;

import java.util.Map;

public abstract class Sender implements ISender {
	
	protected String filepath;
	
	/**
	 * Methode mère Sender
	 * @param filepath
	 */
	public Sender (String filepath){
	this.filepath = filepath;
	}
	
	public abstract void send(Map<String, Integer> map);
}
