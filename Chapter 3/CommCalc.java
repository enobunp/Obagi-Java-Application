import java.util.Scanner;
public class CommCalc{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sales, earnings;
		System.out.println("Enter sales amount:")
		sales = input.nextDouble();
 
        earnings = 200 + 0.09 * sales;
        System.out.println("Total earnings: $" + earnings);
	}
}	
