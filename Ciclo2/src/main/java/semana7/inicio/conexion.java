/**
*   Clase	:   conexion.java
*   @proposito  Crear una clase para realizar la conexion a la base de datos
*   @author	:   Nombre autor de la clase o programa
*   @version    :   1.0
*   @fecha_de_creación : 30/07/2021
*   Consideraciones : 
*   -------------- ACTUALIZACIONES --------------------------------------------
*   Descripcion:
*   Autor      :
*   Fecha      :
*/
package semana7.inicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
import javax.swing.JOptionPane;

public class conexion {
        private static Connection cnx = null;
    //abrir conexion a base de datos
        public static Connection obtener() 
        {
                try
                {
                    //sentencia de driver que se va a manejar
                        Class.forName("com.mysql.jdbc.Driver");
                        
                        String url = "jdbc:mysql://127.0.0.1:3306/tienda_online?serverTimezone=" + TimeZone.getDefault().getID();
                        cnx = DriverManager.getConnection(url, "root", "Logimar0580");
                } 
                catch (SQLException ex) {
                    
                        JOptionPane.showMessageDialog(null, "Se presento error al conectar a la base de datos "+ex.getMessage());
                } catch (ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "Se presento error al conectar a la base de datos "+ex.getMessage());
                }
                return cnx;
        }
        //cerrar conexion base de datos
        public static void cerrar() 
        {
                //metodo que cierra la conexion a la base de datos
                if (cnx != null) 
                {
                    try
                    {
                        cnx.close();
                    }catch(Exception error)
                    {
                        JOptionPane.showMessageDialog(null, "Se presento error al cerrar la conexion "+error.getMessage());
                    }   
                }
        }
	
}