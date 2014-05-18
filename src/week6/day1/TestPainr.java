package week6.day1;

public class TestPainr {

	public static void main(String[] args) {
		GenericPair<String, Integer> pair = new GenericPair<>();
		//pair.setOne(5); //Compilation exception
		String s = pair.getOne();
		
		GenericPair pairObj = new GenericPair();
		pairObj.setOne(5);
		String s1 = (String) pairObj.getOne(); // Runtime Exception

	}

}
