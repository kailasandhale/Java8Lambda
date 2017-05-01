package com.kailasa.practice;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int someNumbers[]={1,2,3,4};
		int key = 0;
		process (someNumbers,key, (p, q) -> {
			try {
				System.out.println(p/q);
			} catch (ArithmeticException e) {
				System.out.println("Arithatic Exception");
			}
			
		});
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		 for(int value: someNumbers){
			 consumer.accept(value, key);
		 }
	}

}
