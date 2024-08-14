import java.util.Scanner;

abstract class Shape {
    
    abstract double calculateArea();
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        System.out.println("Area of Circle is : ");
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    double calculateArea() {
        System.out.println("Area of Rectangle is : ");
        return length + width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    double calculateArea() {
        System.out.println("Area of Triangle is : ");
        return 1/2 * base * height;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle : ");
        double r = sc.nextDouble();
        System.out.println("enter the length of the rectangle : ");
        double l = sc.nextDouble();
        System.out.println("enter the width of the rectangle : ");
        double w = sc.nextDouble();
        System.out.println("enter the base of the triangle : ");
        double b = sc.nextDouble();
        System.out.println("enter the height of the triangle : ");
        double h = sc.nextDouble();

        
        Shape[] shapes = new Shape[] {
            new Circle(r),           
            new Rectangle(l,w), 
            new Triangle(b, h)    
        };

        
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}