package HW6;

public class AnalogWatch extends Watch{
		
	private int numOfHands;				//data fields
	
	public AnalogWatch() {				//constructors
		
	}
	
	public AnalogWatch(String brand, String material, double price, int numOfHands) {
		super(brand, material, price);
		this.numOfHands = numOfHands;
	}

	public int getNumOfHands() {
		return numOfHands;
	}

	public void setNumOfHands(int numOfHands) {
		this.numOfHands = numOfHands;
	}

	public boolean getIsWaterProof() {
		return true;
	}
	
	@Override
	public String toString() {				//toString methods
		return "AnalogWatch [brand=" + getBrand() + ", material=" + getMaterial() + ", price=" + getPrice() + " numOfHands=" + numOfHands + "]";
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
