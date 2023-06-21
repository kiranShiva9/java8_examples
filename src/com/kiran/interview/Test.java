package com.kiran.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	

	public static void getdetails(String[] s) {
		
		List<Integer> li= new ArrayList<Integer>();
		for (String string : s) {
			try {
				int parseInt = Integer.parseInt(string);
				li.add(parseInt);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		List<String> asList = Arrays.asList(s);
		//asList.stream().filter().collect(Collectors.toList());
		List<Integer> collect2 = asList.stream().map(s1-> Integer.parseInt(s1)).collect(Collectors.toList());
		List<Integer> collect = collect2.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
	}
	public static void main(String[] args) {
		
		 getdetails(new String[]{"1","3","4","2", "5", "11"});	
		 getdetails(new String[]{"1","3","7abc","4","2","xyz8", "5"});	
		//System.out.println(integers.toString());
				
	}
}
