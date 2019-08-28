package com.collabora.sandwichTMDP;

public abstract class Sandwich {
	//This simplified version has less components
	
	boolean afterFirstCondiment = false;
	final void makeSandwich() {
		cutBun();
		
		if(wantMeat()) {
			addMeat(); 
			System.out.print("\n");
			}
		if(wantCheese()) {
			addCheese();
			System.out.print("\n");
		}
		
		finishSandwich();
		
	}
	
	public void cutBun() {
		System.out.println("Bun Cut");
	}
	
	abstract void addMeat();
	abstract void addCheese();
	
	boolean wantMeat() {return true;}
	boolean wantCheese() {return true;}
	
	public void finishSandwich() {
		System.out.println("Sandwich Complete");
	}
}
