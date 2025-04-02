import java.util.Scanner;
public class SalCalc{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int hoursWorked;
        double hourlyRate, grossPay;
 
        System.out.println("Enter hours worked and hourly rate:");
        hoursWorked = input.nextInt();
        hourlyRate = input.nextDouble();
 
        grossPay = (hoursWorked <= 40) ? (hoursWorked* hourlyRate) :
		(40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5);
		System.out.println("Gross pay: $" + grossPay);
	}
}	