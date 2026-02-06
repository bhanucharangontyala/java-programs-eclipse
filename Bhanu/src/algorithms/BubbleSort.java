package algorithms;

public class BubbleSort {
	// Time Complexity = O(n^2)
	public static void main(String[] args) {
		int nums[] = { 9, 8, 4, 2, 7, 3, 1 };
		int size = nums.length;
		int temp = 0;

		System.out.println("Before Sorting");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
//		9 8 4 2 7 3 1 
//		step :1
//		8 4 2 7 3 1 9 
//		step :2
//		4 2 7 3 1 8 9 
//		step :3
//		2 4 3 1 7 8 9 
//		step :4
//		2 3 1 4 7 8 9 
//		step :5
//		2 1 3 4 7 8 9 
//		step :6
//		1 2 3 4 7 8 9 
//		step :7
//		1 2 3 4 7 8 9
		
   /*
    * Algorithm:
    * 
	* 1. first we started from strating index and check with every other
	*    element in array 
	* 2. if we find any element is bigger than its next element we swap 
	*    them and continue the process until all the elements are sorted
	* 3. in every iteration we will not search last value because its 
	*    already sorted, the bigger elements will go to at the end of 
	*    the array.
	*/
		
	for (int i = 0; i < size; i++) {

		for (int j = 0; j < size - i - 1; j++) {

			if (nums[j] > nums[j + 1]) {
				temp = nums[j];
				nums[j] = nums[j + 1];
				nums[j + 1] = temp;
			}
		}

		System.out.println("step :" + (i + 1));
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("After Sorting");
	for (int num : nums) {
		System.out.print(num + " ");
	}

	}

}
