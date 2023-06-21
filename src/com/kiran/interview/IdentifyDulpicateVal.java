package com.kiran.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IdentifyDulpicateVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set= new HashSet<Integer>();
		List<Integer> dupIntegers = myList.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
		System.out.println(dupIntegers);
		
	}

}
