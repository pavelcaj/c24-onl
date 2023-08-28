package lesson8.shapes;

public class Triangle extends Shapes {
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double a, b, c;

    @Override
    double perimetr() {

        return a + b + c;
    }

    @Override
    double area() {
        return Math.sqrt((perimetr() / 2) * (perimetr() / 2 - a) * (perimetr() / 2 - b) * (perimetr() / 2 - c));
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

