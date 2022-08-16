package com.Collection;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Ram Chaudhary");
		map.put(2, "Ashish");
		map.put(3, "Praddep");
		
		for(Map.Entry<Integer, String> map1 : map.entrySet())
		{
			Integer key = map1.getKey();
			String value = map1.getValue();
			System.out.println("key-"+key+", value-"+value);
		}
		
		System.out.println("______________________________________");
		
		Student st=new Student("Ram", 1, "SVN", "IT");
		Student st1=new Student("Pradeep", 2, "BBD", "IT");
		Student st2=new Student("Ashish", 2, "BBD", "EE");
		
		HashMap<String, Student> stMap=new HashMap<String, Student>();
		
		stMap.put("student-1", st);
		stMap.put("student-2", st1);
		stMap.put("student-3", st2);
		
		for(Map.Entry<String, Student> student:stMap.entrySet())
		{
			String key = student.getKey();
			Student value = student.getValue();
			if(value.getDepartment().equalsIgnoreCase("IT"))
			{
				System.out.println(value.toString());
			}
		}
		


	}

}
