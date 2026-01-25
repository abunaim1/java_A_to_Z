import java.util.Scanner;

public class scannerProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        // This is to consume the leftover newline character
        scanner.nextLine();
        
        System.out.println("Your age is: " + age);

        System.out.print("Enter your Sturdent status (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello, " + name + "!");
        System.out.println("Student status: " + isStudent);
        scanner.close();


    }
}
