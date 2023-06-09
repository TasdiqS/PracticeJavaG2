package leetCode;

public class LeetCode {

	public static void main(String[] args) {
		int[] ans = twoSum2();
		System.out.println(ans[0] +" "+ ans[1]);
	}
	public static int[] twoSum3() {
		int[] nums = { 10, 7, 11, 20, 2 };
		int target = 9;
		
		return null;
	}
	
	public static int[] twoSum2() {
		int[] nums = {-3, 4, 3, 90};
		int target = 0;
		
        for (int i = 0; i < nums.length; i++) {
        	while(nums[i] > target && i<nums.length-1){
        		i++;
        	}
            for (int j = i + 1; j < nums.length; j++) {
            	while(nums[j] > target && j < nums.length-1) {
            		j++;
            	}
                if (nums[j] + nums[i] == target) {
                	int[] arr = {i,j};
                	return arr;
                }
            }
        }
        System.out.println("returning null");
        return null;
    }
	
	public static void twoSum1() {
		int[] nums = { 20, 7, 11, 2 };
		int target = 9;
		
		for(int i = 0; i< nums.length;i++) {

			while(!(nums[i] < target) && (i<nums.length)) {
				i++;
			}
			for(int j = 0; j<= nums.length;j++) {
				if(!(j<nums.length)){
					System.out.println("not found");
					return;
				}
				if(nums[i]+nums[j]==target) {
					System.out.println(i +" "+ j);
					return;
				}
			}
			System.out.println("no values found");
		}
	}

	public static void twoSum() {
		int result[] = new int[2];
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		for (int i = 0; i < nums.length; i++) {
			while (i<nums.length && nums[i] > target) {
				i++;
			}
			for (int j = i + 1; j <= nums.length; j++) {
				while (j< nums.length && nums[j] > target) {
					j++;
				}
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					System.out.println(i + " " + j);
					return;
				}
				System.out.println("no values found");
			}
		}
	}

}
