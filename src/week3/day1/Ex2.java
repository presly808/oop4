package week3.day1;

public class Ex2 {

	public static void main(String[] args) {
		Employee em1 = new Programmer();
		Employee em2  = new Tester();
		
		// instanceof
		
		if(em1 instanceof Programmer){
			System.out.println("em1 has programmer object");
			Programmer p1 = (Programmer)em1;
			p1.coding();
		}
		//Ctrl + LClick
		

	}

}
