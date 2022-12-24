package com.velocity;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		
		String s="hello";
		
		System.out.println(s.length());
		
		char [] ch=s.toCharArray();
		
		Map<Integer, Character> map=new HashMap<Integer, Character>();
		
		for(int i=1;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				map.put(i, ch[j]);
				i++;
			}
		}System.out.println("Length of String>>"+map.size());
		
	}

}
