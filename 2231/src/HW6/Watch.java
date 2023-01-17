package HW6;

public abstract class Watch implements Timer{
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	HomeWork Assignment6#
	 * 	Description: Watch class.
	 ************************************************************/
	private String brand;		//data fields
	private String material;
	private double price;
	
	public Watch() {			//constructors
		
	}
	
	public Watch(String brand, String material, double price) {
		this.brand = brand;
		this.material = material;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract boolean isWaterProof();			//abstract methods

	@Override
	public String toString() {					//toString method
		return "Watch [brand=" + brand + ", material=" + material + ", price=" + price + "]";
	}
	
	public static void main(String[] args) {
		
		Watch w1 = new AnalogWatch("Apple", "Stain", 799, 2);
		Watch w2 = new DigitalWatch("Huawei", "Stain", 499, 24);
		
		System.out.println(w1.toString());
		System.out.println(w2.toString());
		
		System.out.println(w1.getCurrentTime());
		System.out.println(w2.getCurrentTime());
		
	}
	
}
