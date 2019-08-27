package com.collabora.enemyExample;

public class DragonflyFactory implements AdvEnemyFactory {

	public ETrait addETraitOne() {
		return new ETraitDF();
	}

}
