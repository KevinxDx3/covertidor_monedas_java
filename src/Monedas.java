import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Monedas {
    private JComboBox MONEDA1;
    private JComboBox MONEDA2;
    private JTextField textField1;
    private JLabel Resultado;

    public Monedas() {



        MONEDA1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer numero1;
                String moneda1= MONEDA1.getSelectedItem().toString();
                numero1 = Integer.parseInt(textField1.getText());

            }
        });

    }
}
