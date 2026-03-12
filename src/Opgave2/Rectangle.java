package Opgave2;

import javax.xml.namespace.QName;

public class Rectangle extends ShapeDetail implements Shape{

    protected double weight;
    protected double height;

    public Rectangle(String name,double weight, double height) {
        super(name);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getArea() {
        return weight * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (weight + height);
    }
    @Override
    public String getShapeName() {
        return "Rectangle";
    }



}
