package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {

		int k;

		for (int i = 2; i < 100; i++) {
			k = 0;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}
			}
			if (k == 0) {
				System.out.println(i);

			}
		}

	}
}
