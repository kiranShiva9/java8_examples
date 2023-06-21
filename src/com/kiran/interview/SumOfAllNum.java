package com.kiran.interview;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		int sum = integerList.stream().mapToInt(Integer::valueOf).sum();
		System.out.println(sum);
	}

}
