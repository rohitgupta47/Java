package com.rohit;

public interface List<T> {
		public void add();
		public void print();
		public boolean contains();
		public boolean remove();
		public int size();
		public boolean isEmpty();
		public boolean isCyclic();
		public T findMiddle();
}
