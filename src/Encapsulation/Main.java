package Encapsulation;

public class Main {
    public static void main(String[] args)
    {
        Employee emp = new Employee(
                "Artem Cherednychenko",
                "Student",
                "artem@gmail.com",
                "+3802222222",
                19
        );

        emp.printInfo();

        Car car = new Car();
        car.start();
    }
}
