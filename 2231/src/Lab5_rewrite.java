import java.util.Scanner;
public class Lab5_rewrite {
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:2
	 * 	Task5-rewrite#
	 * 	Description: Implement overload method to find minimum number among two or three integers.
	 ************************************************************/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of integers you will provide: ");
		int num = input.nextInt();
		System.out.println("Entwe the value for 'a' and press Enter: ");
		int a = input.nextInt();
		System.out.println("Entwe the value for 'b' and press Enter: ");
		int b = input.nextInt();
		if(num == 3) {
			System.out.println("Enter the value for 'c' and press Enter: ");
			int c = input.nextInt();
			System.out.printf("Provided Integers: %4d and %4d and %4d, the smaller one is %5d\n", a, b, c, min(a, b, c));
		}
		else {
			System.out.printf("Provided Integers: %4d and %4d, the smaller one is %5d\n", a, b, min(a, b));
		}
	}
	public static int min(int num1, int num2, int num3) {
		if(num1 > num2 && num3 > num2) {
			return num2;
		}
		if(num1 < num2 && num1 < num3) {
			return num1;
		}
		if(num3 < num2 && num3 < num1) {
			return num3;
		}
		return 0;
	}
	public static int min(int num1, int num2) {
		if(num1 > num2) {
			return num2;
		}
		if(num1 < num2) {
			return num1;
		}
		return 0;
	}
}
