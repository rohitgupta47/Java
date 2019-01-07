package com.rohit;

import java.util.Comparator;
import java.util.Map;

public class ValuesSort implements Comparator<String>
{
	
	Map<String, String> map;
	
	public ValuesSort(Map<String, String> map)
	{
		this.map = map;
	}

	@Override
	public int compare(String arg0, String arg1)
	{
		return map.get(arg0).compareTo(arg1);
	}
	
}
