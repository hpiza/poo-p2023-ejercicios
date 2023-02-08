package shapes2d;

public class Rectangle {

    private double base = 1;
    private double height = 1;

    public Rectangle() {
        // this(3, 4);
    }

    public Rectangle(double side) {
        this(side, side);
    }

    public Rectangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        if(base <= 0) return;
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if(height <= 0) return;
        this.height = height;
    }

    public double area() {
        return base * height;
    }

    public double perimeter() {
        return 2 * (base + height);
    }

    public void print() {
        System.out.printf("(%.1f x %.1f)\n", base, height);
    }

    @Override
    public String toString() {
        return String.format("[base=%.1f, height=%.1f, area=%.1f, perimeter=%.1f]", this.base, this.height, this.area(), this.perimeter());
    }

    public boolean equals1(Rectangle rect) {
        return this.base == rect.getBase() && this.height == rect.getHeight();
    }

}
