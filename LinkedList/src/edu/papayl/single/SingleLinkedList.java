package edu.papayl.single;

public class SingleLinkedList {
 class Node {
	 int data;
		Node nextNode;
		public Node(int data) {
			this.data = data;
		}}
	
	Node head;
	int size=0;
	public void add(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			size++;
		}else{
			Node current=head;
			while(current!=null){
				if(current.nextNode==null){
					current.nextNode=newNode;
					size++;
					break;
				}
				current=current.nextNode;
			}
		}
	}
	
	public void reverseList(Node node){
		if(node==null){
			return;
		}
		reverseList(node.nextNode);
		System.out.print(node.data+" ,");
	}
	
	
	@Override
	public String toString()
	{
		String tostr="[ ";
		Node currentNode=head;
		while(currentNode!=null){
			tostr+=currentNode.data+" ,";
			currentNode=currentNode.nextNode;
		}
		tostr=tostr.substring(0, tostr.length()-2)+" ]";
		return tostr;
	}
	
	public int findMidle(){
		Node current=head;
		int count=0;
		while(current!=null){
			count++;
			if(count== size/2){
				return current.data;
			}
			
			current=current.nextNode;
		}
		return 0;
	}
	public int getSize(){
		return size;
	}
	
	public void findMidel(){
		Node node1=head;
		Node node2=head;
		int length=0;
		while(node2!=null){
			length++;
			if( node2.nextNode==null){
				break;
			}
			if(length!=1){
			node1=node1.nextNode;
			}
			node2=node2.nextNode.nextNode;
			
			
		}
		System.out.println(node1.data);
	}
	
	
	
	public boolean deleteElement(int data){
		Node currentNode=head;
		if(currentNode.data==data){
			head=currentNode.nextNode;
			return true;
		}else{
			while(currentNode!=null){
				if(currentNode.nextNode.data==data){
					currentNode.nextNode=currentNode.nextNode.nextNode;
					return true;
				}
				currentNode=currentNode.nextNode;
			}
		}
		return false;
	
	}
	
	public void deleteDublicateElementSorted()
	{
		Node current=head;
		while(current!=null){
			if(current.data==current.nextNode.data){
				current.nextNode=current.nextNode.nextNode;
			}else{
			current=current.nextNode;
			}
			if(current.nextNode==null){
				break;
			}
		}
	}
	
	
	public void sortList(){
		Node root=head;
		while(root!=null){
			Node temp=root;
			while(temp!=null){
				if(root.data > temp.data ){
					int data=root.data;
					root.data=temp.data;
					temp.data=data;
				}
				temp=temp.nextNode;
			}
			root=root.nextNode;
					
		}
	}
		
	
	public void removeDublicateList(){
		Node current=head;
		while(current!=null){
			Node temp=current;
			while(temp!=null && temp.nextNode!=null){
				if(current.data==temp.nextNode.data){
					temp.nextNode=temp.nextNode.nextNode;
				}
				temp=temp.nextNode;
			}
			current=current.nextNode;
		}
	}
	
	public void printRevirse(Node node){
		if(node==null){return ;}
		printRevirse(node.nextNode);
		System.out.print(node.data);
		
	}
	
	
	
	public void isPaldrom(Node node){
		if(node==null){
			return;
		}
		isPaldrom(node.nextNode);
	}
	
	
	
	public static void main(String[] args) {
		SingleLinkedList list=new SingleLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);	
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list);
		list.findMidel();
		//list.reverseList(list.head);
		//list.sortList();
		//list.deleteDublicateElementSorted();
		//System.out.println(list);
		//list.removeDublicateList();
		//System.out.println(list);
		
		
	}

}
