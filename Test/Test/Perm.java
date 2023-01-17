import java.util.Arrays;

public class Perm {
	public static void main(String[] args) {
		int[] List1 = {31, 2, 3};
		sort(List1);
		System.out.println(Arrays.toString(List1));
		
		String[] List2 = {"Wenxiao", "Ruiting", "Qilong"};
		sort(List2);
		System.out.println(Arrays.toString(List2));
	}
	
	public static void sort(String[] myList) {
		for(int i = 0; i < myList.length-1; i++){  
			for (int j = i + 1; j < myList.length; j++){  
				if(myList[i].compareTo(myList[j]) > 0){  
					String temp = myList[i];  
					myList[i] = myList[j];  
					myList[j] = temp;  
				}  
			}  
		} 
	}
	public static void sort(int[] myList) {
		for(int i = 0; i < myList.length-1; i++){  
			for (int j = i + 1; j < myList.length; j++){  
				if(myList[i] > myList[j]){  
					int temp = myList[i];  
					myList[i] = myList[j];  
					myList[j] = temp;  
				}  
			}  
		} 
	}
}
