package com.pronto.squareofnumbers;

import java.util.ArrayList;
import java.util.List;

public class SquareOfNumber {
	public List<Integer> findSquare(List<Integer> integers) {
		List<Integer> list = new ArrayList<Integer>();
		for (int num : integers) {
			int square = num * num;
			list.add(square);
		}

		return list;
	}
}
