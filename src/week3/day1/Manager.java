package week3.day1;

public class Manager extends Employee {
	
	private Employee[] team = new Employee[5];
	private int counter = 0; // counter 
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, double salary) {
		super(name, age, salary);
		// TODO Auto-generated constructor stub
	}
	
	public void addEmployee(Employee empl){
		team[counter++] = empl; 
	}
	
	public void removeLastEmployee(){
		team[--counter] = null;
	}
	
	public void presentTeam(){
		for(int i = 0; i < counter; i++){
			team[i].printInfo();
		}
	}
	
	public void sortTeamByName(){
		for(int i = 0; i < counter; i++){
			int minI = i;
			for(int j = i + 1; j < counter; j++){
				if(team[minI].getName().compareTo(team[j].getName()) > 0){
					minI = j;
				}
			}
			
			Employee temp = team[i];
			team[i] = team[minI];
			team[minI] = temp;
			
		}
	}
	
	
}
