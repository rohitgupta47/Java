package com.rohit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DriveQues1 {

	public static void main(String[] args) {
		String digi="853";int count=0;
		for(int i=0;i<digi.length();i++) {
			if(Character.isDigit(digi.charAt(i))) {
				count++;
			}
			
		}if(count==digi.length())
			System.out.println("Yes it is digit");
		else System.out.println("not a digit");
		System.out.println("=======================");
		String deci="34352.8";
		System.out.println("deci(deci) "+deci(deci));
		System.out.println("========================");
		System.out.println("alphabets(\"string\") "+alphabets("string"));
		System.out.println("========================");
		System.out.println("alphanumeric "+alphanum("edfe!wq123"));
		aNS("12jdh $##jhg");
	}
	static boolean deci(String d) {
		try {
			double de=Double.parseDouble(d);
		}
		catch(NumberFormatException e) {
			return false;
		}
		return true;
		
	}
	static boolean alphabets(String str) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i)))
				c++;
			}
		if(c==str.length())
			return true;
		return false;
	}
	static boolean alphanum(String aa) {
		int c=0;
		for(int i=0;i<aa.length();i++) {
			if(Character.isAlphabetic(aa.charAt(i))||Character.isDigit(aa.charAt(i)))
				c++;
		}
		if(c==aa.length())
			return true;
		return false;
	}
	static void aNS(String ans) {
		int count=0;
		Pattern p=Pattern.compile("[^a-zA-Z0-9]");
		Matcher m=p.matcher(ans);
		while(m.find()) {
			count++;
			System.out.println(m.start()+" ... "+m.end()+"..."+m.group());
		}
		
	}

}










