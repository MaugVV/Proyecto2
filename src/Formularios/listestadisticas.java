
package Formularios;

import Utilidades.Detalle_Utilidades;
import Utilidades.Factura_Utilidades;
import Clases.Detalle;
import Clases.Factura;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



public class listestadisticas extends javax.swing.JFrame {

    public listestadisticas() {
        initComponents();
       tabla();
       this.getContentPane().setBackground(new Color(0,51,51));
        this.setLocationRelativeTo(rootPane);
    }

    



    public void tabla(){
        String prod = "",clien = "";
        Double max=0.0;
        int n=0,can=0;
        
        String columnas[]={"MEJOR CLIENTE","PRODUCTO MAS VENDIDO","VENTA MAXIMA"};
        DefaultTableModel tm=new DefaultTableModel(null,columnas);
        
        Factura f = new Factura();
        Factura_Utilidades uf = new Factura_Utilidades();
        uf.setRuta("src\\Archivos\\facturas.txt");
        List<Factura> facturas = new ArrayList();
        try {
            facturas=uf.leerFactura();
        } catch (IOException ex) {
            Logger.getLogger(listestadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        for (Factura elem : facturas) {

             if(max<elem.getTotal()){
                       max=elem.getTotal(); 
                  
                  clien=elem.getCedula_cliente();
                
                  }   
        }
       
            Detalle d = new Detalle();
            Detalle_Utilidades du = new Detalle_Utilidades();
            du.setRuta("src\\Archivos\\detalles.txt");
            List<Detalle> detalle = new ArrayList();
        try {
            detalle=du.leerCliente();
        } catch (IOException ex) {
            Logger.getLogger(listestadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            for (Detalle elem : detalle) {
                if(can<elem.getCantidad()){
                    can=elem.getCantidad();
                    prod=elem.getServicio();
                }
            } 

             String registro []={clien,prod,max.toString()};   
             tm.addRow(registro);
            TablaCliente.setModel(tm);
 
    } 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnsalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 0));

        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaCliente);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ESTADISTICAS");

        btnsalir1.setText("MENU");
        btnsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnsalir1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalir1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir1ActionPerformed
        Menu mn= new Menu();
        mn.show();
        dispose();
    }//GEN-LAST:event_btnsalir1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(listestadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listestadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listestadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listestadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listestadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JButton btnsalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
