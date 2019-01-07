package io.rohitstudent;
//Q6 program on interface
public class Person {
		public void testThing(Object o) {
			if(o instanceof Spanner) {
				Spanner s=(Spanner)o;
				s.doSomething();
			}
			if(o instanceof Tubelight) {
				Tubelight t=(Tubelight)o;
				t.doSomething();
			}
			if(o instanceof Vehicle) {
				Vehicle v=(Vehicle)o;
				v.name="TATA";
				v.drive();v.doSomething();
			}
		}
}
