package com.kiran.interview;

public class Test2 {

	public static void checkSubStringPolindrom(String s) {
		
		char[] charArray = s.toCharArray();
		
		for (int i = 0; i < charArray.length-1; i++) {
			//String s1=charArray[i]+"";
			for (int j = 1; j < charArray.length; j++) {
				String s2=""+charArray[i]+charArray[j];
				StringBuffer sb= new StringBuffer(s2);
				if(!sb.reverse().toString().equals(s2)) {
					break;
				}
				if(sb.reverse().toString().equals(s2)) {
					System.out.println(s2);
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkSubStringPolindrom("abaab");
	}

}
