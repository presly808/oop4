package week7.day2;

import java.util.Date;

public class Manager {
	
	private int age;
	private long id;
	private String fullname;
	private double salary;
	private Date birthday;
	
	public Manager(){
		
	}

	public Manager(int age, long id, String fullname, double salary,
			Date birthday) {
		super();
		this.age = age;
		this.id = id;
		this.fullname = fullname;
		this.salary = salary;
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public int hashCode() {
		int res = 17;
		res = 31 * res + age;
		res = 31 * res + fullname != null ? fullname.hashCode() : 0;
		res = 31 * res + (int)(id^(id >>> 32));
		res = 31 * res + birthday.hashCode();
		long longBits = Double.doubleToLongBits(salary);
		res = 31 * res + (int)(longBits^(longBits >>> 32));
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (age != other.age)
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (fullname == null) {
			if (other.fullname != null)
				return false;
		} else if (!fullname.equals(other.fullname))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
	
	
	
}
