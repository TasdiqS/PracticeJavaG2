package practice;

public class FizzBuzz {

	public static void main(String[] args) {

		for (Integer i = 1; i <= 100; i++) {

			StringBuilder res = new StringBuilder();

			if (i % 3 == 0) res.append("Fizz");
			
			if (i % 5 == 0) res.append("Buzz");
			
			if (res.isEmpty()) res.append(i.toString());
			
			System.out.println(res);
		}		
	}
}
