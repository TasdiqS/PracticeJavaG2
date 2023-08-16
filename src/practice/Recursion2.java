package practice;

public class Recursion2 {

	public static void main(String[] args) {
		int n = 5;
		int ans = fact(n);
		System.out.println(ans);

	}

	public static int fact(int num) {
		if (num == 1) {
			return 1;
		}
		return num * fact(num - 1);
	}

}
