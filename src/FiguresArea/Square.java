package FiguresArea;

public class Square implements Figure
{
    private double side;

    public Square(double side)
    {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return side * side;
    }
}
