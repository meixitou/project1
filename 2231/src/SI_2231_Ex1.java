
public class SI_2231_Ex1 {

	//public static void main(String[] args) {
		//for(int i = 92; i < 92 + 20; i++) {
			//System.out.println(i + " " + myRoot(i));		//myRoot
		//}

	//}
	
	public static void main(String[] args) {
		for(int i = 92; i < 92 + 20; i++) {
			double sqrt = Math.sqrt(i);
			System.out.println(i + " " + String.format("%.2f", sqrt));			//Math.sqrt()
		}

	}

	public static String myRoot(int number) {
		double root = number / 2;
		double root_old;
		
		do {
			root_old = root;
			root = (root_old + number / root_old) / 2;
		} while(Math.abs(root_old - root) > 1.0E-6);
		
		return String.format("%.2f", root);
		}
}

//1. Because when you call the same name of the method, it will automatically adjust to the type you 
//entered and it is no need for programmers to write to method, so it is very convenient.

//2. For me I would choose for loop, because it can decide when the loop starts, when it ends, and what to do
// in just one line, it is more easy. Syntax: for(int i = 0; i < 6; ++i){
//                                                 do ??
//                                                }

//3. I already use for loop in main

//4. I called the method named myRoot, because it is the given method that will help me calculate the root of a number

//5. In main