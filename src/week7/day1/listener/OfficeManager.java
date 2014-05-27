package week7.day1.listener;

public class OfficeManager {
	
	private String name;
	private MyListener listener;
	
	public OfficeManager(String name, MyListener listener) {
		super();
		this.name = name;
		this.listener = listener;
	}

	public void notifyListener(){
		listener.action();
	}
	
}
