package com.Question;

import java.util.HashMap;
import java.util.Map;

public class SubQuestion1 {
	public static void main(String[] args) {
		
		Map<Question1, String> hm=new HashMap<Question1, String>();
		hm.put(new Question1("Aman"), "1");
		hm.put(new Question1("Aman"), "2");
		
		
		Question1 str=new Question1("Aman");
		
		System.out.println(hm.get(str));
		
	}

}
