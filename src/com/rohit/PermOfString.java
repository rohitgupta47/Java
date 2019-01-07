package com.rohit;

public class PermOfString {

	public static void main(String[] args) {
		String s="morphine";
		re(s,'p');
			
	}
	public static void re(String str,char ch) {
		String e="";
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=ch)
			e=e+str.charAt(i);
		
		}System.out.print(e);
		}

}
