
public class LabAs3_Task1 {
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Lab Assignment3#
	 *  Task1 
	 * 	Description: Implement given codes.
	 ************************************************************/
	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		for(int i = 0; i < deck.length; i++) {
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		for(int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}

}
