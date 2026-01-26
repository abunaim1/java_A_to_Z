package JavaOOP;

public class ToStringOverride {
    String name;
    int age;

    ToStringOverride(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name + " " + this.age;
    }
}
