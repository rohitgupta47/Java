package com.rohit;

import java.util.*;
import java.util.Map.Entry;
public class SortMap  {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String ,Integer>();
		map.put("apple", 9);
		map.put("banana", 3);
		map.put("pineapple", 5);
		map.put("guava", 8);
		System.out.println(map);
		
		ArrayList<Entry<String,Integer>>list=new ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(list,new MapComparator());
		System.out.println(list);
	}

}
class MapComparator implements Comparator<Entry<String,Integer>>{
	public int compare(Entry<String,Integer> arg0, Entry<String,Integer> arg1) {
		return arg0.getValue().compareTo(arg1.getValue());
	}
}