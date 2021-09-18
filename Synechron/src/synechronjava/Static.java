package synechronjava;

public class Static {

	int a;

	String m;

	static int b = 4;

	private static void testforstat() {
		System.out.println("static is working");
	}

	public static void main(String[] args) {

		System.out.println(b);
		testforstat();

	}

}
