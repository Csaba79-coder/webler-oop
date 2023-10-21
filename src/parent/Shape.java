package parent;

public class Shape {

    private int perimeter;
    protected double area;

    public Shape() {
    }

    public Shape(int perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public int getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
