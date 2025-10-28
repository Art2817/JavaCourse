package twoDimensionalArrays;

public class IsMagicSquare
{
    public static boolean isMagicSquare(int[][] matrix)
    {
    int n = matrix.length;
    int magicSum = 0;

    for (int j = 0; j < n; j++)
    {
        magicSum += matrix[0][j];
    }

    for (int i = 1; i < n; i++)
    {
        int rowSum = 0;
        for (int j = 0; j < n; j++)
        {
            rowSum += matrix[i][j];
        }
        if (rowSum != magicSum)
            return false;
    }


    for (int j = 0; j < n; j++)
    {
        int colSum = 0;
        for (int i = 0; i < n; i++)
        {
            colSum += matrix[i][j];
        }
        if (colSum != magicSum)
            return false;
    }


    int diag1 = 0;
    for (int i = 0; i < n; i++)
    {
        diag1 += matrix[i][i];
    }
    if (diag1 != magicSum)
        return false;

    int diag2 = 0;
    for (int i = 0; i < n; i++)
    {
        diag2 += matrix[i][n - 1 - i];
    }
    return diag2 == magicSum;
}
}