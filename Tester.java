// 3.	You are required to design a system for managing different types of shapes. The system should be able to calculate the area and perimeter of various shapes such as circles, rectangles, and triangles. Each shape has different methods to calculate its area and perimeter. (Use abstract methods-calculateArea(), calculatePerimeter(), displayDetails()). Your task is to implement a Java program using polymorphism to represent these different types of shapes and calculate their area and perimeter. Additionally, the program should provide functionality to display the details of each shape.

abstract class Shape {
    protected double area;
    protected double perimeter;

    abstract void calculateArea();
    abstract void calculatePerimeter();
    abstract void displayDetails();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    void displayDetails(){
        System.out.println("Shape : Circle");
        System.out.println("Radius : " + radius);
        System.out.println("Perimeter : " + perimeter);
        System.out.println("Area : " + area);
    }
}

class Triangle extends Shape {
    private double height;
    private double base;
    private double side1;
    private double side2;
    private double side3;

    Triangle(double height, double base, double side1, double side2, double side3) {
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    void calculateArea() {
        area = 0.5 * height * base;
    }

    @Override
    void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }

    @Override
    void displayDetails(){
        System.out.println("Shape : Triangle");
        System.out.println("Height, Base : " + height +","+ base);
        System.out.println("Side1, Side2, Side3 : " + side1 +","+ side2 +","+ side3);
        System.out.println("Perimeter : " + perimeter);
        System.out.println("Area : " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        area = length * breadth;
    }

    @Override
    void calculatePerimeter() {
        perimeter = 2 * (length + breadth);
    }

    @Override
    void displayDetails(){
        System.out.println("Shape : Rectangle");
        System.out.println("Length, Breadth : " + length +","+ breadth);
        System.out.println("Perimeter : " + perimeter);
        System.out.println("Area : " + area);
    }
}

public class Tester {
    public static void main(String[] args) {
        
        Shape circle = new Circle(5.0);
        Shape triangle = new Triangle(3, 4, 5, 6, 7);
        Shape rectangle = new Rectangle(3,4);

        circle.calculateArea();
        circle.calculatePerimeter();
        circle.displayDetails();
        System.out.println();

        triangle.calculateArea();
        triangle.calculatePerimeter();
        triangle.displayDetails();
        System.out.println();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.displayDetails();
    }
}
