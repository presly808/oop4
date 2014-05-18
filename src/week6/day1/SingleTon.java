package week6.day1;

public class SingleTon {

	// private static SingleTon instance = new SingleTon(); non-lazy init

	private static SingleTon instance = null;
	private String ip;

	private SingleTon() {
		System.out.println("in constructor");
	}

	public static SingleTon getInstance() {

		if (instance == null) {   
			instance = new SingleTon();
		}
		return instance;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
