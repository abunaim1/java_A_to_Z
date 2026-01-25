package JavaOOP;
public class OverloadConstructor{
    String name;
    String age;
    String email;

    OverloadConstructor(){
        this.name = "Guest";
        this.age = "Confidential";
        this.email = "Not mentioned";
        
    }
    OverloadConstructor(String name, String age, String email){
        this.name = name;
        this.age = age;
        this.email = email;

    }
    OverloadConstructor(String name, String age){
        this.name = name;
        this.age = age;
    }
}