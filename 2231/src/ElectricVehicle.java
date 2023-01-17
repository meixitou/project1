
public class ElectricVehicle extends Vehicle{

	private int batteryCapacity;		//data field
	
	public ElectricVehicle() {		//constructors
		
	}
	
	public ElectricVehicle(String name, String model, int year, int vehicleID, int batteryCapacity) {
		super(name, model, year, vehicleID);
		this.batteryCapacity = batteryCapacity;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	public int getSeatingCapacity() {
		return 30;
	}

	@Override	
	public String toString() {					//toString method
		return "ElectricVehicle [name=" + name + ", model=" + model + ", year=" + year + ", vehicleID=" + vehicleID + ", batteryCapacity=" + batteryCapacity + "]";
	}
	
}
