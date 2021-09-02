/**
*   Clase	:   Formulario.java
*   @proposito  Crear una clase de tipo plantilla para tener una guia cuando vayamos a realizar un programa que tenga un formulario
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

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class Formulario extends JFrame {
    
    static JPanel pnlPrincipal =new JPanel();
    //constructor de la clase formulario - en este constructor vamos a utilizar los atributos y metodos de la superclase
    public Formulario(){
        super("Titulo del JFRAME");
        setBounds(20, 20, 500, 700);
        pintarPanel();
        setVisible(true);
        add(pnlPrincipal);
    }
    public static void main(String args[]) {
        Formulario ejem=new Formulario();//aqui comienza java
        //Instruccion para finalizar bien el programa, cuando le digamos cerrar
        ejem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void pintarPanel(){
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "Formulario estudiantes");
        pnlPrincipal.setBorder(bordejpanel); 
         pnlPrincipal.setSize(500, 200);
         pnlPrincipal.setLayout(null);
         pnlPrincipal.setLocation(0, 200);
   
        JLabel lblNombre= new JLabel("Ingresar Nombres");
        lblNombre.setBounds(20, 30, 200, 30);
        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(200, 30, 200, 30);

        
        JButton btnGuardar  = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");
        btnGuardar.setBounds(20, 300, 200, 30);
        btnCancelar.setBounds(220, 300, 200, 30);

        
        JComboBox combo1=new JComboBox();
        combo1.setBounds(30, 50, 200, 30);
        String datos[]=new String[3];
        datos[0]="Java Zone";
        datos[1]="El Rincon de tu Casa";
        datos[2]="Blog Java";
        JComboBox combo2=new JComboBox(datos);
        combo2.setBounds(30, 100, 200, 30);
        pnlPrincipal.add(lblNombre);
        pnlPrincipal.add(txtNombre);
        /*pnlUno.add(combo1);
        pnlUno.add(combo2);*/
        pnlPrincipal.add(btnGuardar);
        pnlPrincipal.add(btnCancelar);
        
    }
    
    
}
