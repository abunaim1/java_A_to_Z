public class methods {
    public static void main(String[] args) {
        calling ();

        
        // overloaded methods = methods that share the same name, 
        //                      but different parameters
        //                      signature = name + parameters
 
        String params = lambdaThings("Hello from lambda");
        System.out.println(params + " " + "Welcome to Java");

        String params2 = lambdaThings("Another param", "Second param");
    }
    static void calling(){
        System.out.println("Method called successfully");
    }

    static String lambdaThings(String params){
        System.out.println(params);
        return params;
    }
    static String lambdaThings(String param1, String param2){
        System.out.println(param1 + " " + param2);
        return param1 + " " + param2;
    }
}
