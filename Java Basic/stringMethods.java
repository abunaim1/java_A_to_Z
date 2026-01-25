public class stringMethods {
    public static void main(String[] args) {
        String name = " Hello, World! ";

        // Length of the string
        int length = name.length();
        System.out.println("Length: " + length);

        char letter = name.charAt(2);
        System.out.println(letter);

        int index = name.indexOf(" ");
        System.out.println(index);

        int lastIndex = name.lastIndexOf(" ");
        System.out.println(lastIndex);

        String upperCaseName = name.toUpperCase();
        System.out.println(upperCaseName);

        String lowerCaseName = name.toLowerCase();
        System.out.println(lowerCaseName);

        System.out.println(name.trim());

        System.out.println(name.replace("!", "????"));

        if(name.contains(" ")){
            System.out.println("Name contains space");
        }
        else{
            System.out.println("Name does not contain space");
        }


        String password = "mypassword123";
        if (password.equalsIgnoreCase("Mypassword123")) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
            
        }
    }    
}
