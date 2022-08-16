package StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremApiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<String>();		
		
		list.add("Ajay");
		list.add("A");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("Aman");
		list.forEach(p->{
			System.out.println(p);
		});
	
		List<String> collect = list.stream().filter(p->p.startsWith("A")).collect(Collectors.toList());
		System.out.println("startsWith(\"A\") method== "+collect);
		
		List<Integer> numberList=new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(9);
		numberList.add(67);
		numberList.add(33);
		numberList.add(7);
		numberList.add(33);
		numberList.add(12);
		numberList.add(65);
		numberList.add(87);
		
		Stream<Integer> numberStrem = numberList.stream();
		List<Integer> filterNumberList = numberStrem.filter(p-> p>1).collect(Collectors.toList());
		System.out.println("filter number list=="+filterNumberList);
		
		Stream<Integer> numberStrem1 = numberList.stream();
		numberStrem1.filter(p-> p>1).collect(Collectors.toList()).forEach(element->{
			System.out.println(element);
		});
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("key-1", "value-1");
		map.put("key-2", "value-2");
		map.put("kay-3", "value-3");
		map.put("kay-4", "value-4");
		map.put("kay-5", "value-5");
		System.out.println("Map==="+map);
		Stream<Entry<String, String>> mapStream = map.entrySet().stream();	
		mapStream.forEach(e->{
			System.out.println("key="+e.getKey()+" value="+e.getValue());
			
		});
		
		
		System.out.println("another ways");
		for(Map.Entry<String, String> mapRes : map.entrySet())
		{
			System.out.println("key="+mapRes.getKey()+" value="+mapRes.getValue());
		}
		
		
		
		
	}

}
