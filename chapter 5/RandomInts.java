 Random Integer Assignments
import java.util.Random;

public class RandomInts {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(2) + 1;
        int b = rand.nextInt(100) + 1;
        int c = rand.nextInt(10);
        int d = rand.nextInt(113) + 1000;
        int e = rand.nextInt(3) - 1;
        int f = rand.nextInt(15) - 3;

        System.out.println("1-2: " + a);
        System.out.println("1-100: " + b);
        System.out.println("0-9: " + c);
        System.out.println("1000-1112: " + d);
        System.out.println("-1 to 1: " + e);
        System.out.println("-3 to 11: " + f);
    }
}