package session10;

import java.util.HashSet;

public class HashSetSetOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> setA = new HashSet<Integer>();
		setA.add(0);
		setA.add(2);
		setA.add(4);
		setA.add(6);
		setA.add(8);
		
		HashSet<Integer> setB = new HashSet<Integer>();
	//	setB.add(1);
		setB.add(2);
	//	setB.add(3);
		setB.add(4);
	//	setB.add(5);
		
//		//Union of two sets A& B
//		setB.addAll(setA);
//		System.out.println("Union is: " + setB);
		
		//intersection of two sets A & B
		
		//setB.retainAll(setA);
		//System.out.println("Intersection is: " + setB);
		
		//Difference of Set A and Set B (A-B)
		//setA.removeAll(setB);
		//System.out.println("Difference  is: " + setA);
		
		//Subset operation
		System.out.println(setA.containsAll(setB));

	
	}

}
