public class TwoDArrays {

	public static void main(String[] args) {
		
		//three ways to construct 2D arrays
		
		int[][] arr = new int[5][2];//it creates a 5 by 2 array
		
		int[][] arr1 = new int[5][]; // it works and creates a 5 * ? (not all
		//the arrays in the array have to be the same size)
		//an array of length 3 that stores other arrays
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = new int[i];
		}
		
		int[][] arr2 = {
				{1,2},
				{2,5,2},
				{5,6}
		};
		
		display2DArray(arr2);
		display2DArray(arr1);
		display2DArray(arr);
		
	}

	private static void display2DArray(int[][] temp) {
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
