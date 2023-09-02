package manju.learning.stackqueue;

public class OpsOnMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * How to implement a stack which will support the following operations in O(1)
		 * time complexity? 
		 * 1) push() which adds an element to the top of stack. 
		 * 2) pop() which removes an element from top of stack. 
		 * 3) findMiddle() which will return middle element of the stack. 
		 * 4) deleteMiddle() which will delete the middle element. 
		 * Push and pop are standard stack operations.
		 */
		
		MiddleStack stack1 = new MiddleStack();
		stack1.push(10);
		stack1.push(20);
//		stack1.push(30);
//		stack1.push(40);
//		stack1.push(50);
///		stack1.push(60);
//		stack1.push(70);
		stack1.printStack();
		
		
		System.out.println("mid element::: " + stack1.findMiddle());
		
		System.out.println("mid element deleted::: " + stack1.deleteMiddle());
		
		stack1.printStack();

	}

}

class MiddleStack{
	
	Node head;
	Node mid;
	int size;
	
	public void push(int data) {
		
		Node newNode = new Node(data);
		size++;
		if(head==null) {
			mid= head = newNode;
			return;
		}
		
		if(head==mid) {
			mid.prev = newNode;	
			mid.next=null;
		}
		
		newNode.next=head;
		head.prev = newNode;
		head=newNode;
		
		if(size %2 ==0) {
			mid=mid.prev;
		}
		
	}
	
	public void printStack() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data + "->");
			curr=curr.next;
		}
		System.out.print("null");
		System.out.println();
		
	}

	public int pop() {
		
		if(head==null) {
			return -1;

		}
		size--;
		int top = head.data;
		head =head.next;
		head.prev = null;
		
		if(size %2 ==0) {
			mid=mid.next;
		}
		return top;
		
	}
	
	public int findMiddle() {
		
		if(head==null) {
			return -1;
		}
		Node curr = mid;
		return curr.data;				
		
	}
	
	public int deleteMiddle() {
		if(head==null) {
			return -1;
		}
		
		if(head==mid) {
			mid.next = null;	
			mid.prev=null;
			return mid.data;
		}
		
		Node curr = mid;
		Node temp = mid.next.prev;
		mid.next.prev = mid.prev.next;
		mid.prev.next = temp;
		curr.next=null;
		curr.prev = null;
			
		return curr.data;
		
	}
	
	
	
	
	
	
	
}

class Node{
	int data;
	Node next;
	Node prev;
	Node(int data){
		this.data=data;
		this.next = null;
		this.prev = null;
	}
}
