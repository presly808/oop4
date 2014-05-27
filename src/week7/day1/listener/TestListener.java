package week7.day1.listener;

public class TestListener {

	public static void main(String[] args) {
		Employee em = new Employee();
		
		OfficeManager officeManager = new OfficeManager("Olia", em);
		officeManager.notifyListener();

	}

}
