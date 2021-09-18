package constructor.syn;

public class Car {

	public Car() {

		System.out.println("Car constructor");

	}

	public Car(String Model) {
		this();

		System.out.println("Car model" + Model);
	}

	public Car(int price) {

		System.out.println("Car price is:" + price);
	}

	public static void main(String[] args) {

		new Car(2000);

	}
	
	
	

}
