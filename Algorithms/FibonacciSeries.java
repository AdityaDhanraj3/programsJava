package project2;
/**
 * Note : repetition of number is allowed.
Example:
N = 4
Fibonacci numbers : 1 1 2 3 5 .... so on
here 2 + 2 = 4

so minimum numbers will be 2
 * @author adity
 *
 */

public class FibonacciSeries {

	public static void main(String args[]) {
		int a = 0;
		int b = 1;
		System.out.println(a + " " + b);
		int c;
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.println(" " + c);
			a = b;
			b = c;

		}
	}
}