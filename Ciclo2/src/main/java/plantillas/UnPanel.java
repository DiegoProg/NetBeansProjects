/**
*   Clase	:   UnPanel.java
*   @proposito  Crear una clase de tipo plantilla para tener una guia cuando vayamos a realizar un programa que tenga un panel
*   @author	:   Nombre autor de la clase o programa
*   @version    :   1.0
*   @fecha_de_creación : 30/07/2021
*   Consideraciones : 
*   -------------- ACTUALIZACIONES --------------------------------------------
*   Descripcion:
*   Autor      :
*   Fecha      :
*/
package plantillas;

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


public class UnPanel extends JFrame{
    
    static JPanel pnlPrincipal =new JPanel();
    JTextField txtNumero1= new JTextField();
    JTextField txtNumero2= new JTextField();
    JButton btnSuma= new JButton("Sumar");

    //constructor de la clase ejemplo1 - en este constructor vamos a utilizar los atributos y metodos de la superclase
    public UnPanel(){
        super("Titulo del JFRAME");
        setBounds(20, 20, 500, 500);
        pintarPanel();
        
        add(pnlPrincipal);
        
        setVisible(true);
    }
    public static void main(String args[])
    {
        //aqui comienza java
        UnPanel ejem=new UnPanel();
         //Instruccion para finalizar bien el programa, cuando le digamos cerrar
        ejem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void pintarPanel(){
        construyePanelSuma();
        //realizar suma
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
               {
                    String strNumero1 = txtNumero1.getText();
                    String strNumero2 = txtNumero2.getText();
                    int intNumero1=0;
                    int intNumero2=0;
                    int intResultado=0;
                    //convertir de cadena a numero
                    intNumero1 = Integer.parseInt(strNumero1);
                    intNumero2 = Integer.parseInt(strNumero2);
                    intResultado = intNumero1 + intNumero2;
                    JOptionPane.showMessageDialog(pnlPrincipal, "La suma es "+intResultado);
                }
               catch(java.lang.NumberFormatException error1)
               {
                    System.out.println("mostrar por consola tambien el error "+error1);
                    JOptionPane.showMessageDialog(pnlPrincipal, "Ingreso una letra y debe ser numero ");
               }
               catch(Exception error2)
               {
                   /*mostrar por medio de un JOptionPane el error no identificado en la parte de desarrollo pero que lo 
                   capture y me diga que error es*/
                   JOptionPane.showMessageDialog(pnlPrincipal, "se presento error al ingresar los datos "+error2);
                   
                    System.out.println("Error "+error2);
               }
            }
         });
        
    }
    
    private void construyePanelSuma()
    {
        
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "Ejemplo Panel Suma");
        pnlPrincipal.setBorder(bordejpanel); 
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setSize(500, 200);
         pnlPrincipal.setLocation(0, 0);

         JLabel label1= new JLabel("SUMAR DOS NUMEROS");
        label1.setBounds(20, 20, 200, 30);
        JLabel lblNumero1= new JLabel("NUMERO 1");
        lblNumero1.setBounds(20, 50, 200, 30);
        JLabel lblNumero2= new JLabel("NUMERO 2");
        lblNumero2.setBounds(20, 80, 200, 30);

        txtNumero1.setBounds(150, 50, 100, 30);
        txtNumero2.setBounds(150, 80, 100, 30);
        pnlPrincipal.add(label1);
        pnlPrincipal.add(lblNumero1);
        pnlPrincipal.add(lblNumero2);
        pnlPrincipal.add(txtNumero1);
        pnlPrincipal.add(txtNumero2);
        
        btnSuma.setBounds(150, 120, 100, 30);
        pnlPrincipal.add(btnSuma);
    }
}
