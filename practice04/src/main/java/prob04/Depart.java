package prob04;

public class Depart extends Employee {
	String department;
	public Depart() {
		
	}
	Depart(String name, int salary, String depart ) {
		super(name, salary);
		this.department=depart;
	}
	public void getInformation() {
		System.out.println("이름:" + super.getName() + "\t\t연봉:" + super.getSalary() + "\t\t부서:" + department);
	}
}