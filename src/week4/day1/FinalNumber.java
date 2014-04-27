package week4.day1;

import week3.day1.Employee;

public class FinalNumber {
	
	private final int num;
	private final Employee empl = new Employee("Vova", 34, 2000);
	
	public FinalNumber(){
		num = 7;
	}
	
	public FinalNumber(int num){
		this.num = num;
	}
	
	public final void action(){
		Employee em2 = empl;
	}
	
	public void show(){
		System.out.println("Parent show");
	}
	
}


class MyNum extends FinalNumber {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}

	
}
