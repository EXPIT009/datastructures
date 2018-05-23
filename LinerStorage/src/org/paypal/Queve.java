package org.paypal;
/*
 * Queve is can implement Array and List both;
 * but best useing linked list 
 * */
public class Queve {
	
	class Node{
		int data;
		Node nextNode;
		Node(int data){
			this.data=data;
		}
	} 
	Node front;
	
	public void enqueve(int data){
		Node node=new Node(data);
		if(front==null){
			front=node;
			return ;
		}
		Node current=front;
		while(current!=null){
			if(current.nextNode==null){
				current.nextNode=node;
				break;
			}
			current=current.nextNode;
		}
		
	}
	
	public void deQueve(){
	front=front.nextNode;
	}
	
	@Override
	public String toString() {
		Node current=front;
		while(current!=null){
			System.out.println(current.data);
			current=current.nextNode;
		}
		return "";
	}
	
	
	
	public static void main(String[] args) {
		Queve q=new Queve();
		q.enqueve(1);
		q.enqueve(2);
		q.enqueve(3);
		q.enqueve(4);
		q.enqueve(5);
		System.out.println(q);
		q.deQueve();
		System.out.println(q);
		
	}

}
