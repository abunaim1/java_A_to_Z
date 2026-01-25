import java.util.Scanner;


public class madLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.println("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        adjective2 = scanner.nextLine();

        System.out.println("Enter a verb : ");
        verb1 = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to the " + adjective1 + " zoo.");
        System.out.println("In an exibution, I saw a(n)" + noun1 + ".");
        System.out.println(noun1+ " was " + adjective2 + " and it liked to " + verb1 + " all day.");
        System.out.println("It was a " + adjective3 + " day at the zoo!");

        scanner.close();

    }
}
