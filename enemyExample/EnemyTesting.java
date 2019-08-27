package com.collabora.enemyExample;

import java.util.Scanner;

public class EnemyTesting {

	public EnemyTesting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Factory Pattern
		//eEnt represents enemy entity,
		EnemyFactory enemyFactory = new EnemyFactory();
		Enemy eEnt = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What Type? (D/B)");
		if(userInput.hasNextLine()) {
			String typeOfEnemy = userInput.nextLine();
			eEnt = enemyFactory.makeEnemy(typeOfEnemy);
		}
		
		if(eEnt != null) {
			
			doStuffEnemy(eEnt);
		} else System.out.println("Invalid");
		
		//Abstract Factory Pattern
		EnemyBuilder MakeDragonflys = new DragonflyBuilder();
		Enemy blueDF = MakeDragonflys.eEntData("BlueDF");
		System.out.println(blueDF + "\n");

	}
	
	public static void doStuffEnemy(Enemy eEnt) {
		eEnt.displayEnemy();
		eEnt.followHero();
		eEnt.enemyAtk();
	}

}
