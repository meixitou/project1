package HW5;

public class Apple extends Fruit{
	
	private String variety;			//data field
	private String texture;			//data field
	
	Apple(){						//constructor
		variety = "round";
		texture = "wave";
	}
	
	Apple(String variety, String texture, int calories, double pricePerPound, Color color){			//constructor
		super(calories, pricePerPound, color);
		this.variety = variety;
		this.texture = texture;
	}

	public String getVariety() {			//getter and setter start
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {//getter and setter ends
		this.texture = texture;
	}

	@Override
	public String toString() {			//toString
		return "Apple [variety=" + variety + ", texture=" + texture + ", Color=" + getColor() + ", Calories=" + getCalories()
				+ ", PricePerPound=" + getPricePerPound() + "]";
	}

	

}
