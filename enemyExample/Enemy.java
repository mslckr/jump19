package com.collabora.enemyExample;

public abstract class Enemy {
	private String name;
	//Dmg represents Damage
	private double amtDmg;
	
	public String getName() {return name;}
	public void setName(String newName) {name = newName;}
	
	public double getDmg() {return amtDmg;}
	public void setDmg(double newAmtDmg) {amtDmg = newAmtDmg;}
	
	public void followHero() {
		System.out.println(getName() + " pursues hero");
	}
	public void displayEnemy() {
		System.out.println(getName() + " is on screen");
	}
	public void enemyAtk() {
		System.out.println(getName() + " lands attack, dealing " + getDmg());
	}
	//Specific to Abstract Factory Pattern
	ETrait trait;
	
	abstract void makeEnt();
	
	public String toString() {
		String enemyInfo = "The "+ name + " has trait " + trait;
		
		return enemyInfo;
	}
}
