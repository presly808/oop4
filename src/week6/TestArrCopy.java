package week6;

import java.util.Arrays;

public class TestArrCopy {

	public static void main(String[] args) {
		int[] src = {1,2,3,4,5,6,7};
		
		int[] dest = new int[10];
		
		System.arraycopy(src, 2, dest, 3, 4);
		
		System.out.println(Arrays.toString(dest));
		
		
	}

}
