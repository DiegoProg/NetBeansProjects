
package semana4.sesion1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimerSwing {
    public static void main(String[] args) {
        
        JFrame frame1=new JFrame("TITULO DEL JFRAME");
        frame1.setBounds(200, 200, 700, 700);
        
        //Label hola mundo
        JLabel lblHolaMundo= new JLabel("Realizar Suma");
        /*lblHolaMundo.setFont(new Font("Serif", Font.PLAIN, 18));
        lblHolaMundo.setForeground(Color.BLUE);*/
        lblHolaMundo.setBounds(20, 20, 200, 30);
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
        
        frame1.setLayout(null);
        frame1.add(lblHolaMundo);
        frame1.add(lblNumero1);
        frame1.add(txtNumero1);
        frame1.add(lblNumero2);
        frame1.add(txtNumero2);
        frame1.add(btnSuma);
        //set visible debe estar a lo ultimo
        frame1.setVisible(true);
        
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String strNumero1 = txtNumero1.getText();
                String strNumero2 = txtNumero2.getText();
                //convertir a int Integer.parseInt
                int total=0;
                
                //mostrar el resultado en pantalla
                //crear un label .set
                
                System.out.println("que ingreso en numero 1 "+strNumero1);
                System.out.println("que ingreso en numero 1 "+strNumero2);
            }
         });

        
        
        //sumatoria
        
        
    }    
}
