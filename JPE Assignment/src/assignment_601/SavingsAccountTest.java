/*
	@Author : thuan
	@Date : May 12, 2021
*/

package assignment_601;

public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(4, 2000);
		SavingsAccount saver2 = new SavingsAccount(4, 3000);
		
		System.out.println("New balances for both savers with 4% interest rate: ");
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.printf("Saver1: %.2f$ \n", saver1.savingsBalance);
		System.out.printf("Saver2: %.2f$ \n", saver2.savingsBalance);
		
		System.out.println("New balances for both savers with 5% interest rate in next month: ");
		saver1.annualInterestRate = 5;
		saver2.annualInterestRate = 5;
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.printf("Saver1: %.2f$ \n", saver1.savingsBalance);
		System.out.printf("Saver2: %.2f$ \n", saver2.savingsBalance);
	}
}
