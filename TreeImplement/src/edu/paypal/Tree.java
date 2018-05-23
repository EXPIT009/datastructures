package edu.paypal;
/**
 * @author Anil Samelia
 * */
/*
 * Binary search Tree LeftNode < RootNode < RightNode duplicate notAllow
 * Binary Search Tree is best for searching the element complexity of searching is O(log n) best is Omega (1);
 * average is Log n
 * 
 * Disadvantage of Binary Search tree is if our data is sorted (ascending or descending both) the searching become 
 * Liner searching ;
 * 
 *   
 * */
public class Tree {
	private Node root;

	class Node {
		int data;
		Node leftNode;
		Node rightNode;
		Node(int data){this.data=data;}
	}

	public void add(int data){
		Node node=new Node(data);
		if(root==null){
			root=node;
			return ;
		}
		Node current=root;
		while(current!=null){
			if(current.data > data){
				if(current.leftNode==null){
					current.leftNode=node;
					break;
				}
				current=current.leftNode;
				//break;
			}else if(current.data < data)
			{
				if(current.rightNode==null){
					current.rightNode=node;
					break;
				}
				current=current.rightNode;
			}else{
				break;
			}
		}
	}
	/*
	 * Recursion  call its self. And its work as stack
	 * 
	 * */
	public void printInOrder(Node node){
		if(node==null){
			return;
		}
		printInOrder(node.leftNode);
		System.out.print(node.data+", ");
		printInOrder(node.rightNode);
	}

	public void printPreOrder(Node node){
		if(node==null){
			return;
		}
		System.out.print(node.data+", ");
		printInOrder(node.leftNode);
		printInOrder(node.rightNode);
	}

	public void printPostOrder(Node node){
		if(node==null){
			return;
		}
		printInOrder(node.leftNode);
		printInOrder(node.rightNode);
		System.out.print(node.data+", ");
	}

	

	public Node findNode(int data){
		Node current = root;
		while(current!=null){
			if(current.data > data){
				current=current.leftNode;
			} else if (current.data< data){
				current=current.rightNode;
			}
			else{
				return current;
			}
		}
		return null;
	}
	
	public void deleteNode(int data){
		
	}
	
	

	



	public static void main(String[] args) {
		Tree t=new Tree();
		t.add(100);
		t.add(200);
		t.add(50);
		t.add(225);
		t.add(150);
		t.add(75);
		t.add(25);
		t.printInOrder(t.root);
		System.out.println();
		
	}

}
