package sortingAlgorithms;

public class QuickSort {

	public static void main(String[] args) {

		int array[] = { 4, 2, 1, 6, 8, 3, 9, 5, 0,99 };

		quickSortm(array, 0, array.length - 1);

		for (int p : array) {
			System.out.print(" " + p);
		}

	}

	public static void quickSortm(int[] array, int lowIndex, int highIndex) {
		// to run the program till there is an array of only one element unsorted
		if (lowIndex >= highIndex) {
			return;
		}
		int pivot = array[highIndex];

		/* just the pointers which needs to run unlike low and high index whose values
		 are constant till the loop ends*/
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		// to run till both pointers collide
		while (leftPointer < rightPointer) {

			// to run from left to right
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			// to run from right to left
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			//swapping values inside while loop
			swap(array, leftPointer, rightPointer);
		}
		//high index is like pivot
		swap(array, leftPointer, highIndex);

		// for left sub-array
		quickSortm(array, lowIndex, leftPointer - 1);
		// for right sub-array
		quickSortm(array, leftPointer + 1, highIndex);
	}

	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
