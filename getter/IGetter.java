package com.hemebiotech.analytics.getter;

import java.io.IOException;
import java.util.List;

public interface IGetter {
	
	List<String> get(String path) throws IOException;

}
