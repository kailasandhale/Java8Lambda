package com.kailasa.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>( Arrays.asList(
					new Person("Kailas", "Andhale", 24),
					new Person("DEF", "CXYZ", 24),
					new Person("ABC", "XYZ", 25),  
					new Person("ABC", "CPQR", 26)
				));


		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		System.out.println("Printing all Pesons\n");
		printAllElements(people);
		
		System.out.println("\nPrinting Conditionally\n");
		printConditionally(people, new Condition() {
			
			@Override
			public Boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
	}

	private static void printConditionally(List<Person> people,Condition condition) {
		for (Person person : people) {
			if(condition.test(person))
				System.out.println(person);
		}
		
	}

	private static void printAllElements(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
		
	}

}


interface Condition{
	Boolean test(Person p);
}