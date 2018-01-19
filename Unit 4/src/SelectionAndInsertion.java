
public class SelectionAndInsertion {

	public static void main(String[] args) {
		
		int[] nums1 = {2,3,7,1,32,-2};
		int[] nums2 = {2,3,7,1,32,-2};
		
		display(nums1);
		display(nums2);
		
		insertionSort(nums1);
		selectionSort(nums2);
		
		display(nums1);
		display(nums2);

	}
	
	public static void display(int[] nums) {
		for (int x : nums) {
			System.out.print(x);
		}
		System.out.println();
	}
	
	public static void insertionSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			int j;
			for (j = i-1; j >= 0 && nums[j] > temp; j--) {
				nums[j+1] = nums[j];
			}		
			nums[j+1] = temp;
		}
	}
	
	public static void selectionSort(int[] nums) {
		//the outer for loop controls the sorted/unsorted side
		//whenever this for loops finishes one iteration, one more item has been sorted
		for (int i = 0; i < nums.length; i++) {
			//this one looks through the unsorted side for the smallest value
			int smallestIndex = i;
			for (int j = i; j < nums.length; j++) {
				if (nums[j] < nums[smallestIndex]) {
					smallestIndex = j;
				}
			}
			//swap with smallest number from the unsorted list 
			//with the first number in the unsorted list 
			int temp = nums[smallestIndex];
			nums[smallestIndex] = nums[i];
			nums[i] = temp;
		}
	}

}
