package parent;

public class Triangle extends Shape {

    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        // Calculate the area after setting a, b, and c
        // calculateArea(); // if void
        super.area = calculateArea();
    }

    private int calculatePerimeter() {
        return getA() + getB() + getC();
    }

    private double calculateArea() {
        double s = calculatePerimeter() / 2.0;
        super.area = Math.sqrt(s * (s - getA()) * (s - getB()) * (s - getC()));
        return super.area;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        //calculateArea(); // Recalculate the area when 'a' is set if void
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
        // calculateArea(); // Recalculate the area when 'b' is set if void
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
        // calculateArea(); // Recalculate the area when 'c' is set if void
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                ", perimeter=" + calculatePerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
