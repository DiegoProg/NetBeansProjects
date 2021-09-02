
package semana7.inicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Producto {
    int id;
    String nombre;
    int valor;
    int  cantidad; 

    public Producto(int id, String nombre, int valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }

    public Producto(int id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }
    
    
    
    public Producto(int id) {
        this.id = id;
    }


    public Producto(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public Producto() {
    }


    public boolean modificar_producto()
    {
        conexion objeto_conexion = null;
        Connection conexion_bd = null;
        PreparedStatement prdStm= null;
        boolean bolActualizo = true;
        try{
            conexion_bd = objeto_conexion.obtener();
            String strActualizar = "UPDATE tienda_online.producto set nombre=?, valor=? where id=?";
            
            prdStm = conexion_bd.prepareStatement(strActualizar);
            
            prdStm.setString(1,  getNombre());
            prdStm.setInt(2,  getValor());
            prdStm.setInt(3,  getId());
            
            prdStm.execute();
            
        }catch(Exception errorModificar)
        {
            System.out.println("Se presento error al actualizar el registro "+errorModificar);
            bolActualizo = false;
        }finally
        {
            try{
                conexion_bd.close();
            }catch(Exception errorCerrandoConexion)
            {
                System.out.println("Se presento error al cerrar conexion  "+errorCerrandoConexion);
            }
            
        }
        return bolActualizo;
    }
    
        public boolean eliminar_producto()
    {
        conexion objeto_conexion = null;
        Connection conexion_bd = null;
        PreparedStatement prdStm= null;
        boolean bolActualizo = true;
        try{
            conexion_bd = objeto_conexion.obtener();
            String strActualizar = "delete from tienda_online.producto  where id=?";
            
            prdStm = conexion_bd.prepareStatement(strActualizar);
            
            prdStm.setInt(1,  getId());
            
            prdStm.execute();
            
        }catch(Exception errorModificar)
        {
            System.out.println("Se presento error al borrar el registro "+errorModificar);
            bolActualizo = false;
        }finally
        {
            try{
                conexion_bd.close();
            }catch(Exception errorCerrandoConexion)
            {
                System.out.println("Se presento error al cerrar conexion  "+errorCerrandoConexion);
            }
            
        }
        return bolActualizo;
    }
    
    
    
    public boolean ingresar_producto()
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
               strSentenciaSql = "   Insert into tienda_online.producto   "
                       + " ( nombre, valor)  Values "
                       + " ( ?, ?) ";
               prdStmt = conexionBaseDatos.prepareStatement(strSentenciaSql);
               
               prdStmt.setString(1, getNombre());
               prdStmt.setInt(2, getValor());
               //conectarse a base de datos y ejecuta lo que le asignamos
               prdStmt.execute();
           } catch (Exception  se) {
                   System.out.println("error creando productos " + se);
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
    
    public ArrayList<Producto> getProductos(){
        conexion objeto_conexion    = null;
        Connection conexion_bd      = null;
        //su funcion es realizar todo el proceso sobre la base de datos
        PreparedStatement prdStmt = null;
        ArrayList<Producto> arregloProducto = new ArrayList<Producto>();
        try{
            conexion_bd = objeto_conexion.obtener();
            String strSentenciaSql = "SELECT id, nombre, valor FROM tienda_online.producto";
             prdStmt = conexion_bd.prepareStatement(strSentenciaSql);
             ResultSet resultado = prdStmt.executeQuery();
             while(resultado.next()){
                 int idTemp = resultado.getInt(1);
                 String nombreTemp = resultado.getString(2);
                 int valorTemp = resultado.getInt(3);
                 arregloProducto.add(new Producto(idTemp,nombreTemp, valorTemp));
             }

        }catch(Exception errorConsulta){
            System.out.println("la consulta no se pudo realizar "+errorConsulta);
        }finally
        {
            try
            {
                conexion_bd.close();
            }catch(Exception errorCerrarConexion)
            {
                System.out.println("la conexion no se pudo cerrar "+errorCerrarConexion);   
            }
        }
        return arregloProducto;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", valor=" + valor + '}';
    }
}
