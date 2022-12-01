package session13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create hashmap in java

		HashMap<Integer, String> language = new HashMap<>();

		//add elements to hashmap
		language.put(1, "Java");//1-entry
		language.put(2, "Python");//2-entry
		language.put(3, "Javascript");//3-entry - change javascript to C++ using replace method

		System.out.println("Hashmap:" + language);

		//get() method to get value

		String value = language.get(1);

		System.out.println("value at index 1 is : " + value);
		System.out.println("KeySet:" + language.keySet());

		System.out.println("values" + language.values());

		System.out.println("Key/value set:" + language.entrySet());

		//replace element with key 3

		language.replace(3,"C++");

		System.out.println("Hashmap using replace method:" + language);

		//remove element from hash map
		//System.out.println(language.remove(2));//python
		//System.out.println(language.remove(2,"Python"));
		//	System.out.println("hashmap after remove method:" + language);

		System.out.println("ContainsKey() 2:" + language.containsKey(4));//false

		System.out.println("ContainsValue() Java:" + language.containsValue("Ruby"));//false

		System.out.println("size of hashmap:" + language.size());//3

		///language.clear();//remove all entries from hashmap
		System.out.println("Is hasmap empty:" + language.isEmpty());//true


		//Create second hashmap in java

		/*		HashMap<Integer, String> language2 = new HashMap<>();

		//add elements to hashmap
		language2.put(4, "Ruby");//1-entry
		language2.put(5, "C#");//2-entry
		language2.put(6, "HTML");//3-entry - change javascript to C++ using replace method

		language.putAll(language2);

		System.out.println("language hashmap after putAll() " + language);*/


		System.out.println("KeySet:" + language.keySet());


		/*	for(int i: language.keySet())
		{
			System.out.println(i);

		}*/


		Iterator it = language.keySet().iterator();

		while(it.hasNext())
		{

			System.out.println(it.next());
		}


		System.out.println("values" + language.values());


		/*for(String val: language.values())
		{
			System.out.println(val);

		}*/


		Iterator itVal = language.values().iterator();

		while(itVal.hasNext())
		{

			System.out.println(itVal.next());
		}


		System.out.println("Key/value set:" + language.entrySet());

//		for(Entry<Integer, String> entry:language.entrySet())
//		{
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}

		Iterator itr2 = language.entrySet().iterator();

		while(itr2.hasNext())
		{

			Entry e =(Entry) itr2.next();
			System.out.println(e.getKey() + " " + e.getValue());
			
		}

	}

}
