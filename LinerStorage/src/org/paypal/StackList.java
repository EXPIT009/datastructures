package org.paypal;
/*
 * Stack is work like LIFO (Last In First Out)
 * Stack internal data structures should be Array becouse be can  give the error Stack Over flow
 * But it possible to implement by  Linked List
 * */
public class StackList {
	
	class Node{
		int data;
		Node prviousNode;
		Node nextNode;
		
		Node(int data){
			this.data=data;
		}
	}
	Node top;
	private Node last;
	
	
	public void push(int data){
		
		
	}
	
	@Override
	public String toString() {
		Node current=top;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.nextNode;
			
		}
		return "";
	}

	
	public static void main(String[] args) {
		StackList s=new StackList();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		System.out.println(s);
		
	}
}
