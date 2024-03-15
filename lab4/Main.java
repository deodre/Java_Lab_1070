package eu.ase.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>(); //Autoboxing / Unboxing
		
		System.out.println("List size: " + intList.size());
		System.out.println("---------------------");
		
		for (int i = 0; i < 10; i++) {
			intList.add((i + 1) * 10);
		}
		
		System.out.println("List size: " + intList.size());
		System.out.println("---------------------");
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		System.out.println("---------------------");
		for (Integer element : intList) {
			System.out.print("Element at position " + intList.indexOf(element) + ": ");
			System.out.println(element);
		}
		
		intList.add(4, 49);
		
		System.out.println("---------------------");
		for (Integer element : intList) {
			System.out.print("Element at position " + intList.indexOf(element) + ": ");
			System.out.println(element);
		}
		
		intList.set(4, 45);
		
		System.out.println("---------------------");
		for (Integer element : intList) {
			System.out.print("Element at position " + intList.indexOf(element) + ": ");
			System.out.println(element);
		}
		
		System.out.println("---------------------");

		for (Iterator<Integer> it = intList.iterator(); it.hasNext();) {
			Integer element = it.next();
			System.out.println(element);
		}
		
		System.out.println(intList.toString());
		
		System.out.println("---------------------");

		List<Integer> intList2 = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			intList2.add(random.nextInt(0, 100));
		}
		
		System.out.println("Random values: ");
		System.out.println(intList2.toString());
		
		intList2.sort(Comparator.naturalOrder());
		System.out.println(intList2.toString());

		intList2.sort(Comparator.reverseOrder());
		System.out.println(intList2.toString());

		System.out.println("List after shuffle:");
		Collections.shuffle(intList2);
		System.out.println(intList2.toString());

		
		System.out.println("List after ordering:");
		Collections.sort(intList2);
		System.out.println(intList2.toString());
		
		System.out.println("List after reverse ordering:");
		Collections.reverse(intList2);
		System.out.println(intList2.toString());


		System.out.println("---------------------");

		
		Movie movie1 = new Movie(2021, "Dune", 8.0f);
		Movie movie2 = new Movie(2024, "Dune Part Two", 8.9f);
		Movie movie3 = new Movie(2023, "Wonka", 7.1f);
		
		List<Movie> movies = new ArrayList<Movie>();
		
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		
//		System.out.println(movies.toString());
		
		for (Movie movie : movies) {
			System.out.print("Index " + movies.indexOf(movie) + ": ");
			System.out.println(movie);
		}
		
		System.out.println(movies.get(2));
		System.out.println(movies.indexOf(movie2));
		
		System.out.println("---------------------");

		movies.forEach(movie -> {
			if (movie.getTitle().startsWith("D")) {
				System.out.println(movie.getTitle());
			}
			
			// ....
			// ....
		});  // lambda expression / function
		
//		Collections.sort(movies);
//		System.out.println(movies.toString());
//		
//		Collections.reverse(movies);
//		System.out.println(movies.toString());
		System.out.println("---------------------");

		
		
		movies.sort(new RatingComparator());
		System.out.println(movies.toString());
		System.out.println("---------------------");

		movies.sort(new YearComparator());
		System.out.println(movies.toString());
		System.out.println("---------------------");
		
		movies.sort(new TitleComparator().reversed());
		System.out.println(movies.toString());
		System.out.println("---------------------");
		
	}

}
