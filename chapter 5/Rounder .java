public class Rounder {
    public static long roundToInteger(double x) {
        return (long) Math.floor(x + 0.5);
    }

    public static double roundToTenths(double x) {
        return Math.floor(x * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double x) {
        return Math.floor(x * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double x) {
        return Math.floor(x * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        System.out.printf("Original: %.4f%n", num);
        System.out.printf("Rounded to integer: %d%n", roundToInteger(num));
        System.out.printf("Rounded to tenths: %.1f%n", roundToTenths(num));
        System.out.printf("Rounded to hundredths: %.2f%n", roundToHundredths(num));
		   System.out.printf("Rounded to thousandths: %.3f%n", roundToThousandths(num));
    }
}