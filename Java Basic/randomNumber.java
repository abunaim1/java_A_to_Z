import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        
        int number = random.nextInt();
        double doubleNumber = random.nextDouble();
        int boundary = random.nextInt(1, 10);
        boolean coinFlip = random.nextBoolean();

        System.out.println(number);
        System.out.println(doubleNumber);
        System.out.println(boundary);
        System.out.println(coinFlip);

    }
}
