// Java program to implement Queue using 
// two stacks with costly enQueue() 
import java.util.*;

class Solution { 
static class Queue { 
	static Stack<Integer> s1 = new Stack<Integer>(); 
	static Stack<Integer> s2 = new Stack<Integer>(); 

	static void enQueue(int x) { 
		// Move all elements from s1 to s2 
		while (!s1.isEmpty())
		{ 
			s2.push(s1.pop()); 
			//s1.pop(); 
		} 

		// Push item into s1 
		s1.push(x); 

		// Push everything back to s1 
		while (!s2.isEmpty()) 
		{ 
			s1.push(s2.pop()); 
			//s2.pop(); 
		} 
	} 

	// Dequeue an item from the queue 
	static int deQueue() { 
		// if first stack is empty 
		if (s1.isEmpty()) 
		{ 
			return -1;
		} 

		// Return top of s1 
		int x = s1.peek(); 
		s1.pop(); 
		return x; 
	} 
}; 

// Driver code 
public static void main(String[] args) { 
	Queue q = new Queue(); 
	q.enQueue(1); 
	q.enQueue(2); 
	q.enQueue(3); 

	System.out.println(q.deQueue()); 
	System.out.println(q.deQueue());
	System.out.println(q.deQueue());
} 
} 


======================================================================================================================================================
/* Java Program to implement a queue using two stacks */
// Note that Stack class is used for Stack implementation

import java.util.Stack;

public class GFG {
	/* class of queue having two stacks */
	static class Queue {
		Stack<Integer> stack1;
		Stack<Integer> stack2;
	}

	/* Function to push an item to stack*/
	static void push(Stack<Integer> top_ref, int new_data)
	{
		// Push the data onto the stack
		top_ref.push(new_data);
	}

	/* Function to pop an item from stack*/
	static int pop(Stack<Integer> top_ref)
	{
		/*If stack is empty then error */
		if (top_ref.isEmpty()) {
			return -1;
		}

		// pop the data from the stack
		return top_ref.pop();
	}

	// Function to enqueue an item to the queue
	static void enQueue(Queue q, int x)
	{
		push(q.stack1, x);
	}

	/* Function to deQueue an item from queue */
	static int deQueue(Queue q)
	{
		int x;

		/* If both stacks are empty then error */
		if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
			return -1;
		}

		/* Move elements from stack1 to stack 2 only if
		stack2 is empty */
		if (q.stack2.isEmpty()) {
			while (!q.stack1.isEmpty()) {
				x = pop(q.stack1);
				push(q.stack2, x);
			}
		}
		x = pop(q.stack2);
		return x;
	}

	/* Driver function to test above functions */
	public static void main(String args[])
	{
		/* Create a queue with items 1 2 3*/
		Queue q = new Queue();
		q.stack1 = new Stack<>();
		q.stack2 = new Stack<>();
		enQueue(q, 1);
		enQueue(q, 2);
		enQueue(q, 3);

		/* Dequeue items */
		System.out.print(deQueue(q) + " ");
		System.out.print(deQueue(q) + " ");
		System.out.println(deQueue(q) + " ");
	}
}

================================================================================================================================================

// Java Program to implement a queue using one stack

import java.util.Stack;

public class QOneStack {
	// class of queue having two stacks
	static class Queue {
		Stack<Integer> stack1;
	}

	/* Function to push an item to stack*/
	static void push(Stack<Integer> top_ref, int new_data){
		/* put in the data */
		top_ref.push(new_data);
	}

	/* Function to pop an item from stack*/
	static int pop(Stack<Integer> top_ref){
		/*If stack is empty then error */
		if (top_ref == null) {
			return -1;
		}
		// return element from stack
		return top_ref.pop();
	}

	/* Function to enqueue an item to queue */
	static void enQueue(Queue q, int x){
		push(q.stack1, x);
	}

	/* Function to deQueue an item from queue */
	static int deQueue(Queue q){
		int x, res = 0;
		/* If the stacks is empty then error */
		if (q.stack1.isEmpty()) {
			return -1;
		}
		// Check if it is a last element of stack
		else if (q.stack1.size() == 1) {
			return pop(q.stack1);
		}
		else {

			/* pop an item from the stack1 */
			x = pop(q.stack1);

			/* store the last deQueued item */
			res = deQueue(q);

			/* push everything back to stack1 */
			push(q.stack1, x);
			return res;
		}
	}

	/* Driver function to test above functions */
	public static void main(String[] args){
		/* Create a queue with items 1 2 3*/
		Queue q = new Queue();
		q.stack1 = new Stack<>();

		enQueue(q, 1);
		enQueue(q, 2);
		enQueue(q, 3);

		/* Dequeue items */
		System.out.print(deQueue(q) + " ");
		System.out.print(deQueue(q) + " ");
		System.out.print(deQueue(q) + " ");
	}
}

