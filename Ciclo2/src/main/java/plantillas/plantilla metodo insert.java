/**
    * A Class class.
    * ..............................................................................
    * 
    * @fecha_de_creacin : 05/06/2008
    *                   ...............................................................................
    * @method : crear_producto ()
    *         ...............................................................................
    * @author AUTOR: 
    *         ...............................................................................
    * @fecha_de_creación : 
    *                   ...............................................................................
    * @Proposito : metodo que ingresa en la tabla de producto
    *            ..............................................................................
    * @Consideraciones : 
    * @webmethod
    * 
    * 
    */
   public boolean crear_producto()
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
               strSentenciaSql = "   Insert into tienda.producto   "
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