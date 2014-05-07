package com.pronto.test;

import java.util.Map;

import com.pronto.wordcount.Count;

public class WordCountTest {

	
	public static void main(String[] args) {
		Count count = new Count();
		Map<String, Integer> wordCount = count.wordCount("hi how are you ? how are you?");
		System.out.println(wordCount);
	}
}
