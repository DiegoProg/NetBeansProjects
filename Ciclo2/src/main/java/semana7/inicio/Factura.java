package semana7.inicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Factura {
    int id;
    int id_cliente;
    int valor_total;

    public Factura(int id, int id_cliente, int valor_total) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.valor_total = valor_total;
    }

    public Factura() {
    }
    
    
    

     public boolean ingresar_factura()
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
               strSentenciaSql = "   Insert into tienda_online.factura   "
                       + " ( id, id_cliente)  Values "
                       + " ( ?, ?) ";
               prdStmt = conexionBaseDatos.prepareStatement(strSentenciaSql);
               
               prdStmt.setInt(1, getId());
               prdStmt.setInt(2, getId_cliente());
               //conectarse a base de datos y ejecuta lo que le asignamos
               prdStmt.execute();
           } catch (Exception  se) {
                   System.out.println("error creando factura " + se);
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
     
     
     public boolean ingresar_factura_producto(int parIdFactura, int parIdProducto, int parCantidad)
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
               strSentenciaSql = "   Insert into tienda_online.facturas_productos    "
                       + " ( id_factura, id_producto, cantidad)  Values "
                       + " ( ?, ?, ?) ";
               prdStmt = conexionBaseDatos.prepareStatement(strSentenciaSql);
               
               prdStmt.setInt(1, parIdFactura);
               prdStmt.setInt(2, parIdProducto);
               prdStmt.setInt(3, parCantidad);
               //conectarse a base de datos y ejecuta lo que le asignamos
               prdStmt.execute();
           } catch (Exception  se) {
                   System.out.println("error creando los productos de la factura " + se);
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
    
    
    public int getNumeroFactura()
    {
        conexion objeto_conexion    = null;
        Connection conexion_bd      = null;
        //su funcion es realizar todo el proceso sobre la base de datos
        PreparedStatement prdStmt = null;
        int intNumeroFactura = 0;

        try{
            conexion_bd = objeto_conexion.obtener();
            String strSentenciaSql = "select IFNULL((max(id)+1), 1) from tienda_online.factura ";
             prdStmt = conexion_bd.prepareStatement(strSentenciaSql);
             ResultSet resultado = prdStmt.executeQuery();
             while(resultado.next()){
                 intNumeroFactura = resultado.getInt(1);
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
        return intNumeroFactura;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", id_cliente=" + id_cliente + ", valor_total=" + valor_total + '}';
    }
}
