package week4.day2;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		String res = "";
		for(int i = 0; i++ < 100;){
			res = res + i;
		}
		

		System.out.println(res);
		
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i++ < 100;){
			sb.append(i);
		}
		System.out.println(sb.toString());
	}

}
