package shapes3d;

import java.awt.*;

public class Paint3D {

    public static final int MIN_CAPACITY = 1;
    private final Shape3D[] shapes;

    private int index = 0;

    public Paint3D(int capacity) {
        capacity = Math.max(capacity, MIN_CAPACITY);
        this.shapes = new Shape3D[capacity];
    }

    public void addShape(Shape3D sh) {  // Polimorfismo en sh
        if(this.index < this.shapes.length)
            this.shapes[this.index ++] = sh;
    }

    public void displayAll() {
        for(int i = 0; i < index; i ++) {
            Shape3D shape = this.shapes[i];
            System.out.println(shape.toString().substring(0, 4));  // toString() de cada subclase
        }
    }

    public double volume() {
        double v = 0;
        for(int i = 0; i < index; i ++) {
            Shape3D shape = this.shapes[i];
            v += shape.volume();                // Enlace dinámico en volume()
        }
        return v;
    }

    public void moveShape(double dx, double dy, double dz, int shapeIndex) {
        if(shapeIndex >= 0 && shapeIndex < index)
            this.shapes[shapeIndex].move(dx, dy, dz);
    }

    public void resizeSphere(double dr, int sphereIndex) {
        if(sphereIndex >= 0 && sphereIndex < index) {
            if(this.shapes[sphereIndex] instanceof Sphere) {
                Sphere sphere = (Sphere) this.shapes[sphereIndex];
                sphere.resize(dr);
                System.out.println("Nuevo radio de esfera: " + sphere.getRadius());
            } else {
                System.out.println("La figura no es una esfera");
            }
        }
    }

    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(1, 2, 3, 5);
        Cylinder cylinder1 = new Cylinder(-1, -2, -3, 3, 8);
        Box box1 = new Box(0, 0, 0, 4, 3, 2);

        Paint3D paint = new Paint3D(10);
        paint.addShape(sphere1);
        paint.addShape(cylinder1);
        paint.addShape(box1);
        paint.displayAll();
        System.out.println("Volumen total: " + paint.volume());
        paint.moveShape(1, 2, 8, 2);
        System.out.println(box1.getX() + ", " + box1.getY() + ", " + box1.getZ());
        paint.resizeSphere(6, 0);
        paint.resizeSphere(6, 1);

        /*
        Shape3D shape1 = sphere1;
        System.out.println(shape1);
        shape1 = cylinder1;
        System.out.println(cylinder1);*/
    }

}
