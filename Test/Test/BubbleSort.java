
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		int stepsTaken = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					stepsTaken = stepsTaken + 1;
					System.out.println("Steps: " + stepsTaken);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {3,2,5,6,-2,3,14,12};
		bubbleSort(arr);
		System.out.println("Sorted bubble list");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
