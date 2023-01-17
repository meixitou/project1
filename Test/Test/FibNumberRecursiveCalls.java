
public class FibNumberRecursiveCalls {
		static int count;
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("Fib(" + n + ") = " + fib(n));
		
	}
	public static int fib(int n) {
		if(n <= 1)
			return 1;
		int last = 1;
		int nextToLast = 1;
		int answer = 1;
		
		for(int i = 2; i <= n; i++) {
			answer = last + nextToLast;
			nextToLast = last;
			last = answer;
			System.out.println(count++);
			
		}
		return answer;
	}
	
}
