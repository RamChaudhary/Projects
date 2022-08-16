package com.Question;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindDublicateNumber {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		TreeSet<Integer> dublicateSet=new TreeSet<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(2);
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			int a=list.get(i);
			for(int j=i;j<list.size();j++)
			{
				int b=list.get(j);
				if(a==b)
				{
					count++;
				}
				//System.out.println(a+","+b+","+count);
			}
			if(count>=2)
			{
				dublicateSet.add(a);
				//System.out.println("Dublicate value is--"+a);
			}
			count=0;
		}
		System.out.println("Dublicate value is--"+dublicateSet);
		
	}

}
