package com.skilldistillery.lordoftheobjects;

public class Tourney {
	
	Player player;
	Enemy[] enemies;
	int counter;
	
	public Tourney(Player player, Enemy[] enemies) {
		this.player = player;
		this.enemies = enemies;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Enemy getEnemy() {
		return enemies[counter];
	}

	public void setEnemies(Enemy[] enemies) {
		this.enemies = enemies;
	}
	
	public void increaseCnt() {
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}
	

	
}
