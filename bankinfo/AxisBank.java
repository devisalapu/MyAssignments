package bank.bankinfo;

public class AxisBank extends Bankinfo{
	
	public void deposit() {
		System.out.println("Deposit Account in AxisBank");
	}

	public static void main(String[] args) {
		

		AxisBank ab = new AxisBank();
		ab.deposit();
	}

}
