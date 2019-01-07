package com.rohit;
//
public class CommonStrings {

	public static void main(String[] args) {
		String s1="I love my country India";
		String s2="I love my goes";
		String[] ss1=s1.split(" ");
		String[] ss2=s2.split(" ");
		String[] x=new String[ss1.length];int p=0;
		int count=0;
		if(ss1.length>ss2.length) {
			for(int i=0;i<ss1.length;i++) {
				for(int j=0;j<ss2.length;j++) {
					if(ss1[i].equals(ss2[j])) {
						x[p]=ss1[i];p++;count++;
					}
				}
			}
		}System.out.println("total "+count+" number of words are common");
		for(String temp:x) {
			System.out.println(temp);
		}

	}

}
