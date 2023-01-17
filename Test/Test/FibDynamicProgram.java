
public class FibDynamicProgram {
	static long fib;
	static int count;
	public static void main(String args[]) {
		int n = 10;
		System.out.println("Fib Number: " + fib(n));
	}
	public static long fib(int num) {
		if(num <= 1)
			return 1;
		else
			fib = fib(num - 1) + fib(num - 2);
			System.out.println(count++);
			return fib;
	}
}
