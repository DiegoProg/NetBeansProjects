package semana4.sesion3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class ejercicio2 extends JFrame {
    
    static JPanel pnlPrincipal =new JPanel();
    //constructor de la clase formulario - en este constructor vamos a utilizar los atributos y metodos de la superclase
    public ejercicio2(){
        super("Titulo del JFRAME");
        setBounds(20, 20, 700, 800);
        pintarPanel();
        setVisible(true);
        add(pnlPrincipal);
    }
    public static void main(String args[]) {
        ejercicio1 ejem=new ejercicio1();//aqui comienza java
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

        //crear arreglo para el combobox
        String strTipoDocumento[] = {"TI", "CC", "CE"};
        //crear combox
        JLabel lblTipoDocumento= new JLabel("Seleccionar tipo documento");
        lblTipoDocumento.setBounds(20, 70, 200, 30);
        JComboBox cmbTipoDocumento = new JComboBox(strTipoDocumento);
        cmbTipoDocumento.setBounds(200, 70, 200, 30);
        
        //crear radio button paraingresar genero
        JLabel lblGenero= new JLabel("Seleccionar Genero");
        lblGenero.setBounds(20, 110, 200, 30);
        
        JRadioButton jrbMasculino = new JRadioButton("Masculino");
        jrbMasculino.setBounds(200, 110, 100, 30);
        JRadioButton jrbFemenino = new JRadioButton("Femenino");
        jrbFemenino.setBounds(300, 110, 100, 30);
        ButtonGroup btgGenero = new ButtonGroup();
        btgGenero.add(jrbMasculino);
        btgGenero.add(jrbFemenino);
        
        JButton btnGuardar  = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnMostrarDatos = new JButton("Mostrar Datos");
        btnGuardar.setBounds(20, 300, 200, 30);
        btnCancelar.setBounds(220, 300, 200, 30);
        btnMostrarDatos.setBounds(420, 300, 200, 30);

        //crear jspinner para ingresar la fecha
        JLabel lblFecha= new JLabel("Ingrese fecha DD-MM-YYYY");
        lblFecha.setBounds(20, 150, 200, 30);

        
        int inicial = 1;
        int min=1;
        int max=31;
        int paso=1;
        SpinnerModel valoresDia = new SpinnerNumberModel(inicial, min, max, paso);
        JSpinner spiDia = new JSpinner(valoresDia);
        spiDia.setBounds(200, 150, 50, 30);

         SpinnerModel valoresMes = new SpinnerNumberModel(1, 1, 12, 1);
        JSpinner spiMes = new JSpinner(valoresMes);
        spiMes.setBounds(280, 150, 50, 30);

         SpinnerModel valoresA??o = new SpinnerNumberModel(2000, 1940, 2015, 1);
        JSpinner spiA??o = new JSpinner(valoresA??o);
        spiA??o.setBounds(360, 150, 50, 30);
        
        pnlPrincipal.add(lblNombre);
        pnlPrincipal.add(txtNombre);
        pnlPrincipal.add(lblTipoDocumento);
        pnlPrincipal.add(cmbTipoDocumento);
        pnlPrincipal.add(lblGenero);
        pnlPrincipal.add(jrbMasculino);
        pnlPrincipal.add(jrbFemenino);
        //agregar en el panel la fecha
        pnlPrincipal.add(lblFecha);
        pnlPrincipal.add(spiDia);
        pnlPrincipal.add(spiMes);
        pnlPrincipal.add(spiA??o);
        
        pnlPrincipal.add(btnGuardar);
        pnlPrincipal.add(btnCancelar);
        pnlPrincipal.add(btnMostrarDatos);
        
        ArrayList<Estudiante> arregloEstudiante = new ArrayList<>();
        
        
         btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
                
                String strNombre = txtNombre.getText();
                String strTipoDocumento = (String) cmbTipoDocumento.getSelectedItem();
                String strGenero="";
                if(jrbMasculino.isSelected()==true)
                {
                    strGenero= "Masculino";
                }
                else if(jrbFemenino.isSelected()==true)
                {
                    strGenero= "Femenino";
                }
                String strDia = spiDia.getValue().toString();
                String strMes = spiMes.getValue().toString();
                String strA??o = spiA??o.getValue().toString();
                  //crear variable string fecha de tipo DD/MM/YYYY
                String fecha = strDia +"/"+strMes+"/"+strA??o;
                //convertir a tipo la fecha  a tipo Date
                
                Date datFecha = null;
                try
                {
                    //instruccion para convertir a fecha
                    datFecha = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
                }catch(Exception error)
                {
                    JOptionPane.showMessageDialog(pnlPrincipal, "Se presento un error al convertir fecha "+error);
                }
                arregloEstudiante.add(new Estudiante(strNombre, strTipoDocumento, strGenero, datFecha));
                JOptionPane.showMessageDialog(pnlPrincipal, "Se guardo correctamente");
             }
         });
        
         btnMostrarDatos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                try
                {
                    String[] titulosTabla = {"Nombres", "Tipo Documento", "Genero", "Fecha Nacimiento"};
                    Iterator<Estudiante> iteratorEstudiante = arregloEstudiante.iterator();

                    Object[][] Estudiante = new Object[arregloEstudiante.size()][4];
                    int i=0;
                    while(iteratorEstudiante.hasNext())
                    {
                            Estudiante objEstudiante = iteratorEstudiante.next();
                            Estudiante[i][0] = objEstudiante.getNombre();
                            Estudiante[i][1] = objEstudiante.getTipo_documento();
                            Estudiante[i][2] = objEstudiante.getGenero();
                            Estudiante[i][3] = objEstudiante.getFecha_nacimiento();
                            i++;
                    }
                    JTable tablaAlumnos = new JTable(Estudiante, titulosTabla);
                    tablaAlumnos.setPreferredScrollableViewportSize(new Dimension(500,400));
                    JScrollPane tablaConScroll = new JScrollPane(tablaAlumnos);
                    tablaConScroll.setBounds(20, 350, 500, 300);
                    pnlPrincipal.add(tablaConScroll);
                }
                catch(Exception errorRecibido)
                {
                    JOptionPane.showMessageDialog(pnlPrincipal, "Se presento un error al mostrar los datos guardados"+errorRecibido);
                }
            }
            });
    }
    
    
}