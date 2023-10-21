package model;

// Shape osztály öröklődés
// interface vagy abstract osztály
public class Triangle {

    private int a;
    private int b;
    private int c;

    private int perimeter; // calculatePerimeter() meghívása itt nullát eredményez!!! -> ezért kell a konstruktorban kiszámolni
    private double area; // calculateArea() meghívása itt nullát eredményez!!! -> ezért kell a konstruktorban kiszámolni

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = calculatePerimeter(); // ahhoz, hogy garantáljuk, hogy a perimeter (kerület) értéke mindig helyes legyen, a konstruktorban kell kiszámolni
        this.area = calculateArea(); // ahhoz, hogy garantáljuk, hogy az area (terület) értéke mindig helyes legyen, a konstruktorban kell kiszámolni
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
