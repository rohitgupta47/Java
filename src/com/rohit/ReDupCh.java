package com.rohit;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReDupCh {

	public static void main(String[] args) {
	//	REMOVE DUPLICATE CHARACTERS FROM STRING
		  String s="MISSISSIPPI";String temp="";
		  String[] arr=s.split("");
		  Set<String> set =new LinkedHashSet();
		  for(int i=0;i<arr.length;i++)
			  set.add(arr[i]);
		  System.out.println(set+" sahi hai");
		  						
		  for(String ch:set)
			  temp=temp+ch;
		  System.out.println(temp+"   trtr");
		  
		  
		  													
		  
		  
		  
		
		
		
		
		
		
		
		//SORT UNSORTED ARRAY by BUBBLE SORT
	/*	int[] arr= {4,2,5,9,6,12,3,4,5,6,13};
		Arrays.sort(arr);
		System.out.println("Arrays.Sort() ");
		for(int z:arr)
			System.out.print(" "+z);
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}System.out.println();
		System.out.println("Bubble sort method ");
		for(int z:arr) {
			System.out.print(z+" ");
		}*/
		
		
		//removing duplicates by concatnating String method  
		/*String s=" ";
		for(int i=0;i<arr.length-1;i++) {
		if(arr[i]!=arr[i+1])
		s=s+arr[i]+" ";	
		}
		System.out.println();
		System.out.println(s);*/
		
		
		
		
		/*REMOVE DUPLICATES BY USING COMPRING EACH ELEMENT THEN ADDING TO TEMP ARRAY 
		int[] tem=new int[arr.length];int j=0;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]!=arr[i+1])
				{tem[j]=arr[i];
				j++;}
			}System.out.println();
			for(int i=0;i<tem.length;i++) 
			System.out.print(tem[i]+" ");*/
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
