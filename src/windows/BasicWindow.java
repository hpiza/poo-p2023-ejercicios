package windows;

public class BasicWindow {

    public static final int MIN_WIDTH = 10;
    public static final int MIN_HEIGHT = 15;

    protected int x = 0, y = 0, width = 0, height = 0;

    public BasicWindow() {
        width = MIN_WIDTH;
        height = MIN_HEIGHT;
    }

    public BasicWindow(int x, int y, int w, int h) {
        this.x = x > 0? x : 0;
        this.y = y > 0? y : 0;
        resize(w, h);
    }

    public void display() {
        System.out.printf("x=%d\ny=%d\nwidth=%d\nheight=%d\n", this.x, this.y, this.width, this.height);
    }

    public void resize(int dw, int dh) {
        width = width + dw >= MIN_WIDTH? width + dw : MIN_WIDTH;
        height = height + dh >= MIN_HEIGHT? height + dh : MIN_HEIGHT;
    }

}
