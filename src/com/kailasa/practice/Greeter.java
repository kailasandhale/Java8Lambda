package com.kailasa.practice;

public class Greeter {

	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
//		HelloWorldGreeting greeting = new HelloWorldGreeting();
//		greeter.greet(greeting);
		
		Greeting lambdaGreeting = () -> System.out.println("Hello Lambda world!!!");
		greeter.greet(lambdaGreeting);
	}

}

