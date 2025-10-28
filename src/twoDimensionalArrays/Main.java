package twoDimensionalArrays;

import java.security.SecureRandom;
import twoDimensionalArrays.IsMagicSquare;

public class Main
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[4][4];
        SecureRandom random = new SecureRandom();

        // від 1 до 50
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = random.nextInt(1, 51);
            }
        }


        System.out.println("Матриця 4x4:");
        for (int[] row : matrix)
        {
            for (int element : row)
            {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }

        int sumEvenRows = 0;
        int sumOddRows = 0;


        for (int i = 0; i < matrix.length; i++)
        {
            int rowSum = 0;

            for (int j = 0; j < matrix[i].length; j++)
            {
                rowSum += matrix[i][j];
            }
            if (i % 2 == 0)
            {
                sumEvenRows += rowSum;
            }
            else
            {
                sumOddRows += rowSum;
            }
        }

        int prodEvenColumns = 1;
        int prodOddColumns = 1;

        for (int j = 0; j < matrix[0].length; j++)
        {
            int colProd = 1;

            for (int i = 0; i < matrix.length; i++)
            {
                colProd *= matrix[i][j];
            }
            if (j % 2 == 0)
            {
                prodEvenColumns *= colProd;
            }
            else
            {
                prodOddColumns *= colProd;
            }
        }

        System.out.println("\nСума елементів у парних рядках (рядки 0, 2): " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (рядки 1, 3): " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях (стовпці 0, 2): " + prodEvenColumns);
        System.out.println("Добуток елементів у непарних стовпцях (стовпці 1, 3): " + prodOddColumns);

        if ( IsMagicSquare.isMagicSquare (matrix))
        {
            System.out.println("\nМатриця є магічним квадратом.");
        }
        else
        {
            System.out.println("\nМатриця не є магічним квадратом.");
        }
    }
}
