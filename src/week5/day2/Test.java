package week5.day2;

public class Test {
	
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		InsertionSorter sorter = new InsertionSorter();
		
		a.setSorter(sorter);
		b.setSorter(sorter);
		c.setSorter(sorter);
		
		SelectionSorter ss = new SelectionSorter();
		
		a.setSorter(ss);
		c.setSorter(ss);
		
		
	}
	
	
}
