package week4.day1.interf;

public class SuperPerson implements StudentBehavior, WorkerBehavior{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work() {
		System.out.println("SuperPerson working");
		
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public void study() {
		System.out.println("Superperson studying");
		
	}

}
