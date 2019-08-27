package com.collabora.enemyExample;

public class EnemyFactory {
	
	public Enemy makeEnemy(String newEnemyType) {
		Enemy newEnemy = null;
		if(newEnemyType.equals("D")) {
			return new FastEnemyOne();
		} else
		if(newEnemyType.equals("B")) {
			return new BulkyEnemyOne();
		} else return null;
	}
}
