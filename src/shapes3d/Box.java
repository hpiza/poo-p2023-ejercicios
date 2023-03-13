package shapes3d;

public class Box extends Shape3D {

    private double width, height, depth;

    public Box(double x, double y, double z, double width, double height, double depth) {
        super(x, y, z);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public double area() {
        return 2 * width * height + 2 * width * depth + 2 * height * depth;
    }

    @Override
    public double volume() {
        return this.width * this.height * this.depth;
    }

    @Override
    public String toString() {
        return "BOX {" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
