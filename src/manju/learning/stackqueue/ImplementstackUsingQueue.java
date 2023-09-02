package manju.learning.stackqueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ImplementstackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//yet to implement

		
		stackImpl stack = new stackImpl();
		stack.push(10);
		stack.push(20);
		stack.push(30);
			
		

	}
	
}

class stackImpl{
	Queue<Integer> queue1;
	Queue<Integer> queue2;
	stackImpl(){
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
		
	}
	
	public void push(int x) {
		queue1.add(x);
		
	}
	
	public void pop() {
		
		
	}
	
}



