/*
	@Author : thuan
	@Date : May 12, 2021
*/

package assignment_601;

public class SavingsAccount {
	public double annualInterestRate;
	public double savingsBalance;
	
	public SavingsAccount(){
		
	}
	
	public SavingsAccount(double intRate, double savBal){
		this.annualInterestRate = intRate;
		this.savingsBalance = savBal;
	}

	public void calculateMonthlyInterest() {
		savingsBalance += (savingsBalance * annualInterestRate / 100) / 12; 
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
}
