import java.util.Random;

public class AS2_Q2 {
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Assignment2 Question3#
	 * 	Description: Generate random 5x6 matrix and calculate the product of odd number.
	 ************************************************************/
	public static void main(String[] args) {
		int[] myList = new int[30];
		
		System.out.println("Initial Matrix: ");
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 5; j++) {
				int max = 500;
				int min = 100;
				Random random = new Random();
				int number = random.nextInt(401)%(max - min + 1) + min;
				
				myList[j + (i * 5)] = number;
				System.out.print(number + " | ");
			}
			System.out.println(" ");
		}
		
		for(int i = 0; i < 30; i++) {
			if(myList[i] % 2 == 1) {
				myList[i] = myList[i] * 2;
			}
		}
		
		System.out.println(" ");
		System.out.println("New Matrix:");
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(myList[j + (i * 5)] + " | ");
			}
			System.out.println(" ");
		}
	}
}
