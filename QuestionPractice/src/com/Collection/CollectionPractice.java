package com.Collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.commonExample.CalculateTime;

public class CollectionPractice {

	public static void main(String[] args) throws Exception{
		
		System.out.println("-----------List------------------");
		/**
		 * ArrayList internally used dynamic array
		 * order are preserved
		 * dublicates are allowed.  
		 */
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Prashant");
		list.add("Deepak");
		list.add("Praddep");
		list.add("Ram");
		System.out.println("ArrayList="+list);
		
		
		/**
		 * LinkedList internally used Dubly-link-list
		 * order are preserved
		 * dublicates are allowed.
		 * performance is fast as compare to ArrayList
		 */
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.addAll(list);
		linkedList.add("Praddep");
		System.out.println("LinkedList="+linkedList);

		/*Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}*/
		
		System.out.println("-----------Set------------------");
		/**
		 * Dublicats are not allowed
		 * order are not preserved
		 * ascending order sorting by default 
		 * null is allowed but NullPointerException occured at run time
		 */
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(9);
		treeSet.add(2);
		treeSet.add(5);
		treeSet.add(8);
		treeSet.add(7);
		//treeSet.add(null);
		System.out.println("treeSet="+treeSet);
		
		/**
		 * Dublicate are not allowed
		 * order are not preserved
		 * ascending order sorting by default provided by hashSet
		 * null is allowed
		 */
		HashSet<Integer> hashSet=new HashSet<>();
		hashSet.add(4);
		hashSet.add(7);
		hashSet.add(9);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(5);
		hashSet.add(10);
		hashSet.add(null);
		System.out.println("hashSet="+hashSet);
		
		/**
		 * Dublicate are not allowed
		 * order are preserved 
		 * sorting does not play any role
		 * null is allowed
		 */
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add(9);
		linkedHashSet.add(5);
		linkedHashSet.add(1);
		linkedHashSet.add(7);
		linkedHashSet.add(9);
		linkedHashSet.add(3);
		linkedHashSet.add(2);
		linkedHashSet.add(8);
		linkedHashSet.add(null);
		
		System.out.println("linkedHashSet="+linkedHashSet);
		
		System.out.println("-----------Map------------------");
		/**
		 * value stored key and value pair
		 * order are not preserved
		 * ascending order sorting provide on the basis of keys
		 * dublicate keys are not allowed but dublicate values are allowed
		 * Null key and null value are allowed
		 */
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1, "Ram");
		hashMap.put(2, "Pradeep");		
		hashMap.put(4, "Prashant");
		hashMap.put(5, "Deepak");
		hashMap.put(3, "Shailesh");
		hashMap.put(null, null);
		System.out.println("hashMap="+hashMap);
		
		/**
		 * value stored key and value pair
		 * order are preserved
		 * sorting does not play any role
		 * dublicate keys are not allowed but dublicate value are allowed
		 * null key and null value are allowed
		 * 
		 */
		LinkedHashMap<Integer, String> linkedHashMap=new LinkedHashMap<>();
		linkedHashMap.put(1, "Ram");
		linkedHashMap.put(2, "Pradeep");		
		linkedHashMap.put(4, "Prashant");
		linkedHashMap.put(5, "Deepak");
		linkedHashMap.put(3, "Shailesh");
		linkedHashMap.put(3, "SHAILESH");
		linkedHashMap.put(null, null);
		System.out.println("linkedHashMap="+linkedHashMap);
	}

}
