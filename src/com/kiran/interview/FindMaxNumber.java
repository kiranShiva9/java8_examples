package com.kiran.interview;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lval = List.of(1, 2, 3, 4, 6);
		Stream<Integer> val = Stream.of(3, 5, 2, 5, 6, 67);
		Integer max = val.max(Integer::compare).get();
		System.out.println(max);
		Integer Lmin = lval.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(Lmin);
		Integer integer = lval.stream().max(Integer::compare).get();
		System.out.println(integer);
	}

}
