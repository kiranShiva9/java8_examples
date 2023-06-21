package com.kiran.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SecondHighestVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val = { 12, 4, 32, 34, 2, 6 };
		Stream<Integer> intval = Arrays.stream(val).boxed();
		Integer second = intval.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(second);

	}

}
