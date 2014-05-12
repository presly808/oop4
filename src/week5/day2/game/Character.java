package week5.day2.game;

public class Character {
	
	private String name;
	private int health;
	private IWeapon weapon;
	
	public Character(String name, int health) {
		super();
		this.name = name;
		this.health = health;
	}
	
	public void attack(Character c){
		c.setHealth(c.getHealth() - weapon.use());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public IWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(IWeapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", health=" + health +
				 "]";
	}
	
	
}
