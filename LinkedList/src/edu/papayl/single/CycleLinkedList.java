package edu.papayl.single;

public class CycleLinkedList {
	int count=0;
	Node node5;
	Node head;
	class Node{
		int data;
		Node nextNode;
		public Node(int data) {
			this.data=data;
		}
	}




	public void add(int data){
		Node node=new Node(data);
		if(head==null){
			this.head=node;
			count++;
			return;
		}
		Node current=head;
		while(current!=null){
			if(current.nextNode==null){
				current.nextNode=node;
				count++;
				if(count==5){
				node5=current;
				}
				if(count==12){
				current.nextNode=node5;
				}
				break;
			}
			current=current.nextNode;
		}
	} 

	public String toString(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" ,");
			current=current.nextNode;
		}
		return "";
	}
	
	public void readLoop(){
		Node current=head;
		Node P=current;
		Node Q=current;
		while(P!=null && Q!=null ){
			System.out.println(P.data+"---"+Q.data);
			P=P.nextNode;
			Q=Q.nextNode.nextNode;
			
			if(P==Q){
				System.out.println("MAtch--"+P.data+"---"+Q.data);
				break;
			}
		}
		P=current;
		while(P!=null && Q!=null ){
			System.out.println(P.data+"---"+Q.data);
			P=P.nextNode;
			Q=Q.nextNode;
			
			if(P==Q){
				System.out.println("MAtch--"+P.data+"---"+Q.data);
				break;
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		CycleLinkedList list=new  CycleLinkedList();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		list.add(6);list.add(7);list.add(8);list.add(9);list.add(10);
		list.add(11);list.add(12);
		//System.out.println(list);
		list.readLoop();
		

	}

}
