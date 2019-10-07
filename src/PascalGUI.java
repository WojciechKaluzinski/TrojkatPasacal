import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class PascalGUI extends JFrame implements ActionListener {
    private JButton OKButton;
    private JTextField Podanen;
    private JPanel Rozmiar;
    private JTextArea Pole;
    public int n;

    public PascalGUI() {

        add(Rozmiar);
        setTitle("TRÓJKĄT PASCALA");
        setSize(1000, 800);
        OKButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Pole.setText("");

        int i, j;
        boolean numeric = true;


        try {
            n = Integer.valueOf(Podanen.getText());
        }
        catch (NumberFormatException c) {
            numeric = false;
        }
        if(n<0) numeric = false;

        if(numeric){
         for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                Pole.append(" ");
            }
            for (j = 0; j <= i; j++) {
                Pole.append(" " + String.valueOf(Trojkat.ncr(i, j)));
            }
            Pole.append("\n");
              }
        }
        else
            JOptionPane.showMessageDialog(null, "PODAŁEŚ ZŁĄ DANĄ!!!");

    }
}
