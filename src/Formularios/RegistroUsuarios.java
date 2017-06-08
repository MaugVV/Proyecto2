
package Formularios;

import Clases.Empleados;
import Utilidades.Usuarios_Utilidades;

import Clases.Usuarios;
import Utilidades.Empleado_Utilidades;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistroUsuarios extends javax.swing.JFrame {


    public RegistroUsuarios() {
        initComponents();
        cerrar();
        setLocationRelativeTo(null);
        Cargar();
        t1.setText(fechaActual());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        t3 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 3, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE USUARIOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 3, 18)); // NOI18N
        jLabel2.setText("EMPLEADO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 114, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 3, 18)); // NOI18N
        jLabel3.setText("FECHA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 3, 18)); // NOI18N
        jLabel4.setText("USUARIO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 3, 18)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("Candara", 3, 18)); // NOI18N
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 133, -1));

        t2.setFont(new java.awt.Font("Candara", 3, 18)); // NOI18N
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 133, -1));

        jButton3.setFont(new java.awt.Font("Candara", 3, 14)); // NOI18N
        jButton3.setText("GUARDAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 100, -1));

        jButton5.setFont(new java.awt.Font("Candara", 3, 14)); // NOI18N
        jButton5.setText("MENU");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 130, 30));

        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cerrar(){
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                      public void windowClosing(WindowEvent e){
                          confirmarSalida();
                          
                      }
            });
            this.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }
    
    public void confirmarSalida(){
        int valor = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO DE CERRAR el PROGRAMA?" , "ADVERTENCIA" , JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor==JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null, "GRACIAS POR SU VISITA" , "GRACIAS", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Menu i = new Menu();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Usuarios u = new Usuarios();
        u.setEmpleado(jComboBox1.getSelectedItem().toString());
        u.setFecha(t1.getText());
        u.setUsuario(t2.getText());
        u.setContraseña(t3.getText());
        
        usuarios.add(u);
        Usuarios_Utilidades uu=new Usuarios_Utilidades();
        uu.setRuta("src\\Archivos\\usuarios.txt");
        uu.guardar(usuarios);
        JOptionPane.showMessageDialog(rootPane,"GUARDADO");
        t2.setText("");
        t3.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new RegistroUsuarios().setVisible(true);
            }
        });
    }
public void Cargar(){
    
        
        
        Empleado_Utilidades vu = new Empleado_Utilidades();
        vu.setRuta("src\\Archivos\\empleados.txt");
        Usuarios_Utilidades uu=new Usuarios_Utilidades();
        uu.setRuta("src\\Archivos\\usuarios.txt");
        
        List<Empleados> lista = new ArrayList();
        
        try {
            lista=vu.consultarEmpleados();
            usuarios=uu.leer();
            for (Empleados elem : lista) {
                
              jComboBox1.addItem(elem.getNombres());
                
        }
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
            
            
            
        
    }
   public static String fechaActual() {
        Date Fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(Fecha);

    }
ArrayList<Usuarios> usuarios = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JPasswordField t3;
    // End of variables declaration//GEN-END:variables
}
