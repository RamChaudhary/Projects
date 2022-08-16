package com;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" equals and ==");
		String a=new String("Ram");
		String a1=new String("Ram");
		String a2="Ram";
		String a3="Ram";
		if(a.equals(a1))
		{
			System.out.println("equals");
		}
		if(a2==a3)
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
			
		System.out.println("-------------");
		ArrayList<String> str=new ArrayList<String>();
		str.add("1");
		str.add("5");
		str.add("4");
		Collections.sort(str);
		System.out.println("sorted arrayList--"+str);
		
	}

}
