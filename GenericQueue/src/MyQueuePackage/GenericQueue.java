package MyQueuePackage;
/*
 * Instructor: Anirban Ghosh
 * @author: Joseph Curto
 * Course: COP2551
 * Homework 8
 */


//Declaring variables
public class GenericQueue<E> {
		private E[] element;
		private int size, queueCapacity;
		private int head, tail;
	

	//Initializing variables and setting up array for queue.	
	@SuppressWarnings("unchecked")
	public GenericQueue() {
		element = (E[]) new Object [8];
		
		head = 0;
		tail = -1;
		queueCapacity = 8;
	}

	//Setting capacity for array.
	@SuppressWarnings("unchecked")
	public GenericQueue( int capacity) {
		element = (E[]) new Object [capacity];
	}

	//Enqueue method allowing me to add v to my queue.
	public void enqueue(E v) {
		if(tail == queueCapacity - 1) {
			int j = 0;
			for(int i = head; i <= tail; i++) {
				element[j++] = element[i];
				
			}
			head = 0;
			tail = size--;
		}
			element[++tail] = v;
			size++;
			
	}

	//Removing the first element of the queue. FIFO
	public E dequeue() {
		E savedInput = element [head];
		element[head] = null;
		head++;
		size--;
	
	return savedInput;
		
	}

	//Checks to see whether the queue is empty.	
	public boolean empty() {
		if(size == 0)
			return true;
		else
			return false;
	}

	//Retrieves the size of the queue.
	public int getSize() {
		return size;
	}

	//Returns string representation of the elements.
	public String toString() {
		
		String str = " ";
		
		for(int pos = head; pos <= tail; pos++) {
			str += element[pos] + " ";
			
			
		}
		return str;
		 	
	}
}
	
	
/* 									Work Cited: 
 * Enqueue/Dequeue reference: Queue.java.” Princeton University, The Trustees of Princeton University,
  algs4.cs.princeton.edu/43mst/Queue.java.html.
  
 * Implementation of Enqueue and Dequeue: javaboynavin. “#13 Queue Implementation Using Java Part 1 | EnQueue.” YouTube, YouTube, 2 Jan. 2018,
   www.youtube.com/watch?v=PvDoT79oHTs&index=12&list=PLsyeobzWxl7oRKwDi7wjrANsbhTX0IK0J. a
 */



