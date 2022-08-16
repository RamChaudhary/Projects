package com.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class CollectionExample {

	
	public static void main(String[] args) {
		
		System.out.println("Collection example....");
		// dublicate are allowed
		//order are preserved
		//sorting does not play any role when we add data in the list
		//ArrayList eaxmple-its work on dynamic arrays
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ram");
		al.add("Pradeep");
		al.add("Shailesh");
		al.add("Deepak");
		System.out.println(al);
		
		//LinkedList example-its work on dublyLinkedList
		LinkedList<String> ll =new LinkedList<String>();
		ll.addAll(al);
		ll.add("Ram");
		System.out.println(ll);

		//Travesing 1-way
		System.out.println("trversing arrayList 1-way");
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
		String item=itr.next();
		System.out.println(item);
	}
	
	//travesing 2-way
	System.out.println("travesing LinkedList 2-way");
	for(String item:ll)
	{
		System.out.println(item);
	}
	
	System.out.println("travesing list 3- ways");
	ll.forEach(itm->{
		System.out.println(itm);
	});
	
	System.out.println("____________________Set Example__________________________");
	
	//Tree set example
	// dublicate are not allowed
	//ascending order sorting
	//order are not preserved
	TreeSet<Integer> set=new TreeSet<>();
	set.add(1);
	set.add(10);
	set.add(3);
	set.add(7);
	set.add(7);
	//set.add(null); occured null pointer exception at runtime if we add null value in set/treeset
	System.out.println(set);
	System.out.println("1-ways of traversing..");
	for(Integer item:set)
	{
		System.out.println(item);
	}
	System.out.println("2-ways of traversing..");
	set.forEach(item->{
		System.out.println(item);
	});
	
	
	System.out.println("HashSet set");
	
	HashSet<Integer> hs=new HashSet<>();
	hs.addAll(set);
	hs.add(0);
	//hs.add(null);//Hashset accepted null value
	System.out.println(hs);
	
	System.out.println("LinkedHashSet example");

	LinkedHashSet<String> lhs=new LinkedHashSet<>();
	lhs.add("Ram");
	lhs.add("aman");
	lhs.add("vijay");
	lhs.add("brajesh");
	System.out.println(lhs);
	
	
	
	System.out.println("_________________Map Example________________");
	//stored values in the key and values pair
	//dublicate keys are not allowed
	//order are not preserved
	
	HashMap<String, String> hm=new HashMap<>();
	hm.put("java", "5000");
	hm.put("javascript", "3000");
	hm.put("spring", "8000");
	hm.put("angular", "5000");
	hm.put("angular", "5001");
	//hm.put("test", null);//we can add null value in hashMap
	//hm.put(null, "value");//we can not add null key in hashMap
	System.out.println(hm);
	
	System.out.println("hash map travesing");
	for(Map.Entry item:hm.entrySet())
	{
		System.out.println(item.getKey()+"-"+item.getValue());
	}
	
	System.out.println("LinkedHashMap example");
	LinkedHashMap<String, String> lhm=new LinkedHashMap<>();
	lhm.putAll(hm);
	lhm.put("python", "10000");
	System.out.println(lhm);
	
	for(Map.Entry item:lhm.entrySet())
	{
		System.out.println(item.getKey()+"-"+item.getValue());
	}
	
	//order are not preserved 
	//ascending order sorting
	//dublicate are not allowed
	System.out.println("Tree map example");
	TreeMap<String, String> tm=new TreeMap<>();
	tm.putAll(lhm);
	tm.put("ajax", "500");
	tm.put("z", "500");
	tm.put("z", "501");
	//tm.put("key", null);//we can add null value in TreeMap
	//tm.put(null, "value");we can not add null key in TreeMap
	System.out.println(tm);
	}
	
	
}
