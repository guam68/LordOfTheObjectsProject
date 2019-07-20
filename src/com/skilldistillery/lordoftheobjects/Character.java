package com.skilldistillery.lordoftheobjects;

public class Character {
	protected int hp;

	public Character() {
	}

	public Character(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
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
