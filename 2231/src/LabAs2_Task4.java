import java.util.Scanner;
public class LabAs2_Task4 {

	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:2
	 * 	Task4#
	 * 	Description: Implement method to add two integers.
	 ************************************************************/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entwe the value for 'a' and press Enter: ");
		int a = input.nextInt();
		
		System.out.println("Entwe the value for 'b' and press Enter: ");
		int b = input.nextInt();
		
		input.close();
		
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a, b, sum(a, b));
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
}
