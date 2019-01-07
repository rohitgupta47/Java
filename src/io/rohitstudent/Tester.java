package io.rohitstudent;
//Q6 program on interface
public class Tester {

	public static void main(String[] args) {
		Spanner s=new Spanner();//spanner has two parent now so spanner object can be used by three refernces   
		Thing th=new Spanner();
		Tool t=new Spanner();
		s.doSomething();th.doSomething();t.doSomething();//these 3 line code will have same o/p
			th=new Tubelight();
			th.doSomething();
			th=new Vehicle();
			th.doSomething();
			Vehicle v=(Vehicle)th;
			v.doSomething();
			v.drive();
	Person p=new Person();
	System.out.println("person doing test on spanner using its reference");
	p.testThing(s);
	System.out.println("person doing test on spanner using Tool reference");
	p.testThing(t);
	System.out.println(" now person testing tubelight");
	p.testThing(new Tubelight());
	System.out.println("now person testing vehicle as well");
	p.testThing(new Vehicle());
	}

}
