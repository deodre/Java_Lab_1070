package eu.ase.lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Movie m1 = new Movie(2021, "Dune", 8.0f);
		Movie m2 = new Movie(2023, "Barbie", 7.1f);
		Movie m3 = new Movie(2024, "Dune: Part Two", 8.9f);
		Movie m4 = new Movie(2021, "Dune", 8.0f);

		System.out.println(m1.equals(m4));
		
		System.out.println(m1.hashCode() + " " + m2.hashCode() + " " + m4.hashCode());
		
		Map<Integer, Movie> movieMap = new HashMap<Integer, Movie>();
		
		movieMap.put(m1.hashCode(), m1);
		movieMap.put(m2.hashCode(), m2);
		movieMap.put(m3.hashCode(), m3);
		movieMap.put(m4.hashCode(), m4);

		//movieMap.get(m2.hashCode());
		
		System.out.println("Movie map: ");
		System.out.println("{");
		
		for (Integer key : movieMap.keySet()) {
			System.out.println(key + ": " + movieMap.get(key));
		};
		System.out.println("}");
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "String1");
		treeMap.put(2, "String3");
		treeMap.put(3, "String3");
		
		System.out.println(treeMap);
		
		System.out.println(movieMap.keySet());
		
		System.out.println(treeMap.get(2));
		
		
		
	}

}
