package gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private static final Color  WINDOW_COLOR = new Color(200, 220, 240);
    private static final Font   BUTTON_FONT  = new Font("Calibri", Font.PLAIN, 20);
    private static final Font   MENU_FONT  = new Font("Calibri", Font.PLAIN, 16);

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
        initMenu();
        setVisible(true);
    }

    private void initMenu() {
        JMenuBar bar = new JMenuBar();
        JMenu menu1 = new JMenu("First");
        menu1.add(new JMenuItem("One"));
        menu1.add(new JMenuItem("Two"));
        JMenu menu2 = new JMenu("Second");
        menu2.add(new JMenuItem("Three"));
        menu2.add(new JMenuItem("Four"));
        menu1.setFont(MENU_FONT);
        menu2.setFont(MENU_FONT);
        bar.add(menu1);
        bar.add(menu2);
        setJMenuBar(bar);
    }

    private void initComponents() {
        armorIcon = new ImageIcon(getClass().getResource("images/Armadura1.jpg"));
        armorImage = new JLabel(armorIcon);

        Container c = getContentPane();
        c.setBackground(WINDOW_COLOR);
        c.setLayout(null);
        armorCmb.setBounds(100, 70, 200, 40);
        armorCmb.setFont(BUTTON_FONT);

        okBtn.setBounds(100, 130, 200, 50);
        okBtn.setMnemonic('S');
        okBtn.setFont(BUTTON_FONT);
        okBtn.addActionListener(e -> selectArmor());

        armorImage.setBounds(50, 210, 288, 256);
        System.out.println(armorIcon.getIconWidth());

        c.add(okBtn);
        c.add(armorCmb);
        c.add(armorImage);
    }

    private void selectArmor() {
        System.out.println("Seleccionar armadura");
    }

    public static void main(String[] args) throws Exception {
        //UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme");
        UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme");
        JFrame.setDefaultLookAndFeelDecorated(true);
        new MainWindow();
    }

}
