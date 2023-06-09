package sortingAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {

		int array[] = { 4, 2, 1, 6, 8, 3, 9, 5, 0 };
		insertionsort(array);
	}

	public static void insertionsort(int array[]) {

		for (int i = 1; i <= array.length - 1; i++) {
			int currentValue = array[i];
			int j = i - 1;
			// loop runs only if the predecessor is greater . . . . very imp
			while (j >= 0 && array[j] > currentValue) {
				//swapped 1
				array[j + 1] = array[j];
				j--;
			}
			//swapped 2
			array[j + 1] = currentValue;
	
		}
		for (int k : array) {
			System.out.print(" " + k);
		}
	}

}
