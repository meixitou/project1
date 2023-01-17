
public abstract class Vehicle {
	
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	HomeWork LabAs6#
	 * 	Description: Vehicle class.
	 ************************************************************/
	
	protected String name;	//data fields
	protected String model;
	protected int year;
	protected int vehicleID;
	
	public Vehicle(){				//constructors
		
	}
	
	public Vehicle(String name, String model, int year, int vehicleID){
		this.name = name;
		this.model = model;
		this.year = year;
		this.vehicleID = vehicleID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}					
	
	public abstract int getSeatingCapacity();

	@Override
	public String toString() {					//toString method
		return "Vehicle [name=" + name + ", model=" + model + ", year=" + year + ", vehicleID=" + vehicleID + "]";
	}
	
	public static void main(String[] args) {
		
			Vehicle noargV = new ElectricVehicle();
			Vehicle overloadV = new ElectricVehicle("Ford", "A1", 2021, 908117, 100);
		
			System.out.println(noargV.toString());
			System.out.println(overloadV.toString());
		
	}
	
}

	
	
