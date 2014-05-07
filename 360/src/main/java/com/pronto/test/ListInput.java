package com.pronto.test;

import java.util.ArrayList;
import java.util.List;

import com.pronto.squareofnumbers.SquareOfNumber;

public class ListInput {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		SquareOfNumber squareNumber = new SquareOfNumber();
		List<Integer> findSquare = squareNumber.findSquare(list);
		System.out.println(findSquare);

	}
}
