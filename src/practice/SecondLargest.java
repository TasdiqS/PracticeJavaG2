package practice;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {10,6,3,8,2,9,11};
		
		int secondLargest = arr[0];
		int largest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(largest < arr[i]) {
				secondLargest = largest;
				largest = arr[i];
			}
		}
		System.out.println("secondLargest = "+secondLargest);
	}

}
