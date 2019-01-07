package com.rohit;
import java.util.ArrayList;
import java.util.List;

public class WordNotPre {

	public static void main(String[] args) {
		String s1="words are worthy not hands";
		String s2="These are my words";
		List<String>l1=new ArrayList<String>();
		List<String>l2=new ArrayList<String>();
		List<String>l3=new ArrayList<String>(19);
		String[]ss1=s1.split(" ");
		String[]ss2=s2.split(" ");
		for(String x1:ss1) {l1.add(x1);}
		for(String x2:ss2) {l2.add(x2);}
		for(String s:l1) {
			if(!l2.contains(s)) {
				l3.add(s);
			}
		}System.out.println(l3);
		}
			
		

	

}
