package FiguresArea;

public class Triangle implements Figure
{
    private double sideA;
    private double height;

    public Triangle(double sideA, double height)
    {
        this.sideA = sideA;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return 0.5 * sideA * height;
    }
}

