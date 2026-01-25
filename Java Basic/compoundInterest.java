import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double principal, rate, amount;

        int timeCompounded, years;
        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.println("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the number of times interest is compounded per year: ");

        timeCompounded = scanner.nextInt();

        System.out.println("Enter the number of years the money is invested for: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+rate / timeCompounded, timeCompounded * years);

        System.out.println("The amount after " + years + " years is: " + amount);
        
        scanner.close();


    }
}
