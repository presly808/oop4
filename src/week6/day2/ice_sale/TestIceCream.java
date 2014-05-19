package week6.day2.ice_sale;

public class TestIceCream {

	public static void main(String[] args) {
		
		Chocolate chocolate = new Chocolate("1", 2,	0.25, null);
		Coconut coconut = new Coconut("2", 1, 0.75, chocolate);
		Cherry cherry = new Cherry("3", 2, 1.0, coconut);
		
		IceCream cream = new IceCream(10, cherry);
		
		System.out.println(cream.getPrice());
	}

}
