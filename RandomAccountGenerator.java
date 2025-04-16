import java.util.Random;
import java.util.Scanner;
public class RandomAccountGenerator{
private static final String NUMBERS = "01234568789";

private static final String ALL_CHARS = NUMBERS;

private static final Random random = new Random();

private static String generateAccountNumber(int length){
	StringBuilder accountNumber = new StringBuilder(length);
	for (int i = 0; i < length; i++){
		int index = random.nextInt(NUMBERS.length());
		accountNumber.append(NUMBERS.charAt(index));
	}
	return accountNumber.toString();
}
public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name = userInput.nextLine();
	
	int length = 10;
	String accountNumber = generateAccountNumber(length);
	System.out.println("Generated Account Number: " + accountNumber);
	System.out.printf("Hello %s, your Account Number is  %s%n" , name,accountNumber);
}

	
}