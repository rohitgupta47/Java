package com.rohit;

public class AddMatrix {

	public static void main(String[] args) {
		
		/*int[][] a= {{12,23,21,14},
				      {9,6,4,3}};
		int[][] b= {{5,7,8,9}
				   ,{7,8,4,2}};
		int[][]sum=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			System.out.println(sum[i][j]);
			}
		}*/
		//TRANSPOSE OF MATRIX
	/*	int a[][]=  {{1,2,3,4},
				    {5,7,4,10}};
	int row=a.length;
	int col=a[0].length;
	int[][] arr=new int[col][row];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
		
		
			arr[j][i]=a[i][j];
		System.out.print(arr[j][i]+" ");
		}
	}*/
		//PRODUCT OF TWO MATRIX
		int[][] a= {{12,23,21,14},
			      {9,6,4,3}};
	int[][] b= {{5,7},
			    {8,9}
			   ,{7,8}, 
			    {4,2}};
	int r1=2,c1=4,r2=4,c2=2;
	int[][] product=new int[r1][c2];
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c2;j++) {
			for(int k=0;k<c1;k++) {
			product[i][j]+=a[i][k]*b[k][j];
			}
		}
	}
	for(int[] row:product) {
		for(int column:row) {
			System.out.print(column+" ");
		}
	}
	System.out.println();
	}

}
