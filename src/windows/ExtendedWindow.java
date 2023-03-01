package windows;

public class ExtendedWindow extends BasicWindow {

    protected String title = "Untitled";

    public ExtendedWindow(String title) {
        super();    // Llamar al primer constructor de BasicWindow
        this.title = title;
    }

    public ExtendedWindow(String title, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.title = title;
    }

    public void move(int dx, int dy) {

    }

}
