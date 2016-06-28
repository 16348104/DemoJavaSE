package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/28.
 */
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Square extends Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }
}

class Rectangle extends Shape {


    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (!((a + b) >c  && (b + c) > a && (c + a) > b)) {
            System.out.println("error.");
            System.exit(0);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // sqrt = square + root
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}

class ShapeTest {
    public static void main(String[] args) {
        // square
        Square square = new Square(5.6);
        System.out.println("area: " + square.getArea());
        System.out.println("perimeter: " + square.getPerimeter());

        // rectangle
        Rectangle rectangle = new Rectangle(1.2, 3.4);
        System.out.println("area: " + rectangle.getArea());
        System.out.println("perimeter: " + rectangle.getPerimeter());

        // circle
        Circle circle = new Circle(1.2);
        System.out.println("area: " + circle.getArea());
        System.out.println("perimeter: " + circle.getPerimeter());

        // triangle
        Triangle triangle = new Triangle(1.2, 1.2, 1.2);
        System.out.println("area: " + triangle.getArea());
        System.out.println("perimeter: " + triangle.getPerimeter());

        // shape
        Shape shape = new Circle(1);
        System.out.println("area: " + shape.getArea());
        System.out.println("perimeter: " + shape.getPerimeter());
    }
}
