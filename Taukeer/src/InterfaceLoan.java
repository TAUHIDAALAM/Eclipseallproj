
public class InterfaceLoan implements Loan{

	@Override
	public void carLoan() {
		System.out.println("25");
		
	}

	@Override
	public void bikeLoan() {
	System.out.println("60");
	}

	@Override
	public void eduLoan() {
	System.out.println("54");
		
	}
	
	public static void main(String[] args) {
		InterfaceLoan il= new InterfaceLoan();
		il.bikeLoan();
		il.carLoan();
		il.eduLoan();
		
	}

	
}
