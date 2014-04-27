package week4.day1.interf;

public class TestInterf {
	
	public static void main(String[] args) {
		Student s = new Student();
		
		Worker w = new Worker();
		
		SuperPerson sp = new SuperPerson();
		
		Company.showWorker(sp);
		Company.showWorker(w);
		
		Univercity.addStudent(s);
		Univercity.addStudent(sp);
		
		
	}
	
	
}
