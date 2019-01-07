package com.rohit;

public class SinglyLinkedList<T> implements List<T> {
		private Node<T> first;
		private Node<T> last;
		private int size;
	
	public void add(Node<T> n) {
		
		if((first==null)&&(last==null))
			first=last=n;
		else {
			last.next=n;
			last=n;
		}
		size++;
	}

	
	public void print() {
		Node<T> temp=first;
		while(temp!=null) {
			System.out.println(temp.data+",");
		}System.out.println();
		
	}

	
	public boolean contains(T ele) {
		Node<T> temp=first;
		while(temp!=null) {
			if(temp.data.equals(ele))
				return true;
			temp=temp.next;
			
		}
		return false;
	}

	
	public boolean remove(T ele) {
		Node <T>temp=first,prev=null;
		while(temp!=null) {
			if(temp.data.equals(ele)) {
				if(prev==null)
					first=temp.next;
				else {
					prev.next=temp.next;
					temp.next=null;
				}
				size--;
				return true;
		
			}
			else {
				prev=temp;
				temp=temp.next;
			}
		}
		
		return false;
	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean contains() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isCyclic() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public T findMiddle() {
		// TODO Auto-generated method stub
		return null;
	}
}

	

	
