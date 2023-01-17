import java.util.Scanner;
public class LabAs2_Task6 {
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:2
	 * 	Task6#
	 * 	Description: Implement overload method to add two integers or three or four.
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
			System.out.printf("Provided Integers: %4d and %4d and %4d, the total is %5d\n", a, b, c, sum(a, b, c));
		}
		else if(num == 4){
			System.out.println("Enter the value for 'c' and press Enter: ");
			int c = input.nextInt();
			System.out.println("Enter the value for 'd' and press Enter: ");
			int d = input.nextInt();
			
			System.out.printf("Provided Integers: %4d and %4d and %4d and %4d, the total is %5d\n", a, b, c, d, sum(a, b, c, d));
		}
		else {
			System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a, b, sum(a, b));
		}
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3 + num4;
	}
}
