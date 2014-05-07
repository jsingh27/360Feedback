package com.pronto.wordcount;

import java.util.HashMap;
import java.util.Map;


public class Count {

	public Map<String, Integer> wordCount(String sentence) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String words[] = sentence.split(" ");
		
		for(String word : words) {
			if(map.containsKey(word)) {
				int previousValue = map.get(word);
				map.put(word, ++previousValue);
			} else {
				map.put(word, 1);
			}
		}
		return map;
	}
	
	
}
