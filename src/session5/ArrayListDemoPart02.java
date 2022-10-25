package session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemoPart02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare array list/collection
		ArrayList<String> al = new ArrayList<String>();
		al.add("S");//index=0
		al.add("X");//index=1
		al.add("Y");//index=2
		al.add("Z");//index=3
		al.add("B");//index=4
		al.add("C");//index=5
		al.add("A");//index=6

//		//System.out.println(al);
//		ArrayList<String> al2 = new ArrayList<String>();
//		System.out.println("Before adding:" + al2);
//		
//		al2.addAll(al);
//		System.out.println("after adding:" + al2);
//		
//		al2.removeAll(al);
//		System.out.println("after removing:" + al2);
//		
		
		//Loop through elements of array list
		//1. for loop
			
		/*for(int i=0; i<al.size();i++)//i=0,1,2,3,4,5,6
		{
			System.out.println(al.get(i));
		}*/
		
		//2. for... each
		
		/*for(String i:al)
		{
			System.out.println(i);
		}*/
		//3. iterator
		/*Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		//Sort araryList
//		System.out.println("Before sorting:" + al);
//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println("after sorting:" + al);
//		
//		//Shuffle arraylist
//		Collections.shuffle(al);
//		System.out.println("after shuffling:" + al);

		//create string array
		String cars[] = {"Volvo", "BMW", "Ford"};
		
		ArrayList al2 = new ArrayList(Arrays.asList(cars));
		System.out.println(al2);

	}

}
