package project1;
/**
 * Count the number of prime numbers less than a non-negative number,n:
 * 
Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * @author adity
 *
 */
public class CountPrimes {
	public static int countPrime(int n) {
		boolean[] primes = new boolean[n];
		for (int i = 2; i * i < primes.length; i++) {
			if (!primes[i]) {
				for (int j = i; j * i < primes.length; j++) {
					primes[i * j] = true;

				}
			}
		}
		int primeCount = 0;
		for (int i = 2; i < primes.length; i++) {
			if (!primes[i]) {
				primeCount++;
			}
		}
		return primeCount;
	}

	public static void main(String[] args) {
		System.out.println(countPrime(10));
	}

}
