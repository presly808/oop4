package week3.day1;

public class TestCompany {

	public static void main(String[] args) {
		Tester t1 = new Tester("Vova", 22, 1200, "MANUAL");
		
		Programmer p1 = new Programmer("Vova", 22, 2300, "JAVA");
		Programmer p2 = new Programmer("Andrey", 20, 1300, "JAVA");
		Programmer p3 = new Programmer("Bogdan", 27, 2300, "JAVA");
		
		Manager m1 = new Manager("Olia", 25, 2200);
		m1.addEmployee(p1);
		m1.addEmployee(p2);
		m1.addEmployee(p3);
		m1.addEmployee(t1);
		
		m1.sortTeamByName();
		
		m1.presentTeam();
	}

}
