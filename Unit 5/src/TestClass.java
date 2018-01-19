
public class TestClass {
	
	private int privateTestInt = 0;
	public int publicTestInt = 0;
	
	public TestClass(int publicTestInt, int privateTestInt) {
		this.privateTestInt = privateTestInt;
		this.publicTestInt = publicTestInt;
	}
	
	public static void printPrivateTestInt(TestClass testClass) {
		System.out.println(testClass.privateTestInt);
	}

}
