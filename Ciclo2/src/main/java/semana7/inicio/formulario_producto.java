/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7.inicio;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario Autorizado
 */
public class formulario_producto extends javax.swing.JFrame {

    /**
     * Creates new form formulario_producto
     */
    public formulario_producto() {
        initComponents();
        RefrescarJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btonConsultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos producto"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado productos"));

        jtaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtaProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombre producto");

        jLabel2.setText("Valor");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btonConsultar.setText("Consultar");
        btonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonConsultarActionPerformed(evt);
            }
        });

        jLabel3.setText("Id");

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(btnGuardar)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnActualizar)
                                .addGap(43, 43, 43)
                                .addComponent(btnEliminar)
                                .addGap(30, 30, 30)
                                .addComponent(btonConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor)
                                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(186, 186, 186)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btonConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Tienda");

        jMenuItem1.setText("Crear factura");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Crear Cliente");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        int valor = Integer.parseInt(txtValor.getText());
        Producto producto = new Producto(nombre, valor);
        boolean bolGuardoDatos = false;
        bolGuardoDatos = producto.ingresar_producto();
        if(bolGuardoDatos)
        {
            JOptionPane.showMessageDialog(rootPane, "Los datos fueron grabados correctamente");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Los datos NO fueron grabados correctamente");
        }
        RefrescarJTable();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonConsultarActionPerformed
        ArrayList<Producto> arregloProducto = new ArrayList<Producto>();
        Producto objeto_producto = new Producto();
        arregloProducto = objeto_producto.getProductos();
        Object[] arregloObjetos = new Object[3];
        DefaultTableModel tablaModel=null;
        //llamamos el metodo de limpiar JTable
        limpiarRegistrosJTable();
        
        
        Iterator<Producto> iteratorProducto = arregloProducto.iterator();
        tablaModel = (DefaultTableModel) jtaProductos.getModel();
        while(iteratorProducto.hasNext()){
            Producto objetoProducto = iteratorProducto.next();
            arregloObjetos[0] = objetoProducto.getId();
            arregloObjetos[1] = objetoProducto.getNombre();
            arregloObjetos[2] = objetoProducto.getValor();
            tablaModel.addRow(arregloObjetos);
        }
        jtaProductos.setModel(tablaModel);
        // TODO add your handling code here:
    }//GEN-LAST:event_btonConsultarActionPerformed

    public void RefrescarJTable(){
        ArrayList<Producto> arregloProducto = new ArrayList<Producto>();
        Producto objeto_producto = new Producto();
        arregloProducto = objeto_producto.getProductos();
        Object[] arregloObjetos = new Object[3];
        DefaultTableModel tablaModel=null;
        //llamamos el metodo de limpiar JTable
        limpiarRegistrosJTable();
        
        
        Iterator<Producto> iteratorProducto = arregloProducto.iterator();
        tablaModel = (DefaultTableModel) jtaProductos.getModel();
        while(iteratorProducto.hasNext()){
            Producto objetoProducto = iteratorProducto.next();
            arregloObjetos[0] = objetoProducto.getId();
            arregloObjetos[1] = objetoProducto.getNombre();
            arregloObjetos[2] = objetoProducto.getValor();
            tablaModel.addRow(arregloObjetos);
        }
        jtaProductos.setModel(tablaModel);
    }
    
    private void jtaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtaProductosMouseClicked
        // TODO add your handling code here:
        int fila = jtaProductos.getSelectedRow();
        int id= Integer.parseInt((String) jtaProductos.getValueAt(fila, 0).toString());
        String nombre = (String) jtaProductos.getValueAt(fila, 1).toString();
        int valor= Integer.parseInt((String) jtaProductos.getValueAt(fila, 2).toString());
        txtId.setText(""+id);
        txtNombre.setText(nombre);
        txtValor.setText(""+valor);
    }//GEN-LAST:event_jtaProductosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        String nombre= txtNombre.getText();
        int valor = Integer.parseInt(txtValor.getText());
        Producto objeto_producto = new Producto(id, nombre, valor);
        boolean bolModificoProducto = false;
        bolModificoProducto = objeto_producto.modificar_producto();
        if(bolModificoProducto)
        {
            JOptionPane.showMessageDialog(rootPane, "Los valores fueron modificados");
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "Los valores NO fueron modificados");
        }
        RefrescarJTable();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        Producto objeto_producto = new Producto(id);
        boolean bolEliminarProducto = false;
        bolEliminarProducto = objeto_producto.eliminar_producto();
        if(bolEliminarProducto)
        {
            JOptionPane.showMessageDialog(rootPane, "Los valores fueron eliminados");
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "Los valores NO fueron eliminados");
        }
        RefrescarJTable();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Formulario_factura obj_formulario_factura = new Formulario_factura();
        obj_formulario_factura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed
    
     public void limpiarRegistrosJTable(){
        DefaultTableModel tb = (DefaultTableModel) jtaProductos.getModel();
        int totalRegistroJTable = jtaProductos.getRowCount()-1;
        for (int i = totalRegistroJTable; i >= 0; i--) {          
	tb.removeRow(tb.getRowCount()-1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formulario_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btonConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtaProductos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
