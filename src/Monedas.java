import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Monedas {
    private JComboBox MONEDA1;
    private JComboBox MONEDA2;
    private JTextField textField1;
    private JList list1;
    private JPanel mainPanel;
    private JTextField resultadoTxt;

    public Monedas() {



        MONEDA1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer resultado;
                double constante;

                String moneda1= MONEDA1.getSelectedItem().toString();
                String moneda2= MONEDA2.getSelectedItem().toString();
                double numero1=Double.parseDouble(textField1.getText());


                //USD (DOLAR AMERICANO)
                //COP (PESO COLOMBIANO)
                //EUR (EUROS)
                //JPY (YENES JAP)
                //VEF (BOLIVAR)

                if (moneda1 == "USD" && moneda2 == "USD" ){

                    constante=1;

                } else if (moneda1 == "USD" && moneda2=="COP" ) {

                    constante=4425.74;
                } else if (moneda1 == "USD" && moneda2=="EUR") {

                    constante=0.99;

                } else if (moneda1 == "USD" && moneda2=="JPY") {

                    constante= 137.27;

                } else if (moneda1 == "USD" && moneda2 == "VEF") {

                    constante=5.39;

                }

            }
        });


    }
    public static void main(String[] args) {
        JFrame frame=new JFrame("Monedas");
        frame.setContentPane(new Monedas().mainPanel);
        frame.setTitle("Welcome");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
