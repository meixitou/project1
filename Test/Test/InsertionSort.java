
public class InsertionSort {

	public static void insertionSort(int[] list){
		for(int i = 1; i < list.length; i++) {
			int currentElement = list[i];
			int k;
			int stepsTaken = 0;
			for(k = i - 1; k >= 0 && list[k] > currentElement; k--) {
				list[k + 1] = list[k];
				stepsTaken = stepsTaken + 1;
				System.out.println("Steps: " + stepsTaken + " comparisons");
			}
			
			list[k + 1] = currentElement;
		}
	}
	public static void main(String args[]) {
		int[] list = {2,3,2,5,6,1};
		insertionSort(list);
		System.out.print("Sorted list: ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
