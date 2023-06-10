package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {
public static void main(String[] args) {
	
	HashMap map=new HashMap();
	map.put(101, "harsh");
	map.put(102, "gita");
	map.put(103, "sita");
	map.put(104, "mita");
	map.put(105, "heer");
	map.put(106, "archana");
	map.put(107, "anjali");
	
	System.out.println(map);
	
	System.out.println(map.get(103));
	System.out.println(map.entrySet());
	System.out.println(map.keySet());
	System.out.println(map.values());
	Set set=map.entrySet();
	Iterator itr=set.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
