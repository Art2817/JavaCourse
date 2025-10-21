package SortingAndSearching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    // Сортування вставкою (Insertion Sort) з lms
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                // Переміщення елементів, які більше за key, на одну позицію вперед
                arr[j + 1] = arr[j];
                j--;
            }
            // Вставлення key на правильну позицію у відсортованій частині масиву
            arr[j + 1] = key;
        }
    }

    // з lms
    public  static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Повертаємо індекс, якщо знайдено
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Повертаємо -1, якщо не знайдено
    }

    public static void main(String[] args)
    {
        Random random = new Random();
        int[] randomNumbers = new int[15];


        for (int i = 0; i < randomNumbers.length; i++)
        {
            randomNumbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(randomNumbers));

        insertionSort(randomNumbers);

        System.out.println("Відсортований масив: " + Arrays.toString(randomNumbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int searchNumber = scanner.nextInt();

        int index = binarySearch(randomNumbers, searchNumber);

        if (index != -1)
        {
            System.out.println("Індекс числа " + searchNumber + " у відсортованому масиві: " + index);
        }
        else
        {
            System.out.println("Число " + searchNumber + " не знайдено в масиві.");
        }
    }
}
