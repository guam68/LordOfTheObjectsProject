package com.skilldistillery.lordoftheobjects;

public class Character {
	protected int hp;
	protected int attackDmg;

	public Character() {
	}

	public Character(int hp) {
		this.hp = hp;
		this.attackDmg = 20;
	}

	public int getHp() {
		return hp;
	}
	
	public int getDmg() {
		return attackDmg;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAtkType(char atkType) {
		
	}
	
	public void printHp() {
		System.out.println("HP: " + hp);
	}
	
	
	
}
