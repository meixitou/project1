
public class LabAs2_Task7 {

	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:2
	 * 	Task7#
	 * 	Description: Implement method to add multiple numbers.
	 ************************************************************/
	
	public static void main(String[] args) {
		sum(34, 4);
		sum(34, 4, 3);
		sum(34, 4, 3, 2);
		sum(34, 4, 3, 2, 56);
		sum(34, 4, 3, 2, 56, 5);
		sum(34, 4, 3, 2, 56, 5, 990);
			}

	public static void sum(int... numbers) {
		int sum = 0;
		
		for(int i : numbers) 
			sum += i;
		System.out.println("The sum of numbers is: " + sum);
	}
}
