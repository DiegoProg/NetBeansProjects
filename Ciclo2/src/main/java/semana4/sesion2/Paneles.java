
package semana4.sesion2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Paneles extends JFrame{
    JPanel panelPrincipal = new JPanel();
    JPanel panelSuperior = new JPanel();
    JPanel panelInferior = new JPanel();
    //constructor
    public Paneles()
    {
        super("TITULO DEL FRAME");
        setBounds(10,10,500, 500);
        
        panelPrincipal.setLayout(null);
        //panelPrincipal.setLayout(null);
        //crear un metodo para pintar los paneles
        pintarPanelSuperior();
        pintarPanelInferior();
        add(panelPrincipal);
        //set visible debe estar al final 
        setVisible(true);
    }
    //metodo main
    public static void main(String[] args) {
        Paneles InsPaneles = new Paneles();
    }  
    //metodo para pintar paneles
    public void pintarPanelSuperior(){
        Border bordePanelSuperior = new TitledBorder(new EtchedBorder(), "Realizar Suma");
        
        panelSuperior.setBorder(bordePanelSuperior); 
        panelSuperior.setSize(500, 200);
        panelSuperior.setLayout(null);
        panelSuperior.setLocation(0, 0);
        
        JLabel lblSumar= new JLabel("Realizar Suma");
        lblSumar.setBounds(20, 20, 200, 30);
        JLabel lblNumero1= new JLabel("Ingresar Numero 1");
        lblNumero1.setBounds(20, 50, 200, 30);
        JTextField txtNumero1 = new JTextField();
        txtNumero1.setBounds(200, 50, 200, 30);
        JLabel lblNumero2= new JLabel("Ingresar Numero 2");
        lblNumero2.setBounds(20, 80, 200, 30);
        JTextField txtNumero2 = new JTextField();
        txtNumero2.setBounds(200, 80, 200, 30);
        JButton btnSuma = new JButton("Sumar");
        btnSuma.setBounds(200, 120, 200, 30);
        
        //panelSuperior.add(lblSumar);
        panelSuperior.add(lblNumero1);
        panelSuperior.add(txtNumero1);
        panelSuperior.add(lblNumero2);
        panelSuperior.add(txtNumero2);
        panelSuperior.add(btnSuma);
        
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String strNumero1 = txtNumero1.getText();
                String strNumero2 = txtNumero2.getText();
                //convertir a int Integer.parseInt
                int int_numero1=0;
                int int_numero2=0;
                int int_suma=0;
                //convertir la cadena de texto a tipo int (entero)
                int_numero1 = Integer.parseInt(strNumero1);
                int_numero2 = Integer.parseInt(strNumero2);
                int_suma= int_numero1 + int_numero2;
                //mostrar el resultado por medio de un joption pane
                JOptionPane.showMessageDialog(null, "la Suma es "+int_suma);
                System.out.println("la suma es "+int_suma);
            }
         });
        
        //panelSuperior.setBackground(Color.ORANGE);
        panelPrincipal.add(panelSuperior);
    }

    public void pintarPanelInferior(){
        panelInferior.setSize(500, 200);
        panelInferior.setLocation(0, 220);
        panelInferior.setLayout(null);
        panelInferior.setBackground(Color.BLUE);
        panelPrincipal.add(panelInferior);
    }

    
}
