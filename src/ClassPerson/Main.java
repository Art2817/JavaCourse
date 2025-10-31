package ClassPerson;

public class Main
{
    public static void main(String[] args)
    {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");
        Person person4 = new Person("Alice", 28, "Архітектор");


        System.out.println("1. Список осіб:");
        person1.printInfo();
        person2.printInfo();
        person3.printInfo();

        System.out.println("\n2. До зміни професії:");
        person4.printInfo();

        person4.setProfession("Дизайнер");

        System.out.println("\n3. Після оновлення професії");
        person4.printInfo();
    }
}
