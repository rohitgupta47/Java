package com.rohit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurences {

	public static void main(String[] args) {
		int count =0;
		String s1="ab",s2="ababbabbbbbbabb";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher(s2);
		while(m.find()) {
			count++;
			System.out.println(m.start()+" "+m.group());
		}
		System.out.println("total no. of occurences "+count);
		
		
			
		
			

	}

}
