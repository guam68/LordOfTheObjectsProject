package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Player extends Character {

	public Player() {
	}

	public Player(int hp) {
		super(hp);
	}

//	public void chooseAction() {
//		move, attack
//	}

	public char chooseAtk(Scanner scanner) {
		System.out.println("Choose an attack: ");
		System.out.println("a. rock");
		System.out.println("b. paper");
		System.out.println("c. scissors");
		char input = scanner.next().charAt(0);

		return input;
	}

	public int takeDamage(int hp, boolean won) {
		if (!won) {
			hp -= 20;
			System.out.println("You take 20 dmg");

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

	public void move() {
//		move the player backwards and forwards through rooms array (Level)
//		if the next spot in the array is occupied:
//				
//		else:
//			update array with new player position
	}

}
