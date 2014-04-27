package week4.day1.abstract_c;

public class TestAbstract {

	public static void main(String[] args) {
		AEmployee am = new Manager(12, "Vova");
		companyAction(am);
		
		Tester t = new Tester(12, "Ania");
		companyAction(t);
	}
	
	public static void companyAction(AEmployee em) {
		em.showInfo();
	}

}
