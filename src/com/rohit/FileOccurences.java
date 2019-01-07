package com.rohit;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileOccurences 
{
	public static void main(String[] args) 
	{
		File f=new File("/home/uttara/Desktop/rohit/src");
		Map<String,Integer> map=new HashMap<String,Integer>();
		read(f,map);
		
		System.out.println(map);
	}

	private static void read(File f, Map<String, Integer> map) 
	{
		if(f.isDirectory())
		{
			File[] fa=f.listFiles();
			
			for(File fl:fa)
				read(fl,map);
		}
		else
		{
			String[] sa=f.getName().split("\\.");
			String name=sa[sa.length-1];
			
			if(map.get(name)==null)
			{
				map.put(name, 1);
			}
			else
				map.put(name, map.get(name)+1);
		}
	}
}
