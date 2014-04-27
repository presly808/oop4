package week4.day1.enums;

public class Shop {

	public static void main(String[] args) {
//		sell(Sizes.MIDDLE);
//		sell(25);
//		Sizes[] allValues = Sizes.values();
//		for(Sizes s : allValues){
//			System.out.println(s);
//		}
		Sizes mySize = Sizes.valueOf("SMALL");
		System.out.println(mySize);
		
	}
	
	public static void sell(Sizes size){
		if(Sizes.SMALL == size) {
			System.out.println("Sell small thing");
		} else if (Sizes.MIDDLE == size) {
			System.out.println("Sell middle thing");
		}
	}
	public static void sell(int val){
		if(val == Sizes.SMALL.getLength()) {
			System.out.println("Sell small thing");
		} else if (val == Sizes.MIDDLE.getLength()) {
			System.out.println("Sell middle thing");
		}
	}
}
