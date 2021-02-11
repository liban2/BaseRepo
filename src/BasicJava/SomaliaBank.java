package BasicJava;

public interface SomaliaBank {
	
	int min_bal = 200;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();

}
//only method declaration
//no method body
//in interface we can declare the variables, variables are by default static in nature
//variable values can not be changed
//no static method in interface
//no main method in interface 
//you can not create the object of interface