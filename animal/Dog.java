package com.collabora.animal;

public class Dog extends AnimalTwo {

	public Dog() {
		super();
		setSpecies("Dog");
		
		flyingType = new CantFly();
	}
	//No need to dig holes today...
	
}
