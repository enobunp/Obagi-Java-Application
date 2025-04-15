import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = input.nextDouble();
        long y = (long) Math.floor(x + 0.5);
        System.out.printf("Original: %.2f, Rounded: %d%n", x, y);
    }
}	