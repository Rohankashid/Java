abstract class shape {
    double area, perimeter;

    public abstract void calculateArea();

    public abstract void calculatePerimeter();

    void display() {
        System.out.println("Area:" + area);
        System.out.println("perimeter:" + perimeter);

    }

}

class Triangle extends shape {
    private double s1, s2, s3;

    Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void calculateArea() {
        double s = (s1 + s2 + s3) / 2;
        area = Math.sqrt(s * (s - s1)*(s - s2)*(s - s3));
    }

    public void calculatePerimeter() {
        perimeter = s1 + s2 + s3;
    }
}

class Rectangle extends shape {
    private float length, width;

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;

    }

    public void calculateArea() {

        area = length * width;
    }

    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }
}

class Circle extends shape {
    private double radius, pi = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = pi * radius * radius;
    }

    public void calculatePerimeter() {
        perimeter = pi * radius * 2;
    }
}

class Cube extends shape {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    public void calculateArea() {

        area = 6 * side * side;
    }

    public void calculatePerimeter() {
        perimeter = 12 * side;
    }
}

class Square extends shape {
    private double size;

    Square(double size) {
        this.size = size;
    }

    public void calculateArea() {
        area = size * size;
    }

    public void calculatePerimeter() {
        perimeter = 4 * size;
    }
}

public class exp3 {

    public static void main(String[] args) {
        Triangle t = new Triangle(2, 3, 4);
        System.out.println("TriangleL:");
        t.calculateArea();
        t.calculatePerimeter();
        t.display();
        System.out.println("");

        Rectangle r = new Rectangle(2, 5);
        System.out.println("Rectangle:");
        r.calculateArea();
        r.calculatePerimeter();
        r.display();
        System.out.println("");

        Circle c = new Circle(5);
        System.out.println("Circle:");
        c.calculateArea();
        c.calculatePerimeter();
        c.display();
        System.out.println("");

        Cube cube1 = new Cube(6);
        System.out.println("Cube:");
        cube1.calculateArea();
        cube1.calculatePerimeter();
        cube1.display();
        System.out.println("");

        Square s = new Square(4);
        System.out.println("Square:");
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

    }

}
