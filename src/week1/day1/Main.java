package week1.day1;

public class Main {
	
	public static void main(String[] args){
		
		byte b = 11;
		short s = 32123;
		long l = 3000000000L;
		int i1 = 7;
		double d = 8.0;
		char c = '6';
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = b1 && b2;
		
		double s1 = ((234 * 123) / 20.9);
		
		boolean res = (((25  - 4.0) * (123 - 12) < 23)) != false;
		int a = 23;
		
		if(a < 12){
			//Ctrl + Space
			System.out.println("23 < 45");
		} else if(a == 23){
			
		} else if(a == 14){
			
		} else {
			
		}
		
		int[] mas = new int[5]; // 
		int val = mas[0];
		mas[1] = 23;
		
		// for , while , do - while
		
		for(int i = 0; i < 10; i++){ // i++  => i = i + 1;
			System.out.println(i);
		}
		
		int i = 0;
		while(i < 10){
			System.out.println(i);
		
		}
		
		int j = 0;
		do{
			
			System.out.println(i);
		} while(i < 10);
		
	}
	
}
