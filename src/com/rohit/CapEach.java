package com.rohit;

public class CapEach {

	public static void main(String[] args) {
		//WAP to capitalize each first letter of word in a given String
		String dtr="this is uttara";
		String []cap=dtr.split(" ");
		String empty="";
		for(String s:cap) {
			String first=s.substring(0,1);
			String re=s.substring(1);
			empty=empty+first.toUpperCase()+re+" "; 
		
		}
		System.out.println("WAP to capitalize each first letter of word in a given String "+ empty);
		
		
		String e="";
		for(String s1:cap) {
			for(int i=s1.length()-1;i>=0;i--) {
				e+=s1.charAt(i);
			}
			e=e+" ";
		}
		System.out.println("wap to reverse each word of string "+e);
		
		
		
		int count=0;
		for(String s2:cap)
				count++;
		System.out.println("no. of words in string "+count);
	}

}
