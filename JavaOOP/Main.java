package JavaOOP;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Audi", 2, 22);
        System.out.println(car.isSold);
        car.secondHand();

        System.out.println("*********");

        OverloadConstructor test = new OverloadConstructor();
        System.out.println(test.name);
        System.out.println(test.email);
        System.out.println(test.age);

        System.out.println("*********");

        OverloadConstructor test2 = new OverloadConstructor("Naim", "20 Years", "aabunnaim@gmail.com");
        System.out.println(test2.name);
        System.out.println(test2.age);
        System.out.println(test2.email);

        System.out.println("*********");

        OverloadConstructor test3 = new OverloadConstructor("Razzak", "33Years");
        System.out.println(test3.name);
        System.out.println(test3.age);



        // Static Keyword Class (From Friend class)
        Friend fr1 = new Friend("Mahfuz");
        Friend fr2 = new Friend("Name");

        System.out.println("*********");
        System.out.println(Friend.numOfFriends);



        System.out.println("Inheritence ---> *********");
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);

        System.out.println("Super Keywor Use ---> *********");
        Person p1 = new Person("Mahfuz", "Zenun");
        Student s1 = new Student("Naim", "Abu", 3.22);

        s1.displayStudent();

        Employee e1 = new Employee("Ashik Bhai", "Nayem Bhai", 1000000);
        e1.displayEmployee();


        System.out.println("ToString OVerride uses ---> *********");
        ToStringOverride t1 = new ToStringOverride("naim", 21);
        System.out.println(t1);

    }
}