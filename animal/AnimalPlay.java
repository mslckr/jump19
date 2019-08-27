package com.collabora.animal;

public class AnimalPlay {

	public static void main(String[] args) {
		AnimalTwo sparky = new Dog();
		AnimalTwo chirp = new Bird();
		System.out.println("Dog: "+sparky.tryToFly());
		System.out.println("Bird: "+chirp.tryToFly());
		
		sparky.setFlyAbility(new ItFlys());
		
		System.out.println("Dog: "+sparky.tryToFly());
	}

}
