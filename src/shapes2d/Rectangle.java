package shapes2d;

import com.iteso.model.RGBColor;

public class Rectangle {

    public static final double MIN_BASE = 3;
    public static final double MAX_BASE = 20;
    public static final double MIN_HEIGHT = 4;
    public static final double MAX_HEIGHT = 50;

    public static double sharedNumber = 5.6;

    private double base = MIN_BASE;
    private double height = MIN_HEIGHT;

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
        if(base < MIN_BASE || base > MAX_BASE) return;
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if(height < MIN_HEIGHT || height > MAX_HEIGHT) return;
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

    public boolean equals(Object obj) {
        if(!(obj instanceof Rectangle)) return false;
        Rectangle rect = (Rectangle) obj;
        return this.base == rect.getBase() && this.height == rect.getHeight();
    }

    public Rectangle clone() {
        return new Rectangle(this.base, this.height);
    }

    public static double aspectRatio(double base, double height) {
        if(base >= MIN_BASE && height >= MIN_HEIGHT) return base / height;
        return -1;
    }

    public static double aspectRatio(Rectangle r) {
        return aspectRatio(r.base, r.height);
    }

    public double aspectRatio() {
        return aspectRatio(this.base, this.height);
    }

    public static boolean haveSameAspectRatio(Rectangle r1, Rectangle r2) {
        return aspectRatio(r1) == aspectRatio(r2);
    }

    public boolean haveSameAspectRatio(Rectangle r) {
        return haveSameAspectRatio(this, r);
    }

}
