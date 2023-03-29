import com.iteso.calendar.Date;
import com.iteso.model.CanvasUser;
import com.iteso.model.Professor;
import shapes3d.Paint3D;
import shapes3d.Shape3D;
import shapes3d.Sphere;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private static final Color  WINDOW_COLOR = new Color(200, 220, 240);
    private static final Font   BUTTON_FONT  = new Font("Calibri", Font.PLAIN, 20);
    private static final Cursor HAND_CURSOR  = new Cursor(Cursor.HAND_CURSOR);

    private JButton okBtn = new JButton("Ok");
    private JButton cancelBtn = new JButton("Cancel");

    public Ventana() {
        super("Mi primer ventana");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        //setUndecorated(true);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        Container c = getContentPane();
        c.setBackground(WINDOW_COLOR);
        //c.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 5));
        c.setLayout(null);
        okBtn.setBounds(50, 100, 100, 40);
        okBtn.setMnemonic('O');
        okBtn.setToolTipText("Guardar");
        okBtn.setFont(BUTTON_FONT);
        okBtn.setCursor(HAND_CURSOR);
        okBtn.setActionCommand("Ok");
        cancelBtn.setBounds(200, 100, 100, 40);
        cancelBtn.setMnemonic('C');
        cancelBtn.setToolTipText("Cancelar");
        cancelBtn.setFont(BUTTON_FONT);
        cancelBtn.setCursor(HAND_CURSOR);
        cancelBtn.setActionCommand("Cancel");

        OkListener okListener = new OkListener();
        ActionListener buttonListener1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                if(cmd.equals("Ok")) System.out.println("Se presionó el botón Ok");
                else System.out.println("Se presionó el botón Cancel");
            }
        };

        ActionListener buttonListener2 = e -> System.out.println("Se presionó el botón Ok");
        okBtn.addActionListener(buttonListener2);
        cancelBtn.addActionListener(e -> System.out.println("Se presionó el botón Cancel"));

        // CanvasUser canvasUser1 = () -> true;  // public boolean login() { return true; }

        /*
        int variableDeMétodo = 10;
        okBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se presionó el botón Ok");
                System.out.println(variableDeMétodo);
            }
        });
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se presionó el botón Cancel");
            }
        });
*/
        c.add(okBtn);
        c.add(cancelBtn);
    }

    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame("Mi primer ventana");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);*/
        Ventana ventana = new Ventana();
    }

    static class ClaseAnidada {

    }

    public static void main1(String[] args) {
        Shape3D sphere2 = new Sphere(1, 2, 3, 4);
        // Clase anónima
        Shape3D pyramid  = new Shape3D(1, 2, 3) {
            double side = 3, height = 5;
            public double area() {
                return 2;
            }
            public double volume() {
                return side * side * height / 3;
            }
            public void setHeight(double h) {
                this.height = h;
            }
            public String toString() {
                return "Pirámide de lado " + side + ", altura " + height + "\n" + super.toString();
            }
        };
        pyramid.move(2, 3, 4);
        // pyramid.setHeight(3);

        Shape3D dummyShape = new Shape3D(1, 2, 3) {
          public double area() {
              return 0;
          }
          public double volume() {
              return 1;
          }
        };

        Paint3D paint = new Paint3D(100);
        paint.addShape(pyramid);
        paint.addShape(sphere2);
        paint.addShape(dummyShape);
        paint.displayAll();

        CanvasUser user1 = new Professor(20000);
        CanvasUser user2 = new CanvasUser() {
            // Constructor de una clase anónima
            {
                System.out.println("Se creó un usuario de Canvas dummy");
            }
            public void addCourse() {
                System.out.println("Adding course");
            }
            public boolean login() {
                System.out.println("Login successful");
                return true;
            }
        };
        user1.addCourse();
        user2.addCourse();
        user1.login();
        user2.login();

        Date d1 = new Date() {
            {
                System.out.println("Se creó un Date modificado");
            }
            public String toString() {
                setFormat(2);
                return "[" + super.toString() + "]";
            }
        };

        d1.setFormat(1);
        System.out.println(d1);
        d1.setDay(15);
        d1.setMonth(6);
        d1.next();
        d1.setFormat(0);
        System.out.println(d1);
    }

}
