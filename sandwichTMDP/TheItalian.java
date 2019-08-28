package com.collabora.sandwichTMDP;

public class TheItalian extends Sandwich {
	
	String[] meatUsed = {"Salami", "Ham"};
	String[] cheeseUsed = {"Provolone"};

	@Override
	void addMeat() {
		System.out.print("Adding Meats: ");
		
		for(String meat : meatUsed) {
			System.out.print(meat +" ");
		}
	}

	@Override
	void addCheese() {
		System.out.print("Adding Cheese: ");
		
		for(String cheese : cheeseUsed) {
			System.out.print(cheese +" ");
		}
		
	}
	
}
