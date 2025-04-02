import java.util.Scanner;
public class LargOfTwoNum{
	public static void main(String[] args){ 
	Scanner input = new Scanner(System.in);
    int num, largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
 
    for (int i = 1; i <= 10; i++) {
    num = input.nextInt();
    if (num > largest) {
	secondLargest = largest;
	largest = num;
	} 
	else if (num > secondLargest) {
       secondLargest = num;
   }
}
 
    System.out.println("Largest: " + largest);
    System.out.println("Second largest: " + secondLargest);
	}
}	