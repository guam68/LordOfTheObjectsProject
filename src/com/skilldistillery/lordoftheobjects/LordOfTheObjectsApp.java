package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class LordOfTheObjectsApp {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Player player = new Player(100);
		Enemy enemy1 = new Enemy(20);
		Enemy enemy2 = new Enemy(40);
		Enemy enemy3 = new Enemy(60);
		Enemy[] enemies = { enemy1, enemy2, enemy3 };
		Tourney tourney = new Tourney(player, enemies);

		startMenu(scanner, tourney);

	}

	public static boolean battle(Scanner scanner, Tourney tourney) {

		while (true) {
			char pAtk = tourney.getPlayer().chooseAtk(scanner);
			char eAtk = tourney.getEnemy().getAttack();
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

	public static void startMenu(Scanner scanner, Tourney tourney) {
		System.out.println("Welcome to 2019 USARPS Championships sponsered by Budlight!");
		System.out.println("1. Play");
		System.out.println("2. Information");
		System.out.println("3. Exit");
		char choice = scanner.next().charAt(0);

		if (choice == '1') {
			playGame(scanner, tourney);
		} else if (choice == '2') {
			System.out.println("");
			startMenu(scanner, tourney);
		} else {
			System.exit(0);
		}
	}

	public static void inGameMenu(Scanner scanner, Tourney tourney) {
		System.out.println("1. Continue");
		System.out.println("2. Quit");
		char choice = scanner.next().charAt(0);

		if (choice == '1') {
			playGame(scanner, tourney);
		} else if (choice == '2') {
			System.exit(0);
		} else {
			System.out.println("Please choose a valid response");
			inGameMenu(scanner, tourney);
		}
	}

	public static void playGame(Scanner scanner, Tourney tourney) {
		boolean eneAlive = true;

		do {
			boolean win = battle(scanner, tourney);
			tourney.getPlayer().setHp(tourney.getPlayer().takeDamage(tourney.getPlayer().getHp(), win, tourney.getEnemy().getDmg()));
			tourney.getEnemy().setHp(tourney.getEnemy().takeDamage(tourney.getEnemy().getHp(), win, tourney.getPlayer().getDmg()));
			tourney.getPlayer().isAlive();
			eneAlive = tourney.getEnemy().isAlive();
			tourney.getPlayer().printHp();
		} while (eneAlive);
		tourney.increaseCnt();
		if (tourney.getCounter() > 2) {
			youWin();
		}
		inGameMenu(scanner, tourney);
	}

	public static void youWin() {
		System.out.println("You Win!");
		System.out.println("\t    '._==_==_=_.'\n" + "            .-\\:      /-.\n" + "           | (|:.     |) |\n"
				+ "            '-|:.     |-'\n" + "              \\::.    /\n" + "               '::. .'\n"
				+ "                 ) (\n" + "               _.' '._\n" + "              `\"\"\"\"\"\"\"`");
		System.exit(0);
	}

}
