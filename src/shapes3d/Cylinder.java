package shapes3d;

public class Cylinder extends Shape3D {

    public static final double MIN_RADIUS = 0.1;
    public static final double MIN_HEIGHT = 0.2;

    private double radius, height;

    public Cylinder(double x, double y, double z, double radius, double height) {
        super(x, y, z);
        this.radius = Math.max(radius,  MIN_RADIUS);
        this.height = Math.max(height,  MIN_HEIGHT);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void resize(double dr, double dh) {
        this.radius = Math.max(this.radius + dr,  MIN_RADIUS);
        this.height = Math.max(this.height + dh,  MIN_HEIGHT);
    }

    @Override
    public String toString() {
        return String.format("CILINDRO\nRadio de la base: %.1f\nAltura: %.1f\n%s", this.radius, this.height, super.toString());
    }

    @Override
    public double area() {
        return 2 * Math.PI * this.radius * this.radius + 2 * this.height * Math.PI * this.radius;
    }

    @Override
    public double volume() {
        return this.height * Math.PI * this.radius * this.radius;
    }
}
