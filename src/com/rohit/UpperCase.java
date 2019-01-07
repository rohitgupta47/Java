package com.rohit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UpperCase {

	public static void main(String[] args) {
	String[] s= {"four","five","Six","two","Three","four","two","Three","four"};
	ArrayList<String>list=new ArrayList<String>();
	for(String p:s) {
		for(int i=0;i<p.length();i++) {
				if(!Character.isUpperCase(p.charAt(i)))
						list.add(p);
					if(p.equals(s[s.length-1]))
						break;
		}
	}
	
	
	String[] n=new String[list.size()];
	n=list.toArray(n);
	for(String q:n)
		System.out.print(q+" : ");
	
	
	
/*	print size of each word
String s1="there was a tiger in the jungle";
String[] ar=s1.split(" ");
int []in=new int[ar.length];
int k=0;
for(String p:ar) {
	in[k]=p.length();
	System.out.print(p+" "+in[k]+" ");
	k++;
}*/

//to reverse every word of an array	
	
	/*for(String q:s) {
		String o="";
		for(int i=q.length()-1;i>=0;i--) {
			o=o+q.charAt(i);
	
		}
		System.out.print(o+",");
	}*/
	
	
	
	/*String z="programming is programming";
	int i=z.indexOf("gram"),o=z.lastIndexOf("gram");
	
	System.out.println("gram in a given string at position from "+(i+1)+"");
	System.out.println("int i=z.lastIndexOf(\"gram\") "+o);
	}*/

}}

