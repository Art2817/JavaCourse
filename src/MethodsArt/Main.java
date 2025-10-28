package MethodsArt;

import java.util.Scanner;
import java.util.Arrays;

import static MethodsArt.Methods.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //1
        System.out.print("1. Введіть ціле число: ");
        int number = sc.nextInt();
        printSquare(number);


        //2
        System.out.print("\n2. Введіть радіус: ");
        double radius = sc.nextDouble();
        System.out.print("   Введіть висоту: ");
        double height = sc.nextDouble();
        double volume = cylinderVolume(radius, height);
        System.out.println("   Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");



        //3
        System.out.print("3. Введіть розмір масиву: ");
        int x = sc.nextInt();
        int[] numbers = new int[x];
        for (int i = 0; i < x; i++)
        {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        int sum = arraySum(numbers);
        System.out.println("\nМасив чисел: " + Arrays.toString(numbers));
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");
        sc.nextLine();


        //4
        System.out.print("\n4. Введіть рядок: ");
        String text = sc.nextLine();
        String reversed = reverseString(text);
        System.out.println("   Рядок в зворотньому порядку: " + reversed);


        //5
        System.out.print("\n5. Введіть a: ");
        int a = sc.nextInt();
        System.out.print("   Введіть b: ");
        int b = sc.nextInt();
        int degreeResult = degree(a, b);
        System.out.println("   Результат " + a + "^" + b + " дорівнює " + degreeResult + ".");
        sc.nextLine();

        //6
        System.out.print("\n6. Введіть ціле число n: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("   Введіть текстовий рядок: ");
        String repeatText = sc.nextLine();
        repeatText(repeatText, n);

        sc.close();
    }
}