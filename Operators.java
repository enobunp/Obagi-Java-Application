public class Operators{
	public static void main(String[] args){
		//Assignment Operators (=)
		
		int num1 = 13;
		int num2 = 5;
		
		//Arithmetic Operators (+,*,-,/,%)
		int sum = num1 + num2;
		int product = num1 * num2;
		int difference = num1 - num2;
	    double quotient = (double)num1 / num2;
		int remainder = num1 % num2;
		
		System.out.printf("The sum of the numbers is %d%n",sum);
		System.out.printf("The product of the numbers is %d%n", product);
		System.out.printf("The difference between %d and %d is %d%n", num1,num2,difference);
		System.out.printf("The quotient is %f%n",quotient);
		System.out.printf("The remainder is %d%n",remainder);
		System.out.println("============================================");
		
		//Relational Operators(>,<,>=,<=,==,!=)
		boolean isLessThan = num1 < num2;
		System.out.printf("Is %d < %d ? %b%n",num1,num2,isLessThan);
		boolean isGreaterThan = num1 > num2;
		System.out.printf("Is %d > %d ? %b%n",num1,num2,isGreaterThan);
		boolean isGreaterThanOrEqualTo = num1 >= num2;
		System.out.printf("Is %d >= %d ? %b%n",num1,num2,isGreaterThanOrEqualTo);
		boolean isLessThanOrEqualTo = num1 <= num2;
		System.out.printf("Is %d <= %d ? %b%n",num1,num2,isLessThanOrEqualTo);
		boolean isEqualTo = num1 == num2;
		System.out.printf("Is %d == %d ? %b%n",num1,num2,isEqualTo);
		boolean isNotEqualTo = num1 != num2;
		System.out.printf("Is %d != %d ? %b%n",num1,num2,isNotEqualTo);
		
		//Logical Operators(&&,||,!)
		boolean isAndOperator = num1 > num2 && num1 >= num2;
		System.out.printf("Is %d > %d && %d >= %d ? %b%n",num1,num2,num1,num2,isAndOperator);
		boolean isOrOperator = num1 == num2 || num1 > num2;
		System.out.printf("Is %d == %d || %d >= %d ? %b%n",num1,num2,num1,num2,isOrOperator);
		boolean isNotOperator = !(num1 == num2 || num1 > num2);
		System.out.printf("Is !(%d == %d || %d >= %d )? %b%n",num1,num2,num1,num2,isNotOperator);
	}
}	
