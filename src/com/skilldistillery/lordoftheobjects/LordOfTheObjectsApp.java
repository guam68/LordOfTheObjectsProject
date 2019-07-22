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
			System.out.println("You've trained your entire life and now the big event is here");
			System.out.println("Nothing has tested your physical endurance, mental standing, or /n your personal grit quite like training for the Rock-Paper-Scissors World Championship");
			System.out.println("The tournament starts soon and you set your eyes on overtaking\nthe current world Rock-Paper-Scissors Champion, Sean \"WickedFingers\" Sears.");
			System.out.println();
			System.out.println("The game is simple, choose your attack, and make your way through \nthe tournament participants without being overpowered by their deadly Rock-Paper-Scissor choosing. \n Take note of where you stand in the bracket and whom your opponent is, make it out of the initial bracket to take on the defending Champion");
			System.out.println();
			System.out.println("Here is the Bracket");
			printBracketStarting();
			System.out.println();
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
		if (tourney.getCounter() == 0) {
			printBracketStarting();
		} else if (tourney.getCounter() == 1) {
			printBracket2();
		} else if (tourney.getCounter() == 2) {
			printFinals();
		}
		if (tourney.getCounter() > 2) {
			youWin();
		}
		inGameMenu(scanner, tourney);
	}

	public static void youWin() {
		System.out.println("You Win! YOU ARE THE USARPS 2019 WORLD CHAMPION! Now go find a better hobby.");
		System.out.println("************************************************************");
		System.out.println("************************************************************");
		System.out.println("\t    '._==_==_=_.'\n" + "            .-\\:      /-.\n" + "           | (|:.     |) |\n"
				+ "            '-|:.     |-'\n" + "              \\::.    /\n" + "               '::. .'\n"
				+ "                 ) (\n" + "               _.' '._\n" + "              `\"\"\"\"\"\"\"`");
		System.out.println("************************************************************");
		System.out.println("************************************************************");
		System.exit(0);
	}
	
	public static void printBracketStarting () {
		
		System.out.println("                                                         Sean \"WICKEDFINGERS\" Sears                                                        ");
		System.out.println("                                                                     |                                                                      ");
		System.out.println("                               ______________________________________|___________________________________________                            ");
		System.out.println("                              |                                                                                  |                             ");
		System.out.println("           ___________________|_______________________                                      _____________________|________________________       ");
		System.out.println("    ______|______                             ________|______                       _______|________                              ________|________ ");
		System.out.println("   |             |                           |               |                     |                |                            |                 |  ");
		System.out.println("  You    VS Sarah \"Bulldog\"    Joe \"Paperbones\" VS   \"Badboy\" Bautista   Brock \"Rock\" VS Skeeter the \"Cheater\"         Sally \"Scissors\"  VS   Just Mike ");
		System.out.println();
		

	}

	public static void printBracket2() {
		
			
			System.out.println("                                                         Sean \"WICKEDFINGERS\" Sears                                                        ");
			System.out.println("                                                                     |                                                                      ");
			System.out.println("                               ______________________________________|___________________________________________                            ");
			System.out.println("                              |                                                                                  |                             ");
			System.out.println("           ___________________|_______________________                                      _____________________|______________________       ");
			System.out.println("          |                                           |                                    |                                            |  ");
			System.out.println("         You                                  Joe \"Paperbones\"                    Skeeter the \"Cheater\"                        Sally \"Scissors\" ");
			System.out.println("                         		                                                                  														");
			System.out.println();
		
		
		
	}
	
	public static void printFinals() {
		System.out.println("***********************************");
		System.out.println("***********************************");
		System.out.println("YOU VS SEAN \"WICKEDFINGERS\" SEARS");
		System.out.println("***********************************");
		System.out.println("***********************************");
		
	}

} //End Program