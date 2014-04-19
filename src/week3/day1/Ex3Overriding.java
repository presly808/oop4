package week3.day1;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Ex3Overriding {

	public static void main(String[] args) {
		Employee t1 = new Tester("Vova", 22, 1200, "MANUAL");

		Programmer p1 = new Programmer("Sasha", 34, 1200, "C++");
		
		System.out.println(t1);
		System.out.println();
	}

}
