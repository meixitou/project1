import java.util.Scanner;
public class Lab7_rewrite {

	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:2
	 * 	Task7-rewrite#
	 * 	Description: Find minimum.
	 ************************************************************/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter how many numbers you want to compare: ");
		int digits = input.nextInt();
		min(digits);
	}

	public static void min(int num) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[num];
		System.out.print("Now enter the number you wanna compare:  ");
		
		for(int i = 0; i < num; i++) {
			int number = input.nextInt();
			a[i] = number;
		}
		
		int min = a[0];
		
		for(int j = 0; j < a.length; j++) {
			if(a[j] < min) 
				min = a[j];
		}
		
		System.out.println("The smallest number is: " + min);
	}
}
