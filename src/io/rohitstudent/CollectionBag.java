package io.rohitstudent;

import java.util.Collection;

public class CollectionBag {
	private Collection <Items> col;

	public CollectionBag(Collection<Items> col) {
		if(col==null) {
			throw new IllegalArgumentException();
		
		}
		else this.col = col;
	}

	@Override
	public String toString() {
		return "CollectionBag [col=" + col + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((col == null) ? 0 : col.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollectionBag other = (CollectionBag) obj;
		if (col == null) {
			if (other.col != null)
				return false;
		} else if (!col.equals(other.col))
			return false;
		return true;
	}
	public boolean searchItem(Items i) {
		for(Items it:col) {
			if(it.equals(i))
				return true;
		}return false;
	}
	public double printTotalPrice() {
		double sum=0;
		for(Items i:col) {
			sum=sum+i.getPrice();
		}return sum;
	}
	public double getItemPrice(String name) {
		for(Items c:col) {
			if(c.getName().equals(name))
				return c.getPrice();
			
		}return 0;
	}
	
}
