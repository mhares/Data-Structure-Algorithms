package recursion;

public class FibonacciSeries {

	public static int fibonacci(int n) {
		if(n < 0) {
			System.out.println("Positive numbers only");
			return -1;
		}
		else if(n==2 || n== 1) {
			return n-1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
	    }
  }
}
