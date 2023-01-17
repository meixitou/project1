import java.util.Scanner;
public class Lab4_rewrite {

	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:2
	 * 	Task4-rewrite#
	 * 	Description: Implement method to find the minimum integers.
	 ************************************************************/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entwe the value for 'a' and press Enter: ");
		int a = input.nextInt();
		
		System.out.println("Entwe the value for 'b' and press Enter: ");
		int b = input.nextInt();
		
		input.close();
		
		System.out.printf("Provided Integers: %4d and %4d, the smaller one is %5d\n", a, b, min(a, b));
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
