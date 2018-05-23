package org.paypal;

public class StackArray {
	
	int arry[];
	int top=9;
	
	public StackArray(){
		arry=new int[10];
	} 
	
	public void push(int data){
		if(top<0){
			System.out.println("Stack Over flow");
			return ;
		}
		arry[top]=data;
		top--;
	}
	
	public int pop()
	{
		top++;
		return top;
	}
	@Override
	public String toString() {
		String tostr="[";
		for(int i=top+1; i<arry.length; i++){
			tostr+=arry[i]+",";
		}
		return tostr+"]";
	}
	
	
	
	public static void main(String[] args) {
	StackArray stack=new StackArray();
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	stack.push(6);
	stack.pop();
	stack.pop();
	stack.push(5);
	stack.push(6);
	stack.push(7);
	stack.push(8);
	stack.push(9);
	stack.push(10);
	stack.push(20);
	System.out.println(stack);
	
	}
}
