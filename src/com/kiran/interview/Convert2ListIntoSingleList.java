package com.kiran.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Convert2ListIntoSingleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> integerList1 = Arrays.asList(1,2,3,4);
	        List<Integer> integerList2 = Arrays.asList(5,6,7);
	        
	        Stream<Integer> concat = Stream.concat(integerList1.stream(),integerList2.stream());
	        concat.forEach(System.out::println);
	}

}
