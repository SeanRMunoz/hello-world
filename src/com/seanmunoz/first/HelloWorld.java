package com.seanmunoz.first;

public class HelloWorld {
	/*
	 * Sean's VERY first Java program.
	 * Now enhanced with useless extra code
	 * for the purpose of testing Git via Eclipse.
	 */
	private String greetingPhrase; 
	private String farewellPhrase; 
	
	public static void main(String[] args) {
		HelloWorld myWorld = new HelloWorld("Hello World!!!", "\nGoodbye.");
		myWorld.displayGreeting();
		myWorld.displayFarewell();
	}
	
	public HelloWorld(String greetingPhrase, String farewellPhrase) {
		super();
		this.greetingPhrase = greetingPhrase;
		this.farewellPhrase = farewellPhrase;
	}

	private void displayGreeting() {
		System.out.println(greetingPhrase);
	}

	private void displayFarewell() {
		System.out.println(farewellPhrase);
	}

} // close class HelloWorld 
