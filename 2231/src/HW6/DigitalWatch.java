package HW6;

public class DigitalWatch extends Watch{

	private int hourFormat;
	
	public DigitalWatch() {				//constructors
		
	}
	
	public DigitalWatch(String brand, String material, double price, int hourFormat) {
		super(brand, material, price);
		this.hourFormat = hourFormat;
	}

	public int getHourFormat() {
		return hourFormat;
	}

	public void setHourFormat(int hourFormat) {
		this.hourFormat = hourFormat;
	}
	
	public boolean getIsWaterProof() {
		return false;
	}
	
	@Override
	public String toString() {
		return "DigitalWatch [brand=" + getBrand() + ", material=" + getMaterial() + ", price=" + getPrice() + " hourFormat=" + hourFormat + "]";
	}

	@Override
	public String howToChangeWatchTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWaterProof() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
