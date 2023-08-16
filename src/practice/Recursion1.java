package practice;

import java.util.Scanner;

public class Recursion1 {

	public static void main(String[] args) {
		/* given a input n sums all the non negative int upto n */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int sum = 0;
		sum = addUpton(n);
		System.out.println(sum);
	}

	public static int addUpton(int num) {
		if (num == 0) {
			return num;
		}
		return num + addUpton(num - 1);
	}

}
