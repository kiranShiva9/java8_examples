package com.kiran.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ilovegangakiran";
		String[] split = s.split("");
		Stream<String> stream = Arrays.stream(split);
		Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		String firstKey = map.entrySet().stream().filter(m -> m.getValue() == 1).findFirst().get().getKey();
		System.out.println(firstKey);
	}

}
