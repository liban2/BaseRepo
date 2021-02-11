package BasicJava;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(SomaliaBank.min_bal);
		
	
		LibanBank lb = new LibanBank();
		
		lb.debit();
		lb.credit();
		lb.transferMoney();
		lb.carLoan();
		lb.overDraft();
		lb.matualFunds();
		
		
		//dynamic polymorphism
		SomaliaBank sb = new LibanBank();
		
		sb.credit();
		sb.debit();
		sb.transferMoney();
		
		

	}

}
