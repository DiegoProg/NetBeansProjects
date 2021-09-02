package plantillas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

public class Estudiante {
    String nombre="";
    String tipo_documento="";
    String genero="";
    int identificacion=0;
    Date fecha_nacimiento=null;
    //instanciar de la clase conexion
    conexion con = null;

    public Estudiante() {
    }

    public Estudiante(int identificacion, String nombre, String tipo_documento, String genero, Date fecha_nacimiento) {
        this.identificacion=identificacion;
        this.nombre=nombre;
        this.tipo_documento=tipo_documento;
        this.genero=genero;
        this.fecha_nacimiento=fecha_nacimiento;
    }
    
    /**
    * A Class class.
    * ..............................................................................
    * 
    * @fecha_de_creacin : 05/06/2008
    *                   ...............................................................................
    * @method : crear_estudiante ()
    *         ...............................................................................
    * @author AUTOR: 
    *         ...............................................................................
    * @fecha_de_creación : 
    *                   ...............................................................................
    * @Proposito : metodo que ingresa en la tabla de estudiante
    *            ..............................................................................
    * @Consideraciones : 
    * @webmethod
    * 
    * 
    */
   public boolean crear_estudiante()
   {
            //variable para abrir la conexion a base de datos
           Connection conDb                    = null;
           /*
           Cuando construimos una consulta normal de JDBC utilizamos un Statement, este Statement o sentencia 
           lo que se encarga es de definir una consulta SQL a ejecutar contra mysql.
           El uso de JDBC Prepared Statement es obligatorio. 
           */
           PreparedStatement prdStmt     = null;
           //variable para controlar si se realizo el ingreso de la informacion correctamente
           boolean bolIngresarDatos         = true;
          //si no hay conexion a base de datos realizar la conexion
            if (conDb == null){
                   conDb = con.obtener();
            }
            //tipos de variables date
            java.util.Date ejemploDateJava= null;
            //declara una variable de tipo Date -SQL
            java.sql.Date datSqlFechanacimiento = null;
            try
            {
               if(getFecha_nacimiento()!=null)
                {
                    //Instruccion para convertir una fecha java.sql
                    datSqlFechanacimiento = new java.sql.Date(getFecha_nacimiento().getTime());
                }
            }catch(Exception errorFecha){
                System.out.println("error convirtiendo la fecha a tipo date " + errorFecha);
            }
            try {
               String strSentenciaSql = "";
               strSentenciaSql = "   Insert into colegio.estudiante   "
                       + " ( idEstudiante, nombre, genero, tipo_documento, fecha_nacimiento) " + " Values "
                       + " ( ?, ?, ?, ?, ?) ";
               prdStmt = conDb.prepareStatement(strSentenciaSql);
               
               prdStmt.setInt(1, getIdentificacion());
               prdStmt.setString(2, getNombre());
               prdStmt.setString(3, getGenero());
               prdStmt.setString(4, getTipo_documento());
               //al asignar la fecha a la base de datos debemos colocar la variable que es de tipo java.sql.Date
               prdStmt.setDate(5, datSqlFechanacimiento);
               //conectarse a base de datos y ejecuta lo que le asignamos
               prdStmt.execute();
           } catch (Exception  se) {
                   System.out.println("error creando estudiante " + se);
                   bolIngresarDatos = false;
           } finally {
                    try{
                        //cerra conexion
                        prdStmt.close();
                        conDb.close();
                        con.cerrar();
                    }
                    catch(Exception error)
                    {
                        System.out.println("error cerrando la conexion a la base de datos" + error);
                    }
           }
           return bolIngresarDatos;
   }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }



    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", tipo_documento=" + tipo_documento + ", genero=" + genero + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    
}

