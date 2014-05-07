package com.pronto.resquareofnumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReSquareOfNumbers {
public Map<Integer, Integer> findSquare(List<Integer> integer) {
	int squareArray[] = new int[integer.size()];
	int i=0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int num:integer)
		{
			int square = num * num;
			squareArray[++i] = (int) square;
		map.put(num, square);
			} 
		
		return (Map<Integer, Integer>) map;
	}
	

}
