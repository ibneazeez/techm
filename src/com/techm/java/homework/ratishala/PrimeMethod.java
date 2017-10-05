public class PrimeMethod {
	public static void main(String[] args) {
		prime();
	}

	private static void prime() {
		for (int i = 1; i <= 100; i++) {
			if (i == 2)
				System.out.println(2);
			if (i % 2 == 0)
				continue;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					break;
				else if (j == (i - 1)) {
					System.out.println(i);
					break;
				}
			}
		}

	}
}
