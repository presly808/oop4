package week5.day1;

public class TestGroup {

	public static void main(String[] args) {
		//Group g = new Group();
		Group.Student s = new Group.Student();
		final int a = 78;
		int b = 99;
		
		class LocalClass{
			public void action(){
				System.out.println("a = " + a);
				System.out.println("Local Class Action");
			}
		}
		
		
		
		LocalClass lc = new LocalClass();
		lc.action();
		
	}
}
