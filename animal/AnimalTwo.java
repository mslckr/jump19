package com.collabora.animal;

public class AnimalTwo {
	private String name;
	private double height;
	private int weight;
	private String species;
	
	public void setName(String newName) {name = newName;}
	public String getName() {return name;}
	public void setHeight(double newHeight) {height=newHeight;}
	public double getheight() {return height;}
	//I will not be testing invalid weight values today
	public void setWeight(int newWeight) {weight=newWeight;}
	public double getWeight() {return weight;}
	public void setSpecies(String newSpec) {species = newSpec;}
	public String getSpecies() {return species;}
	
	//Strategy Pattern: Dog, Flys, Bird, AnimalPlay
	public Flys flyingType;
	public String tryToFly() {return flyingType.fly();}
	public void setFlyAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
}
