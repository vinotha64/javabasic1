package basic;

public class SavingsAccount {
 static double annualInterestRate=4;
double Savingsbalance;

public void calculateMonthlyInterest(double savingsbalance)
{
	this.Savingsbalance=savingsbalance;
	Savingsbalance=(Savingsbalance*(annualInterestRate/100)/12);
			System.out.println("Savingsbalance"+Savingsbalance);
}
public static void modifyInterestRate(float newvalue)
{
	 annualInterestRate=newvalue;
	 System.out.println("interest+annualInterestRate");
}
public static void main(String[] args) {
	SavingsAccount Saver1=new SavingsAccount();
	SavingsAccount Saver2=new SavingsAccount();
	Saver1.calculateMonthlyInterest(1000);
	Saver2.calculateMonthlyInterest(2000);
	SavingsAccount.modifyInterestRate(5);
	SavingsAccount.modifyInterestRate(5);
	Saver1.calculateMonthlyInterest(1000);
	Saver2.calculateMonthlyInterest(2000);
}
}
