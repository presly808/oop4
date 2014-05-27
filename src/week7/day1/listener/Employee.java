package week7.day1.listener;

public class Employee implements MyListener {

	@Override
	public void action() {
		work();
	}
	
	public void work(){
		System.out.println("Employee is working");
	}
	
	
}
