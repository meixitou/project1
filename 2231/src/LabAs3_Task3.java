
public class LabAs3_Task3 {
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab Assignment3#
	 *  Task3 
	 * 	Description: Calculate average number of index 0 and 1 and put it in index 3.
	 ************************************************************/
	public static void main(String[] args) {
		double[][] studentGrade = {{10, 20, 0},{20, 40, 0}};
		System.out.println("Original grade is: ");
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(studentGrade[i][j] + " ");
			}
			System.out.println(" ");
		}

		computeAve(studentGrade);
		System.out.println(" ");
		System.out.println("Computed grade grade is: ");
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(studentGrade[i][j] + " ");
			}
			System.out.println(" ");
		}
	
	
	}
	
	public static void computeAve(double gradeBook[][]) {
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				sum = (int) (sum + gradeBook[i][j]);
			}
			gradeBook[i][2] = sum / 2.0;
			sum = 0;
		}
	}
	
}
