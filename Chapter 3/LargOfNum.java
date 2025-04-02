import java.util.Scanner;
public class LargOfNum{
	public static void main(String[] args){ 
    Scanner input = new Scanner(System.in);
    int number, largest = Integer.MIN_VALUE;
 
    for (int i = 1; i <= 10; i++) {
    number = input.nextInt();
    if (number > largest) {
       largest = number;
   }
}
    System.out.println("Largest number: " + largest);	
	}
}	