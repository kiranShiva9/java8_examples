package com.kiran.interview;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> val = Stream.of(1, 2, 3, 4, 5);

		Integer min = val.min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
	}

}
