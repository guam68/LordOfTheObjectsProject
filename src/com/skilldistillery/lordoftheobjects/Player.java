package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Player extends Character {

	public Player() {
	}

	public Player(int hp) {
		super(hp);
	}


	public char chooseAtk(Scanner scanner) {
		System.out.println("Choose an attack: ");
		System.out.println("a. rock");
		System.out.println("b. paper");
		System.out.println("c. scissors");
		char input = scanner.next().charAt(0);

		return input;
	}

	public int takeDamage(int hp, boolean won, int dmg) {
		if (!won) {
			hp -= dmg;
			System.out.println("You take " + dmg + " dmg");

		} else {
			System.out.println("You take no damage");
		}
		return hp;
	}

	public void isAlive() {
		if (hp <= 0) {
			System.out.println("You died");
			System.exit(0);
		}
	}


}
