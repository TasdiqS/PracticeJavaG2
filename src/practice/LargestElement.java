package practice;

public class LargestElement {

	public static void main(String[] args) {
		int array[] = { 4, 2, 1, 6, 8, 3, 9, 5, 0 };

		int max;
		max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);

	}

}
