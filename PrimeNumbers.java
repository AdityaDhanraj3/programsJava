package project2;

public class PrimeNumbers {
	public static void primeNum(int num) {
		int temp = 0;
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("not a prime number");
		} else {
			System.out.println("the number is prime");
		}
	}

	public static void main(String[] args) {
		int num = 7;
		primeNum(num);
	}

}

OUTPUT :
the number is prime
