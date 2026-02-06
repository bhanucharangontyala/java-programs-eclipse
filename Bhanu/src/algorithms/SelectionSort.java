package algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int nums[] = {9,8,4,2,7,3,1};
		int size = nums.length;
		int temp = 0;
		//int minIndex = -1;
		int minIndex = 0;
		
		System.out.println("Before Sorting");
		for(int num:nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		
//		step :1
//		1 8 4 2 7 3 9 
//		step :2
//		1 2 4 8 7 3 9 
//		step :3
//		1 2 3 8 7 4 9 
//		step :4
//		1 2 3 4 7 8 9 
//		step :5
//		1 2 3 4 7 8 9 
//		step :6
//		1 2 3 4 7 8 9 
		
//		for(int i = 0;i < size-1; i++) {
//			minIndex = i;
//			for(int j = i+1; j<size;j++) {
//				if(nums[minIndex] > nums[j]) {
//					minIndex = j;
//				}
//			}
//			temp = nums[minIndex];
//			nums[minIndex] = nums[i];
//			nums[i] = temp;
//			System.out.println();
//			System.out.println("step :" +(i+1));
//			for(int num:nums) {
//				System.out.print(num + " ");
//			}
//		}
//		System.out.println();
		
		
//		step :1
//		1 8 4 2 7 3 9 
//		step :2
//		1 2 4 8 7 3 9 
//		step :3
//		1 2 3 8 7 4 9 
//		step :4
//		1 2 3 4 7 8 9 
//		step :5
//		1 2 3 4 7 8 9 
//		step :6
//		1 2 3 4 7 8 9 
		for(int i = 0; i < size-1; i++) { 
		     minIndex = i;
		    for(int j = i + 1; j < size; j++) {
		        if(nums[minIndex] > nums[j]) {
		            minIndex = j;
		        }
		    }
		     
		    temp = nums[minIndex];
		    nums[minIndex] = nums[i];
		    nums[i] = temp;
		    
		    System.out.println();
		    System.out.println("step :" +(i+1));
		    for(int num : nums) {
		        System.out.print(num + " ");
		    }
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int num:nums) {
			System.out.print(num + " ");
		}

	}

}
