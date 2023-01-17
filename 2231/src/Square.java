
public class Square extends GeometricObject{
	private double side = 4;
	
	public Square() {
		super();
	}
	
	public Square(double side) {
		super();
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		super(color,filled);
		this.side = side;
	}
	
	public double getArea() {
		return side * side;
	}
	
	public double getDiameter() {
		return 4 * side;
	}

	@Override
	public String toString() {
		return "Square [getArea()=" + getArea() + ", getPerimeter()=" + getDiameter() + ", getColor()=" + getColor()
				+ ", isFilled()=" + isFilled() + ", toString()="
				+ super.toString() + "]";
	}
}
