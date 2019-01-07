package com.rohit;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Domap{
	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<String,Integer>();
		map.put("A", 1);
		map.put("a", 5);
		map.put("F", 15);
		map.put("Z", 50);
		map.put("B", 11);
	}
}














 class Com implements Comparator<Map.Entry<String,Integer>> {
	public int compare(Entry<String,Integer>e1,Entry<String,Integer>e2) {
		return e1.getValue()-e2.getValue();
	}


}
