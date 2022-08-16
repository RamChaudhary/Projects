package com.commonExample;

public class FindingCapitalLetter {

	public static void main(String[] args) {
		
		
		//finding first capital letter from second words
		String str="Welcome to Beautiful World";
		String[] splitStr = str.split(" ");
		
		for(int i=1;i<splitStr.length;i++)
		{
			String strWord=splitStr[i];
			char firstChar = strWord.charAt(0);
			if(Character.isUpperCase(firstChar))
			{
				System.out.println(firstChar);
			}
		}
		

	}

}
