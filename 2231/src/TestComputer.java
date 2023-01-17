
public class TestComputer {
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab:5
	 * 	Task2#
	 * 	Description: Test classes.
	 ************************************************************/
	public static void main(String[] args) {
		Computer c1 = new Computer("Inspiron 1545", "DELL", "April 1, 2020", 2);
		System.out.println(c1.toString());
		
		
		Computer c2 = new Computer("A2338", "Macbook", "March 31, 2020", 4);
		System.out.println(c2.toString());
		
		
		Computer c3 = new Computer();
		System.out.println(c3.toString());
		
		
		Desktop c4 = new Desktop();
		System.out.println(c4.toString());
		
		
		Desktop c5 = new Desktop("X17R2", "Alienware", "October 26, 2022", 8, 41.5, 25.5);
		System.out.println(c5.toString());
		
		Laptop c6 = new Laptop();
		System.out.println(c6.toString());
	}
}
