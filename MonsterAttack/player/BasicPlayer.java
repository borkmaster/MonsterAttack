package player;

public class BasicPlayer {
	
	private String name;
	private int health = 5;
	private int attack = 0;
	
	public BasicPlayer(String playername) {
		this.name = playername;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public void takeDamage(int damage) {
		this.health = this.health - damage;
		System.out.println(this.name + " takes " + damage + " damage!");
	}

}
