
package Formularios;

import Utilidades.Caja_Utilidades;
import Clases.Caja;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cierre_Caja extends javax.swing.JFrame {

    public Cierre_Caja() {
        initComponents();
        Tabla();
        this.getContentPane().setBackground(new Color(0,51,51));
        this.setLocationRelativeTo(rootPane);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboCaja = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnsalir3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("CIERRE DE CAJA ");

        comboCaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caja1", "Caja2" }));
        comboCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCajaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("TOTAL EN CAJA");

        txtCaja.setEditable(false);
        txtCaja.setBackground(new java.awt.Color(0, 0, 0));
        txtCaja.setForeground(new java.awt.Color(204, 204, 0));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("VACIAR CAJA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnsalir3.setBackground(new java.awt.Color(51, 51, 51));
        btnsalir3.setForeground(new java.awt.Color(255, 255, 0));
        btnsalir3.setText("MENU");
        btnsalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalir3)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(comboCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnsalir3))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       File f =new File("src\\Archivos\\caja.txt");
       if(f.delete()){
           JOptionPane.showMessageDialog(rootPane, "CAJA CERRADA");
           Tabla();
       }else{
           JOptionPane.showMessageDialog(rootPane, "error");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCajaActionPerformed
      Tabla();
    }//GEN-LAST:event_comboCajaActionPerformed

    private void btnsalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir3ActionPerformed
        Menu mn= new Menu();
        mn.show();
        dispose();
    }//GEN-LAST:event_btnsalir3ActionPerformed
    public void Tabla(){
    
        String columnas[]={"CAJA","BILLETES","CANTIDAD","MONEDAS","CANTIDAD"};
        DefaultTableModel tm=new DefaultTableModel(null,columnas);
        
        try {
            Caja c = new Caja();
            Caja_Utilidades cu = new Caja_Utilidades();
            cu.setRuta("src\\Archivos\\caja.txt");
            
            List<Caja> lista = cu.leerCaja();
            String caja="";
            Double total=0.0;
            if(comboCaja.getSelectedItem().toString().equals("Caja1")){caja="1";}
            if(comboCaja.getSelectedItem().toString().equals("Caja2")){caja="2";}    
            
                for(Caja e : lista){
                    
                    if(e.getCaja().equals(caja)){
                       
                        String registros[]={e.getCaja(),Integer.toString(e.getBillete()),Integer.toString(e.getCantidadBillete()),e.getMoneda().toString(),Integer.toString(e.getCantidadMoneda())};
                        tm.addRow(registros);
                        if(e.getMoneda()!=1){
                        total+=(e.getBillete()*e.getCantidadBillete()) + (e.getMoneda() *e.getCantidadMoneda()/100);
                        }else{total+=(e.getBillete()*e.getCantidadBillete()) + (e.getMoneda() *e.getCantidadMoneda());}
                    }
                }
            
                jTable1.setModel(tm);
                txtCaja.setText(total.toString());
        
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(Cierre_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cierre_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cierre_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cierre_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cierre_Caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir3;
    private javax.swing.JComboBox<String> comboCaja;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCaja;
    // End of variables declaration//GEN-END:variables
}
