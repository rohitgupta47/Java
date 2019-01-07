package io.rohitstudent;
//Q6 program on interface
public class Vehicle implements Thing {
String name;
	public void drive() {
	System.out.println(" vehicle drive method "+name);	
	}
	public void doSomething() {
		
		System.out.println("Vehicle doSomething "+name);
	}

}
