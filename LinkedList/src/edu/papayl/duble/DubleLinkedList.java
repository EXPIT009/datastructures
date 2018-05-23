package edu.papayl.duble;




public class DubleLinkedList {
	class Node {
		int data;
		Node nextNode;
		Node prvNode;
		public Node(int data) {
			this.data = data;
		}}

	Node head;
	int size=0;

	public void add(int data){
		Node node=new Node(data);
		if(head==null){
			head=node;
			size++;
			return ;
		}
		Node current=head;
		while(current!=null){
			if(current.nextNode==null){
				node.prvNode=current;
				current.nextNode=node;
				size++;
				break;
			}
			current=current.nextNode;
		}
	}

	public void deleteElement(int data){
		Node current=head;
		if(current.data==data){
			this.head=current.nextNode;
			size--;
			return ;
		}		
		while(current!=null){
			if(current.data==data){
				current.prvNode.nextNode=current.nextNode;
				size--;
				break;
			}
			current=current.nextNode;

		}
	}

	public void deleteMid(){
		Node current=head;
		int count=0;
		while(current!=null){
			count++;
			current=current.nextNode;
		}
		//delte element
		Node deleteEl=head;
		int t=0;
		while(deleteEl!=null){
			t++;
			if(t==count/2){
				deleteEl.prvNode.nextNode=deleteEl.nextNode;
				size--;
				break;
			}
			deleteEl=deleteEl.nextNode;
		}
	}

	public void subGroup(int k){
		Node currentNode=head;
		int count=0;
		Node node=null;
		while(currentNode!=null){
			count++;
			if(count==k){
				Node temp=currentNode;
				int t=k;
				while(temp!=null){
					if(t==0){
						break;
					}
					if(node==null){
						node=temp;
					}
					System.out.print(temp.data+" ");
					temp.nextNode=temp.prvNode;
					
					t++;
				}
				count=0;
			}
			currentNode=currentNode.nextNode;
		}		
	}




	public int size(){
		return size;
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

	
	public void print(Node node){
		if(node==null){
			return;
		}
		print(node.nextNode);
		System.out.print(node.data+" ,");
		
		
	}
	

	public static void main(String[] args) {
		DubleLinkedList list=new DubleLinkedList();
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

		System.out.println(list);
		list.print(list.head);;
		/*list.subGroup(3);
		System.out.println();
		System.out.println(list);*/
	}

}
//3->2->1->6->5->4->8->7->NULL. 
