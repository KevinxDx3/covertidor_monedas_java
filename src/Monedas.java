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

                double constante=0;


                String moneda1= MONEDA1.getSelectedItem().toString();
                String moneda2= MONEDA2.getSelectedItem().toString();
                




                //USD (DOLAR AMERICANO)
                //COP (PESO COLOMBIANO)
                //EUR (EUROS)
                //JPY (YENES JAP)
                //VEF (BOLIVAR)

                if (moneda1 == "USD" && moneda2 == "USD" ){
                    constante=1;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);
                } else if (moneda1 == "USD" && moneda2=="COP" ) {
                    constante=4425.74;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);
                } else if (moneda1 == "USD" && moneda2=="EUR") {
                    constante=0.99;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);
                } else if (moneda1 == "USD" && moneda2=="JPY") {
                    constante=137.27;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "USD" && moneda2 == "VEF") {
                    constante=5.39;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "COP" && moneda2 == "COP" ){
                    constante=1;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);
                } else if (moneda1 == "COP" && moneda2=="USD" ) {
                    constante=4425.74;
                    double resultado=Double.parseDouble(textField1.getText())/constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "COP" && moneda2=="EUR") {
                    constante=0.00022;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "COP" && moneda2=="JPY") {
                    constante=0.031;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "COP" && moneda2 == "VEF") {
                    constante=129.734;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "EUR" && moneda2 == "EUR" ){
                    constante=1;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);
                } else if (moneda1 == "EUR" && moneda2=="USD" ) {
                    constante=1.02;
                    double resultado=Double.parseDouble(textField1.getText())/constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "EUR" && moneda2=="COP") {
                    constante=4517.21;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "EUR" && moneda2=="JPY") {
                    constante=139.26;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "EUR" && moneda2 == "VEF") {
                    constante=582.008;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                }else if (moneda1 == "JPY" && moneda2 == "JPY" ){
                    constante=1;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);
                } else if (moneda1 == "JPY" && moneda2=="USD" ) {
                    constante=0.0073;
                    double resultado=Double.parseDouble(textField1.getText())/constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "JPY" && moneda2=="COP") {
                    constante=32.43;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "JPY" && moneda2=="EUR") {
                    constante=0.0072;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "JPY" && moneda2 == "VEF") {
                    constante=4191.51;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "VEF" && moneda2 == "VEF" ){
                    constante=1;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);
                } else if (moneda1 == "VEF" && moneda2=="USD" ) {
                    constante=0.00000174271;
                    double resultado=Double.parseDouble(textField1.getText())/constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "VEF" && moneda2=="COP") {
                    constante=0.00772439;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "VEF" && moneda2=="EUR") {
                    constante=0.00000172137;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

                } else if (moneda1 == "VEF" && moneda2 == "JPY") {
                    constante=0.000239163;
                    double resultado=Double.parseDouble(textField1.getText())*constante;
                    resultadoTxt.setText(" "+ resultado);

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
