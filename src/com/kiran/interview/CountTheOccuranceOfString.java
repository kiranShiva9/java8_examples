package com.kiran.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//count the each character occurance

public class CountTheOccuranceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ilovekiran";
		String[] split = s.split("");
		Stream<String> stream = Arrays.stream(split);
		//Map<String, List<String>> map = stream.collect(Collectors.groupingBy(m -> m));
		//System.out.println(map);
		Map<String, Long> map2 = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(map2);
	
	
}

}
