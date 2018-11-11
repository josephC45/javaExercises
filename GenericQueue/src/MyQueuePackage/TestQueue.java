package MyQueuePackage;

public class TestQueue {
	public static void main(String[] args) {
	GenericQueue<String> stringQueue = new GenericQueue<String>();
	
	stringQueue.enqueue(" Computing ");
	stringQueue.enqueue(" UNF " );
	stringQueue.enqueue(" Java " );
	stringQueue.enqueue(" Programming " );
	stringQueue.enqueue(" Jacksonville " );

	System.out.println("Initial queue content: " + stringQueue); 
	String s = stringQueue.dequeue();
	System.out.println("The dequeued string is: " + s);

	System.out.println("Current queue content: " + stringQueue); 
	s = stringQueue.dequeue();
	System.out.println("The dequeued string is: " + s);

	System.out.println("Queue size: "+ stringQueue.getSize());
	System.out.println("Is empty? " + stringQueue.empty());
 		}
 	} 


/* GenericQueue<Integer> integerQueue = new GenericQueue<Integer>();
		integerQueue.enqueue( 1 );
		integerQueue.enqueue( 2 );
		integerQueue.enqueue( 3 );
		integerQueue.enqueue( 4 );
		integerQueue.enqueue( 5 );
		integerQueue.enqueue( 6 );
		integerQueue.enqueue( 7 );
		integerQueue.enqueue( 8 );

		System.out.println("Initial queue content: " + integerQueue); 
		int i = integerQueue.dequeue();
		System.out.println("The dequeued string is: " + i);

		System.out.println("Current queue content: " + integerQueue); 
		i = integerQueue.dequeue();
		System.out.println("The dequeued string is: " + i);

		System.out.println("Queue size: "+ integerQueue.getSize());
		System.out.println("Is empty? " + integerQueue.empty());
*/



