
public class TestClassDriver {

	public static void main(String[] args) {
		
		TestClass s1 = new TestClass(3, 4);
		
		System.out.println(s1.publicTestInt);
		s1.printPrivateTestInt(s1);
		
	}

}
