
public class BottomUpApproach {
	static int count;
	public static void main(String args[]) {
		int n = 10;
		System.out.println(fibBottomUp(n));
	}
	public static int fibBottomUp(int num) {
		if(num == 1 || num == 2) {
			return 1;
		}
		else {
			int[] bottomUp = new int[num + 1];
			bottomUp[1] = 1;
			bottomUp[2] = 1;
			for(int i = 3; i < num + 1; i++) {
				bottomUp[i] = bottomUp[i - 1] + bottomUp[i - 2];
				System.out.println(count++);
			}
			return bottomUp[num];
		}
	}
}
