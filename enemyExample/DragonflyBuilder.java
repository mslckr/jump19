package com.collabora.enemyExample;

public class DragonflyBuilder extends EnemyBuilder {

	public DragonflyBuilder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Enemy makeEnemy(String typeOfEnemy) {
		Enemy enemyEnt = null;
		
		if(typeOfEnemy.equals("BlueDF")) {
			AdvEnemyFactory dfFactory = new DragonflyFactory();
			enemyEnt = new EnemyDF(dfFactory);
			enemyEnt.setName("Giant Blue Dragonfly");
			
			
		}
		return enemyEnt;
	}

}
