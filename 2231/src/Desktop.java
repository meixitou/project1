
public class Desktop extends Computer{
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:5
	 * 	Task2#
	 * 	Description: Desktop child class.
	 ************************************************************/
	private double width = 38.5;
	private double height = 27.8;
	
	public Desktop() {
		super();
	}
	
	public Desktop(String model, String brandName, String manufacturingDate, int numberOfCores, double width, double height) {
		super(model, brandName, manufacturingDate, numberOfCores);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Desktop [Width = " + getWidth() + "cm , Height = " + getHeight() + "cm , Model = " + getModel()
				+ ", BrandName = " + getBrandName() + ", ManufacturingDate = " + getManuF()
				+ ", NumberOfCores = " + getNumberOfCores() + "]";
	}
	
}
