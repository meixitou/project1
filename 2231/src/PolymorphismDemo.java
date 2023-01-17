
public class PolymorphismDemo {
	
	public static void main(String[] args) {
		
		GeometricObject obj1 = new Circle(1, "red", false);
		GeometricObject obj2 = new Rectangle(1, 1, "black", true);
		GeometricObject obj3 = new Square(3);
		
		//displayObject(obj1);
		//displayObject(obj2);
		//displayObject(obj3);
		
		System.out.println("Circle details: ");
		System.out.println(obj1.toString());
		
		System.out.println("Rectangle details: ");
		System.out.println(obj2.toString());
		
		System.out.println("Square details: ");
		System.out.println(obj3.toString());
	}
	
	//public static void displayObject(GeometricObject obj) {
		//System.out.println("Created on " + obj.getDateCreated() + ". Color is " + obj.getColor());
	//}
}
