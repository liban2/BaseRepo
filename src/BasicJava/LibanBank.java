package BasicJava;

public class LibanBank implements SomaliaBank,  SomalilandBank {
	
	public void credit() {
		System.out.println("liban--credit");
	}
	
	public void debit() {
		System.out.println("liban --debit");
	}
	
	public void transferMoney() {
		System.out.println("liban--transfer");
	}
	
	public void carLoan() {
		System.out.println("liban--carloan");
	}
	
	public void overDraft() {
		System.out.println("liban--overdraft");
	}
	
	public void matualFunds() {
		System.out.println("liban--matualFunds");
	}

}
