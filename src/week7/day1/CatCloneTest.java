package week7.day1;

import java.util.Date;

public class CatCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat cat = new Cat(2, "Bonia", new Date());
		
		Cat cat2 = (Cat) cat.clone();
		
		System.out.println(cat);
		System.out.println(cat2);
		
		
	}

}
