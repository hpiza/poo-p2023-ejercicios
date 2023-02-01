package shapes2d;

public class Rectangle {

    public double base;
    public double height;

    public double area() {
        return base * height;
    }

    public double perimeter() {
        return 2 * (base + height);
    }

    public void print() {
        System.out.printf("(%.1f x %.1f)\n", base, height);
    }


}
