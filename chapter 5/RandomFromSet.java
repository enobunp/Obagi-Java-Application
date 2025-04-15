import java.util.Random;

public class RandomFromSet {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] setA = {2, 4, 6, 8, 10};
        int[] setB = {3, 5, 7, 9, 11};
        int[] setC = {6, 10, 14, 18, 22};

        System.out.println("Set A: " + setA[rand.nextInt(setA.length)]);
        System.out.println("Set B: " + setB[rand.nextInt(setB.length)]);
        System.out.println("Set C: " + setC[rand.nextInt(setC.length)]);
    }
}