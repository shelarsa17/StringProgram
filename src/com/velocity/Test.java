package com.velocity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		
		String s="hello";
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
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
