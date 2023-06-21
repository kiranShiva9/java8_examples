package com.kiran.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;

public class Test3 {

	public static void repeatedIntegers(int[] val,int[] val2) {
		/*
		 * Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		 * 
		 * for (int i : val) {
		 * 
		 * if(map.containsKey(i)) { map.put(i,map.get(i)+1); } else { map.put(i,1); }
		 * 
		 * }
		 * 
		 * Set<Entry<Integer, Integer>> entrySet = map.entrySet(); for (Entry<Integer,
		 * Integer> entry : entrySet) { if(entry.getKey().equals(v))
		 * System.out.println(entry.getKey() +" its count is: "+entry.getValue()); }
		 */
		/*
		 * IntStream stream = Arrays.stream(val); long count = stream.filter(i
		 * ->i==v).count(); System.out.println(count);
		 */
		
		List<Integer> list= new ArrayList<Integer>();
		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < val2.length; j++) {
				if(val[i] == val2[j]) {
					list.add(val[i]);
				}
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {

		int[] val ={4,5,6,3,1,2};
		int[] val2 ={5,4,7,6,8,9};
		//repeatedIntegers(val,1);
		repeatedIntegers(val, val2);
	
	}

}
