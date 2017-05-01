package com.kailasa.practice;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Welcome from Thread");
				
			}
		});

		thread.start();
		
		Thread thread2 = new Thread(() -> System.out.println("Welcome from Lambda Thread"));
		thread2.start();
	}

}
