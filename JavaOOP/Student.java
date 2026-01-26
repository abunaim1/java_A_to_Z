package JavaOOP;

public class Student extends Person{
    double gpa;

    Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void displayStudent(){
        System.out.println(first + " " + last + " " + this.gpa);
    }
}
