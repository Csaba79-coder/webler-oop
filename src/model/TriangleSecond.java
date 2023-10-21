package model;

public class TriangleSecond {

    private int a;
    private int b;
    private int c;

    private int perimeter;
    private double area;

    public TriangleSecond() {
        this(0, 0, 0);
    }

    public TriangleSecond(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    private int calculatePerimeter() {
        return getA() + getB() + getC();
    }

    private double calculateArea() {
        double s = getPerimeter() / 2.0;
        area = Math.sqrt(s * (s - getA()) * (s - getB()) * (s - getC()));
        return area;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
