
public class ImprovedBubbleSort {

	public static void main(String[] args) {
		int[] arr = {3,2,5,6,-2};
		improvedBubbleSort(arr);
	}
	public static void improvedBubbleSort(int[] list) {
		boolean needNextPass = true;
		int temp = 0;
		for(int k = 1; k < list.length && needNextPass; k++) {
			needNextPass = false;
			
			for(int i = 0; i < list.length - k; i++) {
				if(list[i] > list[i + 1]) {
					temp = list[i + 1];
					list[i + 1] = list[i];
					list[i] = temp;
					needNextPass = true;
				}
			}
		}
		System.out.print("Sorted list: ");
		for(int element : list)
			System.out.print(element + ", ");
		System.out.println();
	}
}
