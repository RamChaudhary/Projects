package com.Question;

import java.util.TreeSet;

public class FindingDublicateCharInString {
	public static void main(String[] args) {
		String str="Hello this is java program";
		TreeSet<Character> ts=new TreeSet<Character>();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				char b=str.charAt(j);
				if(String.valueOf(a).equalsIgnoreCase(String.valueOf(b)))
				{
					count++;
				}
				
			}
			if(count>=2)
			{
				ts.add(a);
				//System.out.println(a+" is a dublicate characters in the following string-"+str);
				
			}
			count=0;
		}
		System.out.println("Dublicate characters is-"+ts);
		
	}
	
	

}
