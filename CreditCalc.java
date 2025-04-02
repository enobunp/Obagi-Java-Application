import java.util.Scanner;
public class CreditCalc{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int accountNumber, balance, charges, credits, creditLimit, newBalance;
		System.out.println("Enter account number:");
		accountNumber = input.nextInt();
		System.out.println("Enter beginning balance, charges, credits, and credit limit:");
		balance = input.nextInt();
		charges = input.nextInt();
		credits = input.nextInt();
		creditLimit = input.nextInt();
		newBalance = balance + charges - credits;
		System.out.println("New balance: " + newBalance);
		if (newBalance > creditLimit){
			System.out.println("Credit limit exceeded");
}
	}
}	