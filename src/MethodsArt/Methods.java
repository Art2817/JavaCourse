package MethodsArt;

public class Methods
{
    public static void printSquare(int number)
    {
    System.out.println("   Квадрат числа " + number + " дорівнює " + (number * number) + ".");
    }

    public static double cylinderVolume(double radius, double height)
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int arraySum(int[] array)
    {
        int sum = 0;
        for (int value : array)
        {
            sum += value;
        }
        return sum;
    }


    public static String reverseString(String text)
    {
        return new StringBuilder(text).reverse().toString();
    }


    public static int degree(int a, int b)
    {
        return (int) Math.pow(a, b);
    }


    public static void repeatText(String text, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println("   " + text);
        }
    }
}
