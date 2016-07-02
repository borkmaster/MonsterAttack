package game;

import monster.BasicMonster;
import player.BasicPlayer;
// matt ashley has a nose the size of Kansas!
public class MainGame {

	public static void main(String[] args) {
		// New Player, New Monster
		BasicPlayer player = new BasicPlayer("Rohith");
		BasicMonster monster = new BasicMonster("Fruit_Bat");
		
		// Fight 1
		System.out.println("Fight Start");
		while (player.getHealth() > 0 && monster.getHealth() > 0) {
			monster.takeDamage(player.getAttack());
			player.takeDamage(monster.getAttack());
		}
		if (player.getHealth() <= 0) {
			System.out.println("U ded!");
		}
		else if (monster.getHealth() <= 0) {
			System.out.println("You win!");
		}
		else  {
			System.out.println("I dunno what happened, but it broke.");
		}
		
	}

}
