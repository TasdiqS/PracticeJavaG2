package practice;

import java.util.Scanner;

public class primeCheck {

	public static void main(String[] args) {
		System.out.println("enter number to check if it is a prime number  or not");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int flag = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("it is nt a prime");
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("it is a prime number");
		}
	}

}
