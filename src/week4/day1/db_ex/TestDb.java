package week4.day1.db_ex;

public class TestDb {

	public static void main(String[] args) {
		DB db = new DB();
		MyDangerDB dbDangerDB = new MyDangerDB();
		
		Service.getConnection(dbDangerDB);

	}

}
