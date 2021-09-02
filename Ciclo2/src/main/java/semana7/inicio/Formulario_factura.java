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
public class Formulario_factura extends javax.swing.JFrame {

    /**
     * Creates new form Formulario_factura
     */
    ArrayList<Producto> arregloProductos = new ArrayList<Producto>();
    public Formulario_factura() {
        initComponents();
        llenarComboBoxCliente();
        llenarComboBoxProducto();
    }

    public void llenarComboBoxCliente(){
        cmbCliente.removeAllItems();
        ArrayList<Cliente> arrayListCliente = new ArrayList<Cliente>();
        Cliente objeto_cliente = new Cliente();
        arrayListCliente = objeto_cliente.getCliente();
        Iterator<Cliente> iteratorCliente = arrayListCliente.iterator();
        
        while(iteratorCliente.hasNext())
        {
            Cliente obj_cliente = iteratorCliente.next();
            //cmbCliente.addItem(obj_cliente.getNombre());
            cmbCliente.addItem(new Item(obj_cliente.getId(), obj_cliente.getNombre()));

        }
        
    }

    public   void  llenarComboBoxProducto(){
        cmbProductos.removeAllItems();
        ArrayList<Producto> arrayListProducto = new ArrayList<Producto>();
        Producto objeto_producto = new Producto();
        arrayListProducto = objeto_producto.getProductos();
        Iterator<Producto> iteratorProducto = arrayListProducto.iterator();
        
        while(iteratorProducto.hasNext()){
            Producto obj_producto = iteratorProducto.next();
            cmbProductos.addItem(new Item(obj_producto.getId(), obj_producto.getNombre()));
        }
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbProductos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnGenerarFactura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProductos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Compra"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ingresar Valores para realizar factura");

        jLabel2.setText("Seleccionar producto");

        cmbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Seleccionar cliente");

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad");

        jButton1.setText("Añadir a carrito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbProductos, 0, 175, Short.MAX_VALUE)
                    .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(btnGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGenerarFactura))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jtbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_producto", "nombre_producto", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbProductos);

        jMenu1.setText("Tienda");

        jMenuItem1.setText("Crear Productos");
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
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        // TODO add your handling code here:
        
        Item item = (Item) cmbCliente.getSelectedItem();
        //System.out.println("selecciono el cliente con cedula "+item.getId());
        Factura objeto_factura = new Factura();
        objeto_factura.setId_cliente(item.getId());
        
        int numeroFactura = objeto_factura.getNumeroFactura();
        objeto_factura.setId(numeroFactura);
        
        boolean bolIngresoInformacion= false;
        bolIngresoInformacion=objeto_factura.ingresar_factura();
        if(bolIngresoInformacion)
        {
            JOptionPane.showMessageDialog(rootPane, "Se genero la factura "+numeroFactura+ " correctamente");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Se presento un error al generar la factura ");
        }
        
        
        
        //ingresar los producto
        /*DefaultTableModel modeloTabla;
        modeloTabla = (DefaultTableModel) jtbProductos.getModel();
        int totalColumnas = modeloTabla.getColumnCount();
        int totalFilas = modeloTabla.getRowCount();*/
        /*for(int i=0; i<totalFilas; i++){
            for(int j=0; j<)
        }*/
         Iterator<Producto> iterator_producto= arregloProductos.iterator();
        while(iterator_producto.hasNext())
        {
            Producto objProducto = iterator_producto.next();
            System.out.println("id producto "+objProducto.getId());
            System.out.println("cantidad "+objProducto.getCantidad());
            objeto_factura.ingresar_factura_producto(numeroFactura, objProducto.getId() , objProducto.getCantidad());
        }
        
        
        
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    private void cmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Item itemProducto = (Item)cmbProductos.getSelectedItem();
        int intIdProducto = itemProducto.getId();
        String strNombreProducto = itemProducto.getNombre();
        int intCantidadProducto = Integer.parseInt(txtCantidad.getText());
        DefaultTableModel modeloTabla;
        modeloTabla = (DefaultTableModel)jtbProductos.getModel();
        Object[] arregloObjetosProducto = new Object[3];
        arregloObjetosProducto[0] = intIdProducto;
        arregloObjetosProducto[1] = strNombreProducto;
        arregloObjetosProducto[2] = intCantidadProducto;
        
        modeloTabla.addRow(arregloObjetosProducto);
        arregloProductos.add(new Producto(intIdProducto, intCantidadProducto));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        formulario_producto obj_formulario_producto = new formulario_producto();
        obj_formulario_producto.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JComboBox<Object> cmbCliente;
    private javax.swing.JComboBox<Object> cmbProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbProductos;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
