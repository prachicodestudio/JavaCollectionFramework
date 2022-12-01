package session8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListPart3Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create linked list for string
		LinkedList<String> cars = new LinkedList<String>();
		
		//add elements to linkedlist
		cars.add("Volvo");//0
		cars.add("BMW");//1
		cars.add("Ford");//2
//		System.out.println("Before addfirst method:" + cars);//[Volvo, BMW, Ford]
//		cars.addFirst("Mazda");
//		System.out.println("After addfirst method:" + cars);//[Mazda,Volvo, BMW, Ford]
//		cars.addLast("Maruti");
//		System.out.println("After addLast method:" + cars);//[Mazda,Volvo, BMW, Ford,Maruti]
//		cars.removeFirst();
//		System.out.println("After removeFirst method:" + cars);//[Volvo, BMW, Ford,Maruti]
//		cars.removeLast();
//		System.out.println("After removeLast method:" + cars);//[Volvo, BMW, Ford]
//		
//		System.out.println("GetFirst() Method:" + cars.getFirst());
//		System.out.println("GetLast() Method:" + cars.getLast());

//		System.out.println("Before push method:" + cars);//[Volvo, BMW, Ford]
//		//push operation
//		
//		cars.push("new car");
//		System.out.println("After push method:" + cars);//[Volvo, BMW, Ford]
//
//		System.out.println("pop operation : " + cars.pop());
//		
//		System.out.println("After pop method list contains :" + cars);
		
		
/*********************peek()************************/
		
//		System.out.println("peek():" + cars.peek());
//		System.out.println("List contains after peek() methods:" + cars);
//		
//		
//		System.out.println("peekFirst():" + cars.peekFirst());
//		System.out.println("List contains after peekFisrt() methods:" + cars);
//		
//		System.out.println("peekLast():" + cars.peekLast());
//		System.out.println("List contains after peekLast() methods:" + cars);
		
		//Reading elements from linkedlist using for loop
		
//		for(int i=0; i<cars.size();i++)
//		{
//			System.out.println(cars.get(i));//i=0=volvo,1=BMW,2=Ford
//		}
		
		//Reading linked list elements using for..each loop 
		
//		for(Object e:cars)
//		{
//			System.out.println(e);
//		}
		
//		//Iterator method
//		Iterator it = cars.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
		//sort linked list
		System.out.println("Before sorting: "+ cars);
		Collections.sort(cars);
		System.out.println("After sorting: "+ cars);
		
		//sort in reverse order
		Collections.sort(cars,Collections.reverseOrder());
		System.out.println("After sorting in reverse order: "+ cars);
		
		Collections.shuffle(cars);
		
		System.out.println("After shuffling: "+ cars);


	}

}
