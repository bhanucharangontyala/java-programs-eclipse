package algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {6,2,9,4,1,8,3,7};
		int n = arr.length;
		System.out.println("Before Sorting");
		for(int a: arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		
//		6 2 9 4 1 8
//		step :1
//		2 6 9 4 1 8 
//		step :2
//		2 6 9 4 1 8 
//		step :3
//		2 4 6 9 1 8 
//		step :4
//		1 2 4 6 9 8 
//		step :5
//		1 2 4 6 8 9
		
		/*
		 * Step 1: (i = 1, key = 2)
		 * Compare 2 with 6 → 2 < 6 → shift 6 to the right.
		 * Result: [2, 6, 9, 4, 1, 8]
		 * ✅ Sorted portion: [2, 6]
		 * Step 2: (i = 2, key = 9)
		 * Compare 9 with 6 → 9 > 6 → no shifting.
		 * Result: [2, 6, 9, 4, 1, 8]
		 * ✅ Sorted portion: [2, 6, 9]
		 * Step 3: (i = 3, key = 4)
		 * Compare 4 with 9 → 4 < 9 → shift 9 right 
		 * Compare 4 with 6 → 4 < 6 → shift 6 right
		 * Compare 4 with 2 → 4 > 2 → place 4 after 2.
		 * Result: [2, 4, 6, 9, 1, 8]
		 * ✅ Sorted portion: [2, 4, 6, 9]
		 * Step 4: (i = 4, key = 1)
		 * Compare 1 with 9 → 1 < 9 → shift 9 
		 * Compare 1 with 6 → shift 6 
		 * Compare 1 with 4 → shift 4 
		 * Compare 1 with 2 → shift 2 
		 * Now insert 1 at the beginning.
		 * Result: [1, 2, 4, 6, 9, 8]
		 * ✅ Sorted portion: [1, 2, 4, 6, 9]
		 * Step 5: (i = 5, key = 8)
		 * Compare 8 with 9 → 8 < 9 → shift 9 
		 * Compare 8 with 6 → 8 > 6 → place 8 after 6
		 * Result: [1, 2, 4, 6, 8, 9]
		 * ✅ Sorted portion: [1, 2, 4, 6, 8, 9]
		 * ✅ Final Sorted Array:
		 * [1, 2, 4, 6, 8, 9]
		 */
		
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=key;
			System.out.println();
			System.out.println("step :"+i);
			for(int a: arr) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int a: arr) {
			System.out.print(a + " ");
		}
	}

}
