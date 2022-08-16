package com.commonExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindingClosestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindingClosestNo obj=new FindingClosestNo();
		int arra[]= {1,4,2,78,-1};
		int target=3;
		int findClosest = obj.findClosest(target, arra);
		System.out.println("findClosest="+findClosest);
		

	}
	
	public int findClosest(int target, int arr[])
	{
		System.out.println("Finding closest no processs.....");
		int closestValue=0;
		
		Set<Integer> set =new TreeSet<>();
		for(int i:arr)
		{
			set.add(i);
		}
		System.out.println(set);
		
		for(int i:set)
		{
			if(i<=target)
			{
				closestValue=i;
			}
		}
		
		//System.out.println("closest value=="+closestValue);
		return closestValue;
	}

}
