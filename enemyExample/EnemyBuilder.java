package com.collabora.enemyExample;

public abstract class EnemyBuilder {
	
	protected abstract Enemy makeEnemy(String typeOfEnemy);
	
	public Enemy eEntData(String typeOfEnemy) {
		Enemy enemyEnt = makeEnemy(typeOfEnemy);
		
		enemyEnt.makeEnt();
		enemyEnt.displayEnemy();
		enemyEnt.followHero();
		enemyEnt.enemyAtk();
		
		return enemyEnt;
	}

	public EnemyBuilder() {
		// TODO Auto-generated constructor stub
	}

}
