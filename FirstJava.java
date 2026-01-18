
class FirstJava
{
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately: %.2f%n", pi);

        char grade = 'A';
        System.out.printf("Your grade is: %c%n", grade);

        boolean isJavaFun = true;
        if(isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun.");
        }
        boolean isFishTasty = false;
        if(isFishTasty) {
            System.out.println("Fish is tasty!");
        } else {
            System.out.println("Fish is not tasty.");
        }
        String gretting = "Hello, World!";
        System.out.println(gretting + " Have a great day!");

        String email = "aabunnaim@gmail.com";
        if(email.contains("@")) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
        
    }
}