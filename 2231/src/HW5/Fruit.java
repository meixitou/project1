package HW5;

public class Fruit {
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	HomeWork Assignment5#
	 * 	Description: Fruit parent class.
	 ************************************************************/
	enum Color{																	//enum class
		YELLOW, ORANGE, RED, PURPLE;
	}
	
	protected static int numberOfFruits;										//data field
	private int calories;														//data field
	private double pricePerPound;												//data field
	private Color color;														//data field
			
	Fruit(){																	//constructor
		calories = 165;
		pricePerPound = 4;	
		numberOfFruits++;
	}
	
	Fruit(int calories, double pricePerPound, Color color){ 					//constructor
		this.calories = calories;
		this.pricePerPound = pricePerPound;
		this.color = color;
		numberOfFruits++;
	}
	
	public Color getColor() {													//getter and setter starts
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}
	
	public static int getNumberOfFruits() {
		return numberOfFruits;
	}																			//getter and setter ends	

	@Override
	public String toString() {													//toString method
		return "Fruit [calories=" + calories + ", pricePerPound=" + pricePerPound + ", color=" + color + "]";
	}

}
