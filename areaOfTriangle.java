import java.util.Scanner;
public class areaOfTriangle {
    public static void main(String[] args) {
        double base = 0;
        double height = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();  

        double area = 0.5 * base * height;

        System.out.printf("The area of the triangle is: %.2f%n", area);
        
        scanner.close();
    }
}
