package week5.day2.game;

public class TestGame {
	
	public static void main(String[] args) {
		Character human = new Character("Andrey", 300);
		Character ork = new Character("Kirk", 100);
		
		Knife knife = new Knife(30);
		Sword sword = new Sword(60);
		
		human.setWeapon(knife);
		ork.setWeapon(sword);
		
		ork.attack(human);
		System.out.println(human);
		System.out.println(ork);
		
	}
}
