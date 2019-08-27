package com.collabora.animal;

public class Bird extends AnimalTwo {

	public Bird() {
		super();
		setSpecies("Bird");
		flyingType = new ItFlys();
	}

}
