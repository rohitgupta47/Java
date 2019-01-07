package com.rohit;

import java.util.Arrays;

public class BubRecursion {

	public static void main(String[] args) {
		int[] arr= {3,7,2,5,47,17,15,};/*int temp;
			for(int i=0;i<arr.length;i++) {
				for(int j=1;j<arr.length-1-i;j++) {
					if(arr[j]>arr[j+1]){
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			for(int ar:arr)
			System.out.print(ar+" ");*/
	bubbleSort(arr, arr.length);
	System.out.println("sorted Arrays "+Arrays.toString(arr));
	}
	static void bubbleSort(int[]arr,int n) {
		if(n==1)
			return;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			bubbleSort(arr, n-1);
		}
		
	}

}
