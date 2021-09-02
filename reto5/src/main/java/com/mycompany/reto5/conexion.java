/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;


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
                        
                        String url = "jdbc:mysql://127.0.0.1:3306/biblioteca?serverTimezone=" + TimeZone.getDefault().getID();
                        cnx = DriverManager.getConnection(url, "root", "625387");
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
