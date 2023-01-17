
public class Laptop extends Computer{
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:5
	 * 	Task2#
	 * 	Description: Laptop child class.
	 ************************************************************/
	private double weight = 4.07;
	
	public Laptop() {
		super();
	}
	
	public Laptop(String model, String brandName, String manufacturingDate, int numberOfCores, double weight) {
		super(model, brandName, manufacturingDate, numberOfCores);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Laptop [Weight = " + getWeight() + "kg , Model = " + getModel() + ", BrandName = "
				+ getBrandName() + ", ManufacturingDate = " + getManuF() + ", NumberOfCores = "
				+ getNumberOfCores() + "]";
	}
	
}
