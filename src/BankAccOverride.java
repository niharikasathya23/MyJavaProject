
class BankAcc {
	public void checkBalance() {
		System.out.println("Your balance is: 10000");
	}

	public void viewDetails() {
		System.out.println("Name: Niharika");
		System.out.println("Address: 123 Main Street");
		
	}

}


class ChildAccount extends BankAcc {
	public void setSavingsAmount() {
		System.out.println("Savings amount set to 2000.");
	}

	@Override
	public void viewDetails() {
		System.out.println("Name: Niha");
		System.out.println("Address: 345 Main Street");
	}
}

public class BankAccOverride {
	public static void main(String[] args) {
		ChildAccount niha = new ChildAccount();

		niha.checkBalance();
		niha.viewDetails();
		niha.setSavingsAmount();
	}
}

