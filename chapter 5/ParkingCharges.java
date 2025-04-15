import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(double hours) {
        double charge = 2.0;

        if (hours > 3) {
            charge += Math.ceil(hours - 3) * 0.5;
        }

        return Math.min(charge, 10.0); // Ensures the charge does not exceed $10
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of hours parked: ");
        double hours = input.nextDouble();

        double totalCharge = calculateCharges(hours);

        System.out.printf("Total parking charge: $%.2f%n", totalCharge);

        input.close();
    }
}