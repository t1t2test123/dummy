package SGP;

import java.io.InputStreamReader;
import java.util.Scanner;

public class BankAccountTransactions {

	static double currentBalance = 1000;
	public static void main(String[] args) throws MinimumAccountBalance
	{
		BankAccountTransactions bat = new BankAccountTransactions();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		double n = s.nextDouble();
		bat.withdrawAmount(n);
		bat.displayBalance();
		bat.depositAmount(200);
		bat.displayBalance();
		s.close();
		
	}
	
	public void withdrawAmount(double amount) throws MinimumAccountBalance
	{
		
		if(currentBalance<amount)
		{
			
			throw new MinimumAccountBalance("Insufficient Funds!! Your current balance is:"+currentBalance);
		}
		else
		{
			currentBalance = currentBalance - amount;
		}
	}
	
	public void depositAmount(double amount)
	{
		currentBalance = currentBalance + amount;
	}
	
	public void displayBalance()
	{
		System.out.println(currentBalance);
	}

}
