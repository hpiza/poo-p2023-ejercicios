package shapes3d;

public class Sphere extends Shape3D {

    public static final double MIN_RADIUS = 0.1;
    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        this.radius = Math.max(radius,  MIN_RADIUS);
    }

    //public void move(double dx, double dy, double dz) {
    //}

    public double getRadius() {
        return radius;
    }

    public void resize(double dr) {
        this.radius = Math.max(this.radius + dr,  MIN_RADIUS);
    }

    @Override
    public String toString() {
        return String.format("ESFERA\nRadio: %.1f\n%s", this.radius, super.toString());
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return 4.0 / 3 * Math.PI * Math.pow(radius, 3);
    }

}
