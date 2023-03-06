package windows;

import com.iteso.model.RGBColor;

public class ExtendedWindow extends BasicWindow {

    protected String title = "Untitled";

   // private int x = 1000;

    public ExtendedWindow(String title) {
        super();    // Llamar al primer constructor de BasicWindow
        this.title = title;
    }

    public ExtendedWindow(String title, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.title = title;
    }

    public void move(int dx, int dy) {
        // int x = 1000000;
        super.x += dx;
        if(super.x < 0) super.x = 0;
        super.y += dy;
        if(super.y < 0) super.y = 0;
    }

    @Override
    public void display() {
        System.out.println("title:" + title);
        super.display();
        //RGBColor c1 = new RGBColor();
        //c1.blue = -50;
    }

}
