package JavaOOP;

public class Brand {
    String name;
    String product;

    Brand(String name, String product){
        this.name = name;
        this.product = product;
    }
    void displayProduct (){
        System.out.println("The Brand is " + this.name + "and their product is" + this.product);
    }
}
