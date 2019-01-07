package stringQues;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Q21 {

	public static void main(String[] args)  {
		String u="ramanujan";
		char[]a=u.toCharArray();     
		TreeMap<Character,Integer>map=new TreeMap<Character,Integer>();
		for(int i=0;i<a.length;i++) {
		if(map.containsKey(a[i]))
			map.put(a[i], (map.get(a[i]))+1);
		else map.put(a[i], 1);
		}
		ArrayList<Entry<Character,Integer>>list=new ArrayList<Entry<Character,Integer>>(map.entrySet());
		for(Entry<Character,Integer>c:list)
			System.out.print(c.getKey()+""+c.getValue()+",");
		}
		
	}


