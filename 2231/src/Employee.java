
public class Employee extends Person {

	double salary;
	Employee(String name, String address, double salary){
		super(name, address);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String printInfo() {
		return "The Employee name " + super.getName() + " address " + super.getAddress() + " salary " + getSalary();
	}
}
