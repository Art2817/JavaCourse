package FiguresArea;

public class Main
{
    public static void main(String[] args)
    {
        Figure[] figures = {
                new Circle(3),
                new Triangle(4, 5),
                new Square(2)
        };

        double totalArea = calculateTotalArea(figures);
        System.out.println("Сумарна площа: " + totalArea);
    }

    public static double calculateTotalArea(Figure[] figures)
    {
        double sum = 0;
        for (Figure figure : figures)
        {
            sum += figure.getArea();
        }
        return sum;
    }
}

