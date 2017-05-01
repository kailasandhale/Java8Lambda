package com.kailasa.practice;import java.lang.invoke.LambdaConversionException;

public class TypeInferenceExample {

	public static void main(String []args){
		
		printLambda(s -> s.length());		
	}
	
	public static void printLambda(StringLengthLamda stringLengthLamda){
		System.out.println(stringLengthLamda.getLength("Welcome to Java-8"));
	}
	
	interface	StringLengthLamda{
		int getLength(String s);
	}
}
