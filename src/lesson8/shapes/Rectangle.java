package lesson8.shapes;

public class Rectangle extends Shapes {
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    private double a, b;

    @Override
    double perimetr() {
        return (a + b) * 2;
    }

    @Override
    double area() {
        return a * b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
