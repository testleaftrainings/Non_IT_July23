package week3.day1;

public class AxisBank implements RBI,SBI {

	public void submitKYC() {
		System.out.println("submitKYC");

	}

	public void withdraw() {
		System.out.println("withdrawals / deposits above 10L should be reported");

	}

	public void checkBalance() {

		System.out.println("Minimum balance must");

	}

	public void loan() {
		System.out.println("Interest amount is 2%");
	}
	public static void main(String[] args) {
		AxisBank bank =new AxisBank();
		bank.checkBalance();
		bank.loan();
		bank.submitKYC();
		bank.withdraw();
		System.out.println(bank.minAmount);
		//scop restric
		RBI obj =new AxisBank();
		
		
	}

	public void eduLoan() {
		// TODO Auto-generated method stub
		
	}

}
