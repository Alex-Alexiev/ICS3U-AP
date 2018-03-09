
public class MergeSort { //

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int[] sorted = mergeSort(arr, 0, arr.length);
		for (int n : sorted) {
			System.out.println(n);
		}
	}
	
	public static int[] mergeSort(int[] arr, int startIndex, int endIndex) {
		if (endIndex-startIndex <= 1) {
			return new int[] {arr[startIndex]};
		}
		int midIndex = (startIndex+endIndex)/2;	
		int[] a = mergeSort(arr, startIndex, midIndex);
		int[] b = mergeSort(arr, midIndex, endIndex);
		return combine(a, b);
	}

	public static int[] combine(int[] arr1, int[] arr2) {
		int[] comb = new int[arr1.length+arr2.length];
		int k = 0;
		int i = 0;
		int j = 0;          
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				comb[k] = arr1[i];
				i++;
			}
			else {
				comb[k] = arr2[j];
				j++;
			}
			k++;
		}
		if (i >= arr1.length) {
			while (j < arr2.length) {
				comb[k] = arr2[j];
				k++;
				j++;
			}
		}
		else {
			while (i < arr1.length) {
				comb[k] = arr1[i];
				i++;
				k++;
			}
		}
		return comb;
	}
}
