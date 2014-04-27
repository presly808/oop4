package week4.day1.interf;

public class Worker implements WorkerBehavior {
	
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work(){
		System.out.println("Im working");
	}

	@Override
	public double getSalary() {
		return 100;
	}
	
}
