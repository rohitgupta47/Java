package io.rohitstudent;

public class StackArray implements Stack {
	int[] arr=new int[10];
	int count=0;
	public void push(int element) {
		if(count <arr.length ) {
			arr[count]=element;
			count++;
		}
		
	}
	public int pop() {
		if(count>0) {
			
			return arr[--count];
		}
		else return -1;
	}
	
	public int peek() {
		if(count>0)
		return arr[count];
		else return -1;
	}

	
	public void printElements() {
		for(int x=0; x < count; x++) {
			System.out.println(arr[x]);
		}
		
	}

}
