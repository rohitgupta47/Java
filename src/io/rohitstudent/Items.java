package io.rohitstudent;

public class Items implements Comparable{
	private String name;
	private double price;
	public Items(String name, double price) {
		if(price<=0)
			throw new IllegalArgumentException("ENTER SUITABLE PRICE");
		else this.price=price;
		if(name==null||name.trim().equals(""))
			throw new IllegalArgumentException();
		else this.name=name;
			
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Items) {
			Items i=(Items)obj;
			if(this.name.equals(i.name)&&this.price==i.price) 
				return true;
			return false;
			}else throw new IllegalArgumentException("BAD INPUT");
		//return false;
	}
	
	public int compareTo(Object oj) {
		if(oj instanceof Items) {
			Items it=(Items)oj;
		return this.name.compareTo(it.name);	
		}
		return 0;
		
	}
}
