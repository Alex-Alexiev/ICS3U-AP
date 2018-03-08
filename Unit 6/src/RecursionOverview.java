
public class RecursionOverview {
	
	public static int counter = 0;

	public static void main(String[] args) {
		System.out.println(solveFactorial(3));
		System.out.println(solveFib(26));
		System.out.println(counter);
	}
	
	public static int solveFactorial(int x) {
		if (x == 1) return 1;
		return x*solveFactorial(x-1);
	}
	
	public static int solveFib(int x) {
		counter++;
		if (x == 1 || x == 2) return 1;
		return solveFib(x-1)+solveFib(x-2);
	}

}
