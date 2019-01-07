package io.rohitstudent;

public class Duck implements Ducks {

	int size;
	//static int count=0;
	public Duck(int size) {
		this.size=size;
		//count++;
	}
	public void swim() {
		if(size==Ducks.chota)
		{
			System.out.println("chota duck swimming fast");
		}
		if(size==Ducks.bada)
		{
			System.out.println("bada duck swimming slow");
		}
		if(size==Ducks.biggest)
		{
			System.out.println("biggest duck not oving anywhere");
		}
		
		
	}
	@Override
	public void l() {
		// TODO Auto-generated method stub
		
	}

}
