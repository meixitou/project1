import java.util.Scanner;
import java.util.Random;
public class AS1 {
	//set 5 viriables to store the name input by users
	static String name1 = " ";
	static String name2 = " ";
	static String name3 = " ";
	static String name4 = " ";
	static String name5 = " ";
	
	public static void main(String[] args) {
		//scanner function
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wenxiao Li, 2022Fall, CPS2231 W02");
		
		//generate an i that can be used not only in for loop
		int i;

		for(i = 0; i < 5; i++) {
			//let user enter first name and last name five times
			System.out.print("Enter your first name: ");
			String firstName = input.nextLine();
			System.out.print("Enter your last name: ");
			String lastName = input.nextLine();	
			//set name as the combination of first and last
			String name = firstName + lastName;
			
			//use switch to store the name that are input by the user each time the loop ruuns
			switch(i) {
				case 0:
					name1 = name;
					break;
				case 1:
					name2 = name;
					break;
				case 2:
					name3 = name;
					break;
				case 3:
					name4 = name;
					break;
				case 4:
					name5 = name;
					break;
			}
			//set output
			System.out.println("Full Name" + "\t" + "Kean Email" + "\t" + "Password");
			
			//here, call the number to check if it is duplicated or not
				Boolean YN = checkDuplicate(name, i);
				
				if(YN = true) 
					System.out.println(firstName + " " + lastName + "\t" + generateEmail(name) + "\t" + generatePassword() + "\n");
				
				else
					System.out.println(firstName + " " + lastName + "\t" + generateEmail(firstName, lastName) + "\t" + generatePassword() + "\n");
			
		}
		
	}
	
	//I do not know how to achieve this function without store them into array, so I think that we only need to check namei(each loop it will change)
	// if duplicate then true, call generateEmail(name), else call generateEmail(firstName, lastName)
	public static boolean checkDuplicate(String name, int i) {
		if(name.equals(name2) || name.equals(name3) || name.equals(name4) || name.equals(name5)) {
			return true;
		}
		else
			return false;
	}
	//generate email without number and print as lower case
	public static String generateEmail(String firstName, String lastName) {
		String name = firstName.charAt(0) + lastName;
		String email = name + "@kean.edu";
		return email.toLowerCase();
	}
	//generate email with number and print as lower case
	public static String generateEmail(String name) {
			int max = 9;
			int min = 1;
			Random random = new Random();
			int number = random.nextInt(9)%(max - min + 1) + min;
			String newEmail = name + number + "@kean.edu";
			
			return newEmail.toLowerCase();
	}
	//generate random number as passwd from 100000 to 999999
	public static int generatePassword() {
		int max = 999999;
		int min = 100000;
		Random random = new Random();
		int passwd = random.nextInt(999999)%(max - min + 1) + min;
		return passwd;
	}
		
}
