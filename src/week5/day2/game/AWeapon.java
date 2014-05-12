package week5.day2.game;

public abstract class AWeapon implements IWeapon {
	
	private int damage;

	public AWeapon(int damage) {
		super();
		this.damage = damage;
	}

	@Override
	public int use() {
		return damage;
	}
	
}
