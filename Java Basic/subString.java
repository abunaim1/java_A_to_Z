import java.util.Scanner;
public class subString {
    public static void main(String[] args) {
        // .subString() = A method that extracts a part of a string 
        //              .substring(beginning index, ending index)

        // String name = "ABU NAIM";
        // String username = name.substring(4, name.length());
        // System.err.println(username);

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        if(email.contains("@")){
            String username = email.substring(0, 9);
            String domain = email.substring(9);
            if(username.length() > 0 && domain.length() > 0){
                System.out.println(username + " " + domain);
            }
        }
        else{
            System.out.println("Email is not valid");
        }
        
        scanner.close();
    }
}
