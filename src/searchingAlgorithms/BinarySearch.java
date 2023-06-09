package searchingAlgorithms;

public class BinarySearch {

	static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	static int srch = 3;
	static int li = 0;
	static int hi = arr.length - 1;
	static int mi = (li + hi) / 2;

	// itrative approach
	public static void main(String[] args) {
//
//		while (li <= hi) {
//			System.out.println("started...");
//			if (arr[mi] == srch) {
//				System.out.printf("%d found at position %d", arr[mi], mi);
//				break;
//			} else if (arr[mi] < srch) {
//				li = mi + 1;
//			} else {
//				hi = mi - 1;
//			}
//			mi = (li + hi) / 2;
//		}
//		if (li >= hi) {
//			System.out.printf("Element %d not found", srch);
//		}
		System.out.println(binarySearch(arr, li, hi,srch));
	}

	public static int binarySearch(int[] arr2, int li, int hi, int srch) {
		if (hi >= li && li <= arr.length - 1) {

			int mid = li + (hi - li) / 2;
			// If the element is present
			// at the middle itself
			if (arr[mid] == srch)
				return mid;

			// If element is smaller than mid, then it can
			// only be present in left subarray
			if (arr[mid] > srch)
				return binarySearch(arr, li, mid - 1, srch);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, hi, srch);
		}
		return -1;
	}

}
