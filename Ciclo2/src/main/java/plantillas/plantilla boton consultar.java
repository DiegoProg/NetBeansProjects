
package plantillas;

private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ArrayList<Producto> ArrayProductos = new ArrayList<Producto>();
        Producto producto = new Producto();
        DefaultTableModel modeloTabla;
        try
        {
                ArrayProductos = producto.getProductos();
                //se coloca 3 porque son 3 filas
                Object [] obj_producto = new Object[3]; 
                Iterator<Producto> iteratorProducto = ArrayProductos.iterator();
                 modeloTabla = (DefaultTableModel) jtaProductos.getModel();
                 while(iteratorProducto.hasNext()){  
                    Producto producto2 = iteratorProducto.next();
                    obj_producto[0]= producto2.getId_producto();
                    obj_producto[1]= producto2.getNombre();
                    obj_producto[2]= producto2.getValor();
                    modeloTabla.addRow(obj_producto);
                } 
                 jtaProductos.setModel(modeloTabla);
        }catch(Exception e)
        {
            System.out.println("Error consultado productos "+e);
        }
    }     