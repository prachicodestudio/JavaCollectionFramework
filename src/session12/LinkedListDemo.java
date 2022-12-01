package session12;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList pq = new LinkedList();

		pq.add(10);//throws exception for unsuccessful insertion
		pq.add(20);
		pq.add(5);
		pq.add(40);
		pq.offer(70);//returns false for unsuccessful insertion
		pq.add(40);//duplicate
		pq.add("A");//LinkeList class accepts heterogeneous data
		
		
		System.out.println(pq);
		
		//access element - element() & peek() method 
	//	pq.clear();
	//	System.out.println("peek method to access element: " + pq.peek());
	//	System.out.println("element method to access element: " + pq.element());
	
		
		//remove element using remove() and poll() method
		
	//	System.out.println("Remove element from queue: " + pq.remove());
	//	System.out.println("queue after remove method:" + pq);

		//read element of priority queue
		
	/*	Iterator it = pq.iterator();
		
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
