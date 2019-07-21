# Lord Of The Objects Project

## Overview
The overall goal of this project was to solidify our understanding of object oriented programming by creating a terminal game. Through the implementation of our game, we would practice three of the four fundamentals of OOP: abstraction, encapsulation, and inheritance. The project had six basic criteria:
1. When the program starts, the user is welcomed and given a list of available commands.
2. The game continues until the user either dies reaches the win condition.
3. The player must fight enemies who have health and attack damage.
4. Each time an enemy is hit, it will strike back, unless it is defeated.
5. The player takes cumulative damage over time; if the player's health is depleted, the player is defeated.
6. The win condition is met when the player defeats three enemies.

## Implementation

We came up with four classes that needed to be implemented to create our game. The first was our Character class which was used as a base to set up our next two classes: Player and Enemy. These two classes held our logic for generating attacks and dealing damage. The final class created was Tourney which was used to hold and manipulate our characters.

These objects were all created in our main app. The logic for the menu and battle systems as well as the methods to start playing and check the win condition were also held here.

<img src="https://github.com/guam68/LordOfTheObjectsProject/blob/master/static/ULM.png" alt="ULM" width="500"/>


### Run Through

At program start, the user is welcomed and shown a menu where they can choose to start the tournament, view information on the tourney, or quit out. After starting play, the player enters the first round of the tournament and uses a rock, paper, scissors battle system to "attack" the opponent. "Damage" is dealt to the losing character. Once the opponents "health" is dropped to zero, it is defeated. The player is then brought to a menu where they may choose to continue, view the tournament bracket, or drop out. If at any time the player's health hits zero or less, the player loses and the game terminates. Once the player has defeated three opponents, a message is output to the user notifying them they won and they are presented an ASCII trophy. 

## Technologies Used
- Java
- Eclipse

## Authors
- Branden Bent
- Daniel Bautista
