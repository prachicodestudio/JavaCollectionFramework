package session11;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create linked hash set
		//LinkedHashSet <Integer> linkedHasSet = new LinkedHashSet<Integer>();//Homogeneous data
		LinkedHashSet linkedHasSet = new LinkedHashSet();//Heterogeneous data
		//HashSet linkedHasSet = new HashSet();//Heterogeneous data

		linkedHasSet.add(100);
		linkedHasSet.add(200);
		linkedHasSet.add(300);
		linkedHasSet.add(400);
		linkedHasSet.add(500);
		linkedHasSet.add(400);
		
		System.out.println(linkedHasSet);




		

	}

}
