package com.collabora.sandwichTMDP;

public class SandwichSculptor {

	public static void main(String[] args) {
		
		Sandwich sandOne = new TheItalian();
		
		sandOne.makeSandwich();
		
		Sandwich sandTwo = new TheVeg();
		
		sandTwo.makeSandwich();

	}

}
