package io.rohitstudent;

import java.util.Arrays;

public class StackArrayTest {

	public static void main(String[] args) {
		StackArray a=new StackArray();
		//push pop printElements peek
			a.push(90);	a.push(15);	a.push(52);	a.push(23);	a.push(87);	//a.push(56);	a.push(34);
			a.printElements();
			//System.out.println(a.pop());
			a.pop();a.pop();
			System.out.println("====");
			a.printElements();
			a.peek();
			
			System.out.println(a.count+" a.count");
	}

}
