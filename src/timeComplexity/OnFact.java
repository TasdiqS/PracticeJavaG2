package timeComplexity;

public class OnFact {

	static int n = 3;

	public static void main(String[] args) {
		for (int i = 0; i <= n;) {
			System.out.println("===========================");
			funct(--n);
		}
	}

	public static void funct(int n) {
		System.out.println(n);
		if (n == 0) {
			System.out.println(n + " OO");
			return;
		}
	}

}
