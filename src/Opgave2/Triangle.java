package Opgave2;

public class Triangle extends ShapeDetail implements Shape{

    protected double a;
    protected double b;
    protected double c;

    public Triangle(String name,double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double result = (double) (a + b + c) / 2;
        return Math.sqrt(result * (result - a) * (result - b) * (result - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }
}
