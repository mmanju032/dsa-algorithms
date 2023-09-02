package manju.learning.stackqueue;

public class ImplementTwoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a data structure twoStacks that represent two stacks. Implementation
		// of twoStacks should use only one array, i.e., both stacks should use the same
		// array for storing elements.
		/*
		 * ollowing functions must be supported by twoStacks.
		 * 
		 * push1(int x) –> pushes x to first stack push2(int x) –> pushes x to second
		 * stack pop1() –> pops an element from first stack and return the popped
		 * element pop2() –> pops an element from second stack and return the popped
		 * element Implementation of twoStack should be space efficient.
		 */
		StackTest twoStack = new StackTest(10);
		twoStack.push1(1);
		twoStack.push1(2);
		twoStack.push1(3);
		twoStack.push1(4);
		twoStack.push1(5);
		twoStack.push1(6);
		twoStack.push2(10);
		twoStack.push2(9);
		twoStack.push2(8);
		twoStack.push2(7);
		
		System.out.println(twoStack.pop1());
		System.out.println(twoStack.pop1());
		
		System.out.println(twoStack.pop2());
		System.out.println(twoStack.pop2());

	}

}

class StackTest {
	int[] arr;
	int start;
	int end;

	StackTest(int size) {
		arr = new int[size];
		start = -1;
		end = size-1;
	}

	public void push1(int x) {
		
		if(start < end) {
			start++;
			arr[start] = x;		
						
		} else {
			throw new RuntimeException("stack overflow");
		}
						
	}
	
	
	public void push2(int x) {
		if(start < end) {
			arr[end] = x;
			end--;
					
		} else {
			throw new RuntimeException("stack overflow");
		}
		
	}
	
	public int pop1() {
		
		int top = arr[start];
		start--;
		return top;
		
	}
	
	public int pop2() {
		end++;
		int top = arr[end];		
		return top;
		
	}
	

}
