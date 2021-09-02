/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author SOPORTE
 */
public class socios {
    
    private int idusuario;
    private String nombre_usuario;
    private String celular;
    private String direccion;
    private String email;

    public socios(int idusuario, String nombre_usuario, String celular, String direccion, String email) {
        this.idusuario = idusuario;
        this.nombre_usuario = nombre_usuario;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
    }
    
    
    
     public boolean ingresar_socio()
   {
            conexion con = null;
            //variable para abrir la conexion a base de datos
           Connection conexionBaseDatos                    = null;
           /*
           Cuando construimos una consulta normal de JDBC utilizamos un Statement, este Statement o sentencia 
           lo que se encarga es de definir una consulta SQL a ejecutar contra mysql.
           El uso de JDBC Prepared Statement es obligatorio. 
           */
           PreparedStatement prdStmt     = null;
           //variable para controlar si se realizo el ingreso de la informacion correctamente
           boolean bolIngresarDatos         = true;
          //si no hay conexion a base de datos realizar la conexion
            if (conexionBaseDatos == null){
                   conexionBaseDatos = con.obtener();
            }
            
            try {
               String strSentenciaSql = "";
               strSentenciaSql = "   Insert into biblioteca.usuario   "
                       + " ( idusuario, nombre_usuario, celular,  email , direccion)  Values "
                       + " ( ?, ? ,? , ? , ?) ";
               prdStmt = conexionBaseDatos.prepareStatement(strSentenciaSql);
               
               prdStmt.setInt(1, getId_socio());
               prdStmt.setString(2, getNombre());
               prdStmt.setString(3, getTelefono());
               prdStmt.setString(4, getEmail());
               prdStmt.setString(5, getDireccion());
               //conectarse a base de datos y ejecuta lo que le asignamos
               prdStmt.execute();
           } catch (Exception  se) {
                   System.out.println("error creando socio " + se);
                   bolIngresarDatos = false;
           } finally {
                    try{
                        //cerra conexion
                        prdStmt.close();
                        conexionBaseDatos.close();
                        con.cerrar();
                    }
                    catch(Exception error)
                    {
                        System.out.println("error cerrando la conexion a la base de datos" + error);
                    }
           }
           return bolIngresarDatos;
   }

    public int getId_socio() {
        return idusuario;
    }

    public void setId_socio(int id_socio) {
        this.idusuario = id_socio;
    }

    public String getNombre() {
        return nombre_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre_usuario = nombre;
    }

    public String getTelefono() {
        return celular;
    }

    public void setTelefono(String telefono) {
        this.celular = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "socios{" + "idusuario=" + idusuario + ", nombre_usuario=" + nombre_usuario + ", celular=" + celular + ", direccion=" + direccion + ", email=" + email + '}';
    }
    
}

