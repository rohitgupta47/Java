package com.rohit;
import java.util.*;
import java.util.Map.Entry;
public class CountryCapital
{

	public static void main(String[] args)
	{
		int x=0;
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		Map<String,String>map=new TreeMap<String,String>();
		while(x!=5)
		{
			System.out.println("press 1 for input countries and capitals names");
			System.out.println("press 2 for searching capital of country");
			System.out.println("press 3 for listing capitals with countries");
			System.out.println("press 4 for sorting on countries names");
			System.out.println("press 5 for sorting on capital of countries");
			
			System.out.println("enter your choice");
			x=s.nextInt();
			
			switch(x)
			{
			
			case 1:
			{
				System.out.println("enter country  name to add into  map");
				String country=s1.nextLine();
				System.out.println("enter capital name to add into  map");
				String capital=s1.nextLine();
				map.put(country, capital);
				break;
			}
				
			case 2:
			{
				System.out.println("enter name of country for which capital is to be searched");
				String c=s1.nextLine();
				if(map.containsKey(c))
					System.out.println(c+" capital is "+map.get(c));
				else System.out.println("name you entered has not found");
				break;
			}
			
			case 3:
			{
				
				Set<Entry<String, String>> mapSet = map.entrySet();
				
				for(Entry<String, String> e : mapSet)
				{
					System.out.print(e.getKey());
					System.out.print(" = ");
					System.out.println(e.getValue());
				}
				break;
			}
			
			case 4:
			{
				Set<String>key=map.keySet();
				LinkedList set=new LinkedList(key);
				Collections.sort(set, new MenuComparator());
				System.out.println("sorting countries names "+set);
			}
			
			case 5:
			{
				
			ArrayList<Entry<String,String>>list=new ArrayList<Entry<String,String>>(map.entrySet());	
				Collections.sort(list, new ValueComp());
				for(Entry<String,String>v:list) {
					System.out.println(v);
				}
			}
			}
		}

	}
	

}/*				ValuesSort vs = new ValuesSort(map);

				Map<String, String> sortedMap = new TreeMap<String, String>(vs);
				
				sortedMap.putAll(map);
				
				Set<Entry<String, String>> sortedSet = sortedMap.entrySet();
				for(Entry<String, String> e : sortedSet)
				{
					System.out.print(e.getKey());
					System.out.print(" = ");
					System.out.println(e.getValue());
				}
				break;*/
class ValueComp implements Comparator<Entry<String,String>>
{
	public int compare(Entry<String,String>e1,Entry<String,String>e2)
	{
		return e1.getValue().compareTo(e2.getValue());
	}
}