
public class WhileLoopIntro {

	public static void main(String[] args) {
		
		System.out.println(inclusiveSum(1,1000));

	}
	
	public static int inclusiveSum(int min,int max) {
		int sum = 0, pointer = min;
		while(pointer <= max) {
			sum+= pointer;
			pointer++;
		}
		return sum;
	}

}
