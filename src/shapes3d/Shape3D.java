package shapes3d;

public abstract class Shape3D {

    protected double x = 0, y = 0, z = 0;

    public Shape3D(double x, double y, double z) {
        move(x, y, z);
    }

    public final void move(double dx, double dy, double dz) {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("Coordenadas: <%.1f, %.1f, %.1f>\nArea = %.2f\nVolumen = %.2f", x, y, z, area(), volume());
    }

    public abstract double area();

    public abstract double volume();

}
