package com.hemebiotech.analytics.getter;

import java.io.IOException;
import java.util.List;

public abstract class Getter implements IGetter  {
	
	protected String filepath;
	
	/**
	 * Méthode mère Getter
	 * @param filepath
	 */
	public Getter (String filepath){
	this.filepath = filepath;
	}
	

	public abstract List<String> get(String path) throws IOException;
			
		
		
	}
			
			


