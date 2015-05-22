package com.seanmunoz.first;

public class HelloWorld {
	/*
	 * My VERY first Java program.
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
		setGreetingPhrase(greetingPhrase);
		setFarewellPhrase(farewellPhrase);
	}

	private void displayGreeting() {
		System.out.println(getGreetingPhrase());
	}

	private void displayFarewell() {
		System.out.println(getFarewellPhrase());
	}
	
	/*
	 * Getters & Setters live below
	 */
	public String getGreetingPhrase() {
		return greetingPhrase;
	}

	public void setGreetingPhrase(String greetingPhrase) {
		this.greetingPhrase = greetingPhrase;
	}

	public String getFarewellPhrase() {
		return farewellPhrase;
	}

	public void setFarewellPhrase(String farewellPhrase) {
		this.farewellPhrase = farewellPhrase;
	}

}
