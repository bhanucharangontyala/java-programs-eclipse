package algorithms;

public class Searching {
	
	
	public static int linearSearch(int[] nums, int target) {
		//Time Complexity = O(n)
		int steps = 0;
		for(int i=0; i<nums.length ; i++) {
			steps++;
			if(nums[i] == target) {
				System.out.println("Steps Taken By Linear Search: " + steps);
				return i;
			}
		}
		System.out.println("Steps Taken By Linear Search: " + steps);
		return -1;
	}
	
	
	public static int binarySearch(int[] nums, int target) {
		//Time Complexity = O(logn)
		int steps =0;
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right) {
			steps++;
			int mid = (left + right) / 2;
			
			if(nums[mid] == target) {
				System.out.println("Steps Taken By Binary Search: " + steps);
				return mid;
			}
			else if(nums[mid] < target){
				left = mid +1;
			}
			else {
				right = mid -1;
			}
		}
		System.out.println("Steps Taken By Binary Search: " + steps);
		return -1;
	}
	
//	//using recursion
//	public static int binarySearch(int[] nums, int target,int left, int right) {
//		//Time Complexity = O(logn)
//		
//		if(left <= right) {
//			int mid = (left + right) / 2;
//			if(nums[mid] == target) {
//				return mid;
//			}
//			else if(nums[mid] < target){
//				return binarySearch(nums, target, mid+1, right);
//			}
//			else {
//				return binarySearch(nums, target, left, mid-1);
//			}
//		}
//		return -1;
//	}
	
	

	public static void main(String[] args) {
		int nums[] = new int[100];
		for(int i=0;i<100;i++) {
			nums[i] = i; 
		}
		
		int target = 150;
		int ans1 = linearSearch(nums,target);
		int ans2  = binarySearch(nums,target);
		
		if(ans1 != -1)
			System.out.println("Value Found at Index :" + ans1);
		else
			System.out.println("Value Not Found");
		
		if(ans2 != -1)
			System.out.println("Value Found at Index :" + ans2);
		else
			System.out.println("Value Not Found");
	}

}
