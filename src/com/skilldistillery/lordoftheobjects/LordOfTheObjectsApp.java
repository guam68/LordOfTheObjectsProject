package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class LordOfTheObjectsApp {
	private static Scanner scanner = new Scanner(System.in);
	private static Player player = new Player(100);
	private static Enemy enemy1 = new Enemy(20);
	private static Enemy enemy2 = new Enemy(40);
	private static Enemy enemy3 = new Enemy(60);
	private static int counter = 0;
	static Enemy [] enemies = {enemy1, enemy2, enemy3};

	public static void main(String[] args) {
		youWin();
		
		startMenu(scanner);
		
	}

	public static boolean battle() {

		while (true) {
			char pAtk = player.chooseAtk(scanner);
			char eAtk = enemy1.getAttack();
			if (pAtk == 'a') {
				if (eAtk == 'b') {
					return false;
				} else if (eAtk == 'c') {
					return true;
				} else {
					System.out.println("Draw");
					continue;
				}
			} else if (pAtk == 'b') {
				if (eAtk == 'c') {
					return false;
				} else if (eAtk == 'a') {
					return true;
				} else {
					System.out.println("Draw");
					continue;
				}
			} else if (pAtk == 'c') {
				if (eAtk == 'a') {
					return false;
				} else if (eAtk == 'b') {
					return true;
				} else {
					System.out.println("Draw");
					continue;
				}
			}
		}

	}
	
	public static void startMenu(Scanner scanner) {
		System.out.println("1. Play");
		System.out.println("2. How to Play");
		System.out.println("3. Exit");
		char choice = scanner.next().charAt(0);
		
		if (choice == '1') {
			playGame(enemies[counter]);
		} else if (choice == '2') {
			System.out.println("How to play");
			startMenu(scanner);
		} else {
			System.exit(0);
		}
	}
	
	public static void inGameMenu(Scanner scanner) {
		System.out.println("1. Continue");
		System.out.println("2. Quit");
		char choice = scanner.next().charAt(0);
		
		if (choice == '1') {
			playGame(enemies[counter]);
		} else if (choice == '2') {
			System.exit(0);
		} else {
			System.out.println("Please choose a valid response");
			inGameMenu(scanner);
		}
	}
	
	public static void playGame(Enemy enemy) {
		boolean eneAlive = true;
		
		do {
		boolean win = battle();
		player.setHp(player.takeDamage(player.getHp(), win));
		enemy.setHp(enemy.takeDamage(enemy.getHp(), win));
		player.isAlive();
		eneAlive = enemy.isAlive();
		player.printHp();
		} while (eneAlive);
		counter ++;
		if (counter > 2) {
			youWin();
		}
		inGameMenu(scanner);
	}
	
	public static void youWin() {
		System.out.println("You Win!");
		System.out.println("\t    '._==_==_=_.'\n" + 
				"            .-\\:      /-.\n" + 
				"           | (|:.     |) |\n" + 
				"            '-|:.     |-'\n" + 
				"              \\::.    /\n" + 
				"               '::. .'\n" + 
				"                 ) (\n" + 
				"               _.' '._\n" + 
				"              `\"\"\"\"\"\"\"`");
	}

}
