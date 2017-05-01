package com.kailasa.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>( Arrays.asList(
					new Person("Kailas", "Andhale", 24),
					new Person("DEF", "CXYZ", 24),
					new Person("ABC", "XYZ", 25),  
					new Person("ABC", "CPQR", 26)
				));


		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		System.out.println("Printing all Pesons\n");
		printConditionally(people, p -> true, p -> System.out.println(p));
		
		System.out.println("\nPrinting Conditionally\n");
		printConditionally(people, (p) -> p.getLastName().startsWith("C"),p -> System.out.println(p.getFirstName()));
	}

	private static void printConditionally(List<Person> people,Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if(predicate.test(person))
				consumer.accept(person);
		}
		
	}

}

