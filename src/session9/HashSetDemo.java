package session9;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare HashSet
		 
	//	HashSet hs = new HashSet();//for heterogeneous data
		HashSet<String> cars = new HashSet<String>();//Homogeneous data
		HashSet<String> cars2 = new HashSet<String>();//Homogeneous data

		//insert element
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Maruti");
		cars.add("Ford");
				
		System.out.println("Elements of HashSet:" + cars);
		
		//insert elements in cars2 collection
		cars2.add("Hundai");
		cars2.add("Toyota");
		
		//add cars2 collection to cars collection
		cars.addAll(cars2);
		
		System.out.println("Elements of HashSet cars after addAll method:" + cars);

		//remove elements from hashset
		cars.remove("Ford");
		System.out.println("Elements of HashSet cars after remove method:" + cars);

	//	cars.removeAll(cars2);
	//	System.out.println("Elements of HashSet cars after removeAll method:" + cars);

		//search BMW in cars collection using contains method
		//System.out.println(cars.contains("Ford"));//false
		
		System.out.println(cars.containsAll(cars2));//true
		
		
		//isEmpty
		System.out.println("Is Cars collection empty:" + cars.isEmpty());
		System.out.println("Size of cars collection is :" + cars.size());
		//cars.clear();
	//	System.out.println("cars collection after clear method:" + cars);


		//Read elements of hashset using for..each loop
		
	/*	for(Object e:cars)
		{
			System.out.println(e);
		}*/
		
		//Iterator method for reading elements of hash set
		
		Iterator it = cars.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
