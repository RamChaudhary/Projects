package com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MyPracticalClass {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		System.out.println("######## String Reversal #############");
		String str="Ram Chaudhary";
		String reveseString="";
		for(int i=str.length();i>0;i--)
		{
			reveseString=reveseString+str.charAt(i-1);
		}
		System.out.println("Input String="+str+"\nOutPut String="+reveseString);
		
		
		
		System.out.println("###### Write logic to extract numeric values from an alphanumeric string without usring any pre define function###########");
		String str1="(781)456-1289";
		String outPutString="";
		 outPutString=str1.replace("(", "");
		 outPutString=outPutString.replace(")", "");
		 outPutString=outPutString.replace("-", "");
		System.out.println("Input String="+str1+"\nOut put String="+outPutString);
		
		
		
		
		System.out.println("########### Write logic to find sum of digit of a number ###########");
		int inputNumber=546729;
		System.out.println("Input Number="+inputNumber);
		int allSUm=0;
		for(int i=0;i<6;i++)
		{
		int lastDigit=inputNumber%10;
		 inputNumber=inputNumber/10;
		 allSUm=allSUm+lastDigit;
		}
		System.err.println("nSum of digit="+allSUm);
		
		System.out.println("########### Write logic to find unique number from an array of number and populate into another array ###########");

		ArrayList array= new ArrayList();
		array.add(40);
		array.add(30);
		array.add(19);
		array.add(4);
		array.add(16);
		array.add(43);
		array.add(4);
		array.add(39);
		array.add(16);
		array.add(55);
		array.add(86);
		array.add(30);
		System.out.println(array);
		
		
	}
}
