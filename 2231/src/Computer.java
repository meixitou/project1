
public class Computer {
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:5
	 * 	Task2#
	 * 	Description: Computer parent class.
	 ************************************************************/
	private String model = "Legion 7i";
	private String brandName = "Lenovo";
	private String manuF = "March 27, 2021";
	private int numberOfCores = 8;
	
	public Computer() {
		
	}
	
	public Computer(String model, String brandName, String manuF, int numberOfCores) {
		this.model = model;
		this.brandName = brandName;
		this.manuF = manuF;
		this.numberOfCores = numberOfCores;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getManuF() {
		return manuF;
	}

	public void setManuF(String manuF) {
		this.manuF = manuF;
	}

	public int getNumberOfCores() {
		return numberOfCores;
	}

	public void setNumberOfCores(int numberOfCores) {
		this.numberOfCores = numberOfCores;
	}

	@Override
	public String toString() {
		return "Computer [model=" + model + ", brandName=" + brandName + ", manufacturingDate=" + manuF
				+ ", numberOfCores=" + numberOfCores + "]";
	}
	
}
