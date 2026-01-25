import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] fruites = { "A", "Y", "B", "D", "E" };
        int lengthOfFruits = fruites.length;
        do {
        System.out.println("Hello World" + " " + lengthOfFruits);
        lengthOfFruits--;
        } while (lengthOfFruits != 0);

        for(String fruit: fruites){
        System.out.println(fruit);
        }

        int [] numbers = {1,4,3,4,5,6,7,8,9,0};
        Arrays.sort(numbers);
        Arrays.fill(numbers, 1000);
        for(int number: numbers){
        System.out.println(number);
        }

        String[] input = new String[3];
        for (int i=0; i < input.length; i++){
        input [i] = scanner.nextLine();
        }
        for (String str: input){
        System.out.println(str);
        }

        int size;
        size = scanner.nextInt();
        scanner.nextLine();
        String[] inputs = new String[size];
        for (int i = 1; i <= size; i++) {
            inputs[i - 1] = scanner.nextLine();
            // scanner.nextLine();
        }
        for (String str : inputs) {
            System.out.println(str);
        }
        scanner.close();
    }
}
