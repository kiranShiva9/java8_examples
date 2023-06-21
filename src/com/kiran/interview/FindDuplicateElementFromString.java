package com.kiran.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateElementFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ilovegangakiran";
		String[] split = s.split("");
		Stream<String> stream = Arrays.stream(split);

		Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<String> duplicateList = map.entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(duplicateList);
		System.out.println(map);
		List<String> uniqList = map.entrySet().stream().filter(m -> m.getValue() == 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(uniqList);

		/*
		 * Map<String, List<String>> map3 = stream.collect(Collectors.groupingBy(m ->
		 * m));
		 * 
		 * System.out.println(map3);
		 */
	}

}
