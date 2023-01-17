
public class Customer extends Person{
	
	double balance;
	
	Customer(String name, String address, double balance){
		super(name, address);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String printInfo() {
		return "The customer name " + super.getName() + " address " + super.getAddress() + " balance " + getBalance() + " dollars";
	}
	
	public static void main(String[] args) {
		Person p1 = new Customer("Damien", "Morris Ave", 100000);
		System.out.println(p1.printInfo());
	}
}
