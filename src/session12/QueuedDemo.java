package session12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueuedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create priority queue
		PriorityQueue pq = new PriorityQueue();
	//	LinkedList pq = new LinkedList();

		pq.add(10);//throws exception for unsuccessful insertion
		pq.add(20);
		pq.add(5);
		pq.add(40);
		pq.offer(70);//returns false for unsuccessful insertion
		pq.add(40);//duplicate
		pq.add("A");
		
		
		System.out.println(pq);
		
		//access element - element() & peek() method 
		//pq.clear();
		//System.out.println(pq.element());
		//System.out.println("peek method to access element: " + pq.peek());
		
		//remove element using remove() and poll() method
		
	//	System.out.println("Remove element from queue: " + pq.poll());
		//System.out.println("queue after poll method:" + pq);

		//read element of priority queue
		
		/*Iterator it = pq.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		for(Object e:pq)
		{
			System.out.println(e);
		}
	}

}
