package com.rohit;
//WAP to sort with & without repetition
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileIORepetion {

	public static void main(String[] args) {
	File f=new File("/home/uttara/Desktop/rohit.txt");
	String line;
	List list=new ArrayList();
	Set set=new TreeSet(new MyComparator());
	BufferedReader br=null;
	try {
		br=new BufferedReader(new FileReader(f));
		if((line=br.readLine())!=null) {
			
			String[] arr=line.split(" ");
			for(String st:arr) {
				System.out.println(st);
				list.add(st);
				set.add(st);
			}	Collections.sort(list,new MyComparator());
			System.out.println("sorting with repetition "+list);
			System.out.println("sorting without repetition "+set);
			br.close();
		}
	}catch(IOException e) {e.printStackTrace();}
	
	}
	
	
}
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return -arg0.compareTo(arg1);
	}
	
}
