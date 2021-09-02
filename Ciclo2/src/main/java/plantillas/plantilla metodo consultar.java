/*****************************************************************************
     * @Nombre del m�todo : consGestorxCodigo2
     *         .............................................................................. 
     * @fecha_de_creacion  : dd/mm/yyyy
     *         ..............................................................................
     * @author AUTOR: 
     *         ..............................................................................
     * @Proposito : Mostrar  los productos
     *            ..............................................................................
     * @Entradas :
     *           ..............................................................................
     * @Salidas :
     *          ..............................................................................
     * @Consideraciones : 
     *****************************************************************************/
    public ArrayList<Producto> getProductos()
    {
        Connection      conDb = null;
        String              strStm = null;
        ResultSet        rstProductos = null;
        //Crear el arreglo segun el objeto que se necesite
        ArrayList<Producto> arrayProducto=new ArrayList<Producto>();  
        
        int intTamColumnas = 0;
        PreparedStatement prdStmt = null;
        try {

            if (conDb == null){
                conDb = conexion.obtener();
            }
            //cambiar por el select que se necesite
            strStm =       "        SELECT  id_producto, nombre, valor  " + 
                                "        FROM tienda.producto order by nombre	";

            prdStmt = conDb.prepareStatement(strStm);

            rstProductos = prdStmt.executeQuery();
            ResultSetMetaData rsMetaData = rstProductos.getMetaData();
            intTamColumnas = rsMetaData.getColumnCount();
            int id=0;
            String nombre="";
            int precio=0;
            while (rstProductos.next()) {
                for (int i = 1; i <= intTamColumnas; i++) {
                    //llenar las variables segunse necesite
                    id=Integer.parseInt(new String((rstProductos.getString(1) == null) ? "0" : (rstProductos.getString(1))));
                    nombre=(new String((rstProductos.getString(2) == null) ? "" : (rstProductos.getString(2))));
                    precio=Integer.parseInt(new String((rstProductos.getString(3) == null) ? "" : (rstProductos.getString(3))));
               }
                //llenar el arraylist de tipo array
               arrayProducto.add(new Producto(id, nombre, precio));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try
            {
                if (prdStmt != null){
                    prdStmt.close();
                }
                if (conDb != null){
                    conDb.close();
                }
                if (rstProductos != null){
                    rstProductos.close();
                }
            }
            catch(Exception errorCerrandoConexion)
            {
                    System.out.println("error cerrando conexxion "+errorCerrandoConexion);
            }
        }
        return arrayProducto;
    } // Fin getProductos()