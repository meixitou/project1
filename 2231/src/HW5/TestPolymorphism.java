package HW5;

import HW5.Fruit.Color;

public class TestPolymorphism {

	public static void main(String[] args) {
		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit(40, 7, Color.YELLOW);
		
		System.out.println("The number of fruits is: " + Fruit.getNumberOfFruits());
		
		Fruit apple1 = new Apple();
		Apple apple2 = new Apple("round", "rough", 50, 5, Color.RED);
		Fruit grape1 = new Grape();
		Grape grape2 = new Grape("sour", true, 40, 7, Color.PURPLE);
		
		System.out.println("After creation, the number of fruits is: " + Fruit.getNumberOfFruits());
		
		System.out.println("The actual class is "+fruit1.getClass());
		System.out.println("The actual class is "+fruit2.getClass());
		System.out.println("The actual class is "+apple1.getClass());
		System.out.println("The actual class is "+apple2.getClass());
		
		System.out.println("Is object fruit1 and apple1 equal? " + (fruit1).equals(apple1));
		
		System.out.println("The actual class is "+grape1.getClass());
		System.out.println("The actual class is "+grape2.getClass());
		
		System.out.println("Is object fruit2 and grape2 equal? " + (fruit2).equals(grape2));
		
		System.out.println(apple2.getTexture());
		System.out.println(grape2.getTaste());
		
		displayObject(fruit1);
		displayObject(fruit2);
		displayObject(apple1);
		displayObject(apple2);
		displayObject(grape1);
		displayObject(grape2);
		
	}

	public static void displayObject(Object obj) {
		if(obj instanceof Fruit  || obj instanceof Apple || obj instanceof Grape) {
			System.out.println(obj.toString());
		}
		else {
			System.out.println("Your object does not belong to one of the fruits!");
		}
	}
}
