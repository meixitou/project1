import java.util.Random;

public class AS2_Q1 {
	/*************************************************************
	 * 	Kean University
	 * 	Semester Fall 22
	 * 	Course:CPS*2231 - Computer Programming
	 * 	Author: Wenxiao Li CPS2231 W02
	 * 	Assignment2 Question1#
	 * 	Description: Generate random array and calculate the time of finding max number.
	 ************************************************************/
	public static void main(String[] args) {
		long begin, end, time;
		
		int[] list1 = new int[10];
		int[] list2 = new int[100];
		int[] list3 = new int[10000];
		int[] list4 = new int[10000000];
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
				//generate value and put them into array
				for(int i = 0; i < 10; i++) {
					int max1 = 10;
					int min1 = -10;
					Random random = new Random();
					int number1 = random.nextInt(21)%(max1 - min1 + 1) + min1;
					list1[i] =  number1;
				}
		
				//find the largest
				begin = System.nanoTime();
				int max1 = list1[0];
				for(int i = 0; i < 10; i++) {
					if(list1[i] > max1) 
						max1 = list1[i];
				}
				end = System.nanoTime();
				time = end - begin;
		
				System.out.println("It took " + time + " nanoseconds to find a maximum in the array of 10 elements, and the maximum is: " + max1);
		//////////////////////////////////////////////////////////////////////////////////////////////
				//generate value and put them into array
				for(int i = 0; i < 100; i++) {
					int max2 = 100;
					int min2 = -100;
					Random random = new Random();
					int number2 = random.nextInt(201)%(max2 - min2 + 1) + min2;
					list2[i] =  number2;
				}
				
				//find the largest
				begin = System.nanoTime();
				int max2 = list2[0];
				for(int i = 0; i < 100; i++) {
					if(list2[i] > max2) 
						max2 = list2[i];
				}
				end = System.nanoTime();
				time = end - begin;
				
				System.out.println("It took " + time + " nanoseconds to find a maximum in the array of 100 elements, and the maximum is: " + max2);
		///////////////////////////////////////////////////////////////////////////////////////////////
				//generate value and put them into array
				for(int i = 0; i < 10000; i++) {
					int max3 = 10000;
					int min3 = -10000;
					Random random = new Random();
					int number3 = random.nextInt(20001)%(max3 - min3 + 1) + min3;
					list3[i] =  number3;
				}
				
				//find the largest
				begin = System.nanoTime();
				int max3 = list3[0];
				for(int i = 0; i < 10000; i++) {
					if(list3[i] > max3) 
						max3 = list3[i];
				}
				end = System.nanoTime();
				time = end - begin;
				
				System.out.println("It took " + time + " nanoseconds to find a maximum in the array of 10000 elements, and the maximum is: " + max3);
		/////////////////////////////////////////////////////////////////////////////////////////////////
				//generate value and put them into array
				for(int i = 0; i < 10000000; i++) {
					int max4 = 10000000;
					int min4 = -10000000;
					Random random = new Random();
					int number4 = random.nextInt(20000001)%(max4 - min4 + 1) + min4;
					list4[i] =  number4;
				}
				
				//find the largest
				begin = System.nanoTime();
				int max4 = list4[0];
				for(int i = 0; i < 10000000; i++) {
					if(list4[i] > max4) 
						max4 = list4[i];
				}
				end = System.nanoTime();
				time = end - begin;
				
				System.out.println("It took " + time + " nanoseconds to find a maximum in the array of 10000000 elements, and the maximum is: " + max4);
	}

}
