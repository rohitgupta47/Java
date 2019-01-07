package com.rohit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortMaps {

	public static void main(String[] args) {
	Map<String,Integer>map=new LinkedHashMap<String,Integer>();
	map.put("raj", 29);
	map.put("ram", 42);
	map.put("mohan", 5);
	map.put("rabindra",6);
	map.put("nath", 24);
	map.put("Tagore", 25);
	map.put("filmy", 46);
	
	
	
	ArrayList <Entry<String,Integer>>list=new ArrayList<Entry<String,Integer>>(map.entrySet());
	
	Collections.sort(list, new ValueComp1());
	
	for(Entry<String,Integer>v:list)
	{
		System.out.println(v);
	}
	}

}
class ValueComp1 implements Comparator<Entry<String,Integer>>
{
	public int compare(Entry<String,Integer>e1,Entry<String,Integer>e2)
	{
		return e1.getValue().compareTo(e2.getValue());
	}
}