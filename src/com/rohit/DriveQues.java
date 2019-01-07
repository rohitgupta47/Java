package com.rohit;

import java.util.Arrays;

public class DriveQues {

	public static void main(String[] args) {
		String in="100wdjf76jdh834er75e5e4hh123f63";
		in=in.replaceAll("[a-z]", " ");
			System.out.println(in);
			in=in.replaceAll("\\s+", " ");//use this for removing spaces
			System.out.println(in);
			String[]arr=in.split(" ");
			int[] ii=new int[arr.length];
			int k=0;
			for(String z:arr) {
				ii[k]=Integer.parseInt(z);k++;
			}
			System.out.println(Arrays.toString(ii));
			int max=ii[0];
			for(int i=0;i<ii.length;i++)
			{
				if(max<ii[i])
					max=ii[i];
			}
			System.out.println("max element is "+max);
		
	}

}
