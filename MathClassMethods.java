import java.util.Scanner;
public class MathClassMethods{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		System.out.printf("The absolute value is %d%n",Math.abs(num));
		
		System.out.print("Enter a float point number: ");
		double num1 = input.nextDouble();
		System.out.printf("The rounded value is %d%n",Math.round(num1));
		
		System.out.printf("The rounded value is %f%n",Math.pow(num1,2));
		
		System.out.printf("The rounded value is %f%n",Math.sqrt(num1));
		
		System.out.println("========================================================");
		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the Second number: ");
		int number2 = input.nextInt();
		
			System.out.printf("The minimum value is %d%n",Math.min(number1,number2));
			
			System.out.print("Enter the third number: ");
		int number3 = input.nextInt();
		
		System.out.print("Enter the fourth number: ");
		int number4 = input.nextInt();
		
		System.out.printf("The maximum value is %d%n",Math.max(number3,number4));
		
		System.out.printf("The random value is %f%n",Math.random());
		
		System.out.println("========================================================");
		System.out.println("To calculate the radius of the circle");
		int radius = input.nextInt();
		
		double areaOfCircle = Math.PI * Math.pow(radius,2);
		
		System.out.printf("The area of the circle is %f%n", areaOfCircle);
		
	}
}	