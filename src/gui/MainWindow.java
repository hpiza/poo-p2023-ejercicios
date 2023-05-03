package gui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MainWindow extends JFrame {

    private static final Color  WINDOW_COLOR = new Color(200, 220, 240);
    private static final Font   BUTTON_FONT  = new Font("Calibri", Font.PLAIN, 20);

    public enum Armor { ARMADURA1, ARMADURA2, ARMADURA3 };

    private JButton okBtn = new JButton("Select armor");
    private JComboBox<Armor> armorCmb = new JComboBox(Armor.values());

    private ImageIcon armorIcon;
    private JLabel armorImage;

    public MainWindow() {
        super("Minecraft main window");
        setSize(400, 630);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        armorIcon = new ImageIcon(getClass().getResource("images/Armadura1.jpg"));
        armorImage = new JLabel(armorIcon);

        Container c = getContentPane();
        c.setBackground(WINDOW_COLOR);
        c.setLayout(null);
        armorCmb.setBounds(100, 70, 200, 30);
        armorCmb.setFont(BUTTON_FONT);

        okBtn.setBounds(100, 120, 200, 30);
        okBtn.setMnemonic('S');
        okBtn.setFont(BUTTON_FONT);
        okBtn.addActionListener(e -> selectArmor());

        armorImage.setBounds(50, 200, 288, 256);
        System.out.println(armorIcon.getIconWidth());

        c.add(okBtn);
        c.add(armorCmb);
        c.add(armorImage);
    }

    private void selectArmor() {
        System.out.println("Seleccionar armadura");
    }

    public static void main(String[] args) {
        new MainWindow();
    }

}
