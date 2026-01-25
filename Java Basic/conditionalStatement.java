import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your ager: ");
        age = scanner.nextInt();
        
        boolean isAdult;

        if(name.length() > 0 && age > 0){
            isAdult = true;
        }
        else if(name.isEmpty()){
            isAdult = false;
        }
        else{
            isAdult = false;
        }

        if(isAdult){
            System.out.println("You are an adult");   
        }
        else{
            System.out.println("You are not an adult");
        }
        scanner.close();
        
    }
}
