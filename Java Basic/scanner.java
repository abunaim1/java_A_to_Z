import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Enter is your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.printf("Your GPA is: %.2f%n", gpa);
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student status: " + isStudent);


        // If I am entering invalid input like yes/no for boolean it shows a exception automatically,, for example:
        // Are you a student? (true/false): 
        // no
        // Exception in thread "main" java.util.InputMismatchException
        //         at java.base/java.util.Scanner.throwFor(Scanner.java:977)
        //         at java.base/java.util.Scanner.next(Scanner.java:1632)
        //         at java.base/java.util.Scanner.nextBoolean(Scanner.java:1932)
        //         at scanner.main(scanner.java:13)
        scanner.close();

    }
}
