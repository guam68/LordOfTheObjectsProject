package com.skilldistillery.lordoftheobjects;

public class Enemy extends Character {

	public Enemy() {

	}

	public Enemy(int hp) {
		super(hp);
	}

	public char getAttack() {
//		randomly generate attack
		double rand = Math.random();
		if (rand < 0.33) {
			System.out.println("a");
			return 'a';
		} else if (rand < 0.66) {
			System.out.println("b");
			return 'b';
		} else {
			System.out.println("c");
			return 'c';
		}

	}

	public int takeDamage(int hp, boolean won, int dmg) {
		if (won) {
			hp -= dmg;
			System.out.println("Enemy takes " + dmg + " dmg");
		} else {
			System.out.println("Enemy takes no damage");
		}
		return hp;
	}

	public boolean isAlive() {
		if (hp <= 0) {
			System.out.println("You defeated the enemy");
			return false;
		} else
			return true;

	}
}
