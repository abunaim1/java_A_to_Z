package JavaOOP;

public class Employee extends Person{
    double salary;
    Employee (String first, String last, double salary){
        super(first, last);
        this.salary = salary;
    }

    void displayEmployee (){
        System.out.println(first + " " + last + " " +this.salary);
    }
}
