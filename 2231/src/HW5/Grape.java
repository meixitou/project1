package HW5;

public class Grape extends Fruit{

	private String taste;			//data field
	private boolean hasSeed;		//data field
	
	Grape(){						//constructor
		taste = "Sweet";
		hasSeed = false;
	}
	
	Grape(String taste, boolean hasSeed, int calories, double pricePerPound, Color color){	////constructor
		super(calories, pricePerPound, color);
		this.taste = taste;
		this.hasSeed = hasSeed;
	}

	public String getTaste() {				//getter and setter start
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public boolean isHasSeed() {
		return hasSeed;
	}

	public void setHasSeed(boolean hasSeed) {
		this.hasSeed = hasSeed;
	}										//getter and setter ends

	@Override
	public String toString() {
		return "Grape [taste=" + taste + ", hasSeed=" + hasSeed + ", Color=" + getColor() + ", Calories=" + getCalories()
				+ ", PricePerPound=" + getPricePerPound() + "]";
	}

	
	
}
