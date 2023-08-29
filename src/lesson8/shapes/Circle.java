package lesson8.shapes;

public class Circle extends Shapes {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getP() {
        return p;
    }

    private final double p = 3.14;

    @Override
    public double perimetr() {

        return 2 * p * r;
    }

    @Override
    public double area() {

        return p * r * r;
    }

    public Circle(double r) {
        this.r = r;
    }
}

