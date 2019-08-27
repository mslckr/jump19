package com.collabora.enemyExample;

public class EnemyDF extends Enemy {
	
	AdvEnemyFactory enemyFact;

	public EnemyDF(AdvEnemyFactory enemyFact) {
		this.enemyFact = enemyFact;
	}

	@Override
	void makeEnt() {
		System.out.println("Making "+ getName());
		
		trait = enemyFact.addETraitOne();

	}

}
