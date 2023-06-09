package sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {

		int array[] = { 4, 2, 1, 6, 8, 3, 9, 5, 0 };
		int counter = 1;
		boolean swappedSomething = false;

		bubble(swappedSomething, counter, array);

		System.out.println("=====================");

	}

	public static void bubble(boolean swappedSomething, int counter, int array[]) {
		do {
			swappedSomething = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swappedSomething = true;
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					System.out.println(counter++);
				}
			}
		} while (swappedSomething);
		
		for (int j : array) {
			System.out.print(j);
		}
	}

}
