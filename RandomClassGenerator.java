import java.util.Random;

public class RandomClassGenerator{
	public static void main(String[] args){
		Random random = new Random();
		
		boolean option = random.nextBoolean();
		System.out.printf("Do you love java %b%n", option);
		
		int integerWIthNoBound = random.nextInt();
		System.out.printf("The random integer is %d%n",integerWIthNoBound);
		
		
		int integerWIthBound = random.nextInt(2000) + 1;
		System.out.printf("The random num is %d%n",integerWIthBound);
		
		long integerLong= random.nextLong(20000000);
		System.out.printf("The random num is %d%n",integerLong);
		
		float integerFloat= random.nextFloat();
		System.out.printf("The random float %f%n",integerFloat);
		
		double integerDouble= random.nextDouble();
		System.out.printf("The random double %.1f%n",integerDouble);
	}
}	