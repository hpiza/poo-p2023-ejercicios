import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("Ok")) System.out.println("Se presionó el botón Ok");
        else System.out.println("Se presionó el botón Cancel");
    }
}
