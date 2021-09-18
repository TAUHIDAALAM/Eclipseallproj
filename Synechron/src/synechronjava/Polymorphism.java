package synechronjava;

public class Polymorphism {


	private static void open() {

		System.out.println("opening without password");

	}

	public static void open(String pwd) {

		System.out.println("open with String pwd");
	}

	public static void open(int pwd, String name) {

		System.out.println("open with int pwd");

	}
	
	public static void main(String[] args) {
		
		open();
		open("Shake");
		open(123456, "Shake");
		
	}

}
