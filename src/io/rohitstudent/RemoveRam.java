package io.rohitstudent;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveRam {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
list.add("ramanna");list.add("manna");list.add("raga");list.add("lula");list.add("rama");list.add("anna");
			Iterator<String> it=list.iterator();
			while(it.hasNext()) {
				
				String f=it.next();
				if(f.contains("ram"))
				{
					it.remove();
				}
			}
			System.out.println(list);


}
}
