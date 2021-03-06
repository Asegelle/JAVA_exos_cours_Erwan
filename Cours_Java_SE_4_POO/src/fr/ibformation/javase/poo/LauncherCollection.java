package fr.ibformation.javase.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import fr.ibformation.javase.bo.User;

public class LauncherCollection {
	
	public static void main(String[] args) {
		
		// Collections (List et Set) et les Map
		// L'ArrayList
		List myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(20000000000l);
		myList.add("toto");
		myList.add(2.2f);
		System.out.println(myList);
		
		System.out.println(myList.size());
		System.out.println(myList.get(0));
		myList.remove(0);
		System.out.println(myList.get(0));
		System.out.println(myList.size());
		// myList.clear();
		System.out.println(myList.size());
		
		System.out.println(myList);
		
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		List<String> myListWithType = new ArrayList<String>();
		myListWithType.add("toto");
		myListWithType.add("titi");
		myListWithType.add("tutu");
		// myListWithType.add(2); pas possible avec la liste restreinte

		for(String element : myListWithType) {
			System.out.println(element);
		}

//		// Existe que depuis java8
//		myListWithType.forEach(e -> System.out.println(e));n                                            lm;
//		myListWithType.forEach(System.out::println);
		
		// HashSet => Collection ordonn?e
		Set<String> animals = new HashSet<String>();
		animals.add("Girafe");
		animals.add("Chien");
		animals.add("Chat");
		animals.add("Chien");
		animals.add("chien");
		
		for(String element : animals) {
			System.out.println(element);
		}
				
		// HashMap => cl? , valeur : Dictionnaire
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "printemps");
		System.out.println(map.get(1));
		map.put(1, "?t?");
		System.out.println(map.get(1));
		map.put(104546, "automne");
		map.put(-424561, "hiver");
		
		System.out.println(map.get(104546));
		
		for(Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		// List<Map<List<String>,String>> myListComplex; // A ne pas faire
	}
	
}
