
public class ArrayIntro {
	
	public static void main(String[] args) {
		final int NUM_MARKS = 10;
		Integer[] nums = {1,1,1,1,1,1,1,1,1,1};
		
		//nums = new Integer[NUM_MARKS];
		
		
		//arrays are not classes so they do not have methods 
		//array variables store a REFERNCE
		
		addMe(nums, 5);
		display(nums);
	}
	
	private static void display (Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	private static void addMe(Integer[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]+=x;
		}
	}

}
