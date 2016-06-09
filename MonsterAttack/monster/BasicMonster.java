package monster;

public class BasicMonster {
	
	private String name;
	private int attack = 3;
	private int health = 10;
	
	public BasicMonster(String monstername) {
		this.name = monstername;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void takeDamage(int damage) {
		this.health = this.health - damage;
		System.out.println(this.name + " takes " + damage + " damage!");
	}

}
