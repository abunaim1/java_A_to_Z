import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double totalCost = 0.0;

        System.out.println("What item would you like to purchase?: ");
        item = scanner.nextLine();

        System.out.println("What is the price of the item?: ");
        price = scanner.nextDouble();

        System.out.println(("How many would like?: "));
        quantity = scanner.nextInt();

        totalCost = price * quantity;
        
        System.out.println(totalCost + " " + currency);
        
        scanner.close();


    }
}
