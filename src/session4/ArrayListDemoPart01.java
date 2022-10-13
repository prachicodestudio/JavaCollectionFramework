package session4;

import java.util.ArrayList;

public class ArrayListDemoPart01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare ArrayList
		ArrayList al = new ArrayList();//for hetrogenous data

		//ArrayList<String> cars = new ArrayList<String>();//Homogenous data

		//add data to arraylist
		al.add("Java");//index=0
		al.add(66);//index=1
		al.add('H');//index=2
		al.add(true);//index=3
		al.add(12.4);//index4

		//print array list
		System.out.println(al);

		//size method
		System.out.println("Size of ArrayList:" + al.size());//5

		//Remove element
		//al.remove(1);//remove index =1 i;e 66

		//print array list
		//System.out.println("After removing 66:" + al);
		
		//get method -  to access values /element from array list
		
		System.out.println("Access element of index 1:" + al.get(1));//66

		//set method - used to replace/change element of array list
		al.set(0, "C++");
		
		//print array list
		System.out.println("After set method:" + al);
		
		//size - to find how many elements array list have
		
		System.out.println("size of list:"+ al.size());//5
		
		//insert elemetn in arraylist
		al.add(1, 65);
		//print array list
		System.out.println("After insert method:" + al);
		
		//contains- to search element in array list
		
		System.out.println(al.contains("ruby"));//True
		System.out.println("Is arraylist empty:" + al.isEmpty());//false
		
		//clear method- removes all the elements from list
		al.clear();
		System.out.println("After clear method:" + al);

	}

}
