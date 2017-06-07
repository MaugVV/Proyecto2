package Formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Login extends javax.swing.JFrame {

     private Timer tiempo;
    int cont; //contador
    public final static int TWO_SECOND = 3;
    
    public Login() {
        initComponents();
        cerrar();
        setLocationRelativeTo(null);
        Barrita.setVisible(false);
    }

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static abstract class TImerListener implements ActionListener {
        public TImerListener() {
        }
    }
    
    class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            cont++;
            Barrita.setValue(cont);
            if (cont == 100) {
                tiempo.stop();
                esconder();
                Menu fm = new Menu();
                fm.setVisible(true);
                setVisible(false);
            }
        }
    }

    public void esconder() {
        this.setVisible(false);
    }

    public void activar() {
        tiempo.start();
    }
    
    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO DE CERRAR el PROGRAMA?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_NO_OPTION) {
            JOptionPane.showMessageDialog(null, "GRACIAS POR SU VISITA", "GRACIAS", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }

    public void inicioSesion() {
        String usuario = "admin";
        String contra = "admin";

        if (usuario.equals(txt_usuario.getText()) && contra.equals(txt_contra.getText())) {
            Barrita.setVisible(true);
            cont = -1;
            Barrita.setValue(0);
            Barrita.setStringPainted(true);
            tiempo = new Timer(TWO_SECOND, new TimerListener());
            activar();
            //JOptionPane.showMessageDialog(null, "Acceso Correcto");

        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar Usuario o Contraseña INCORRECTA", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            //limpiar cajas de texto
            txt_contra.setText(null);
            txt_usuario.setText(null);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_contra = new javax.swing.JPasswordField();
        Barrita = new javax.swing.JProgressBar();
        btn_login = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel_icono = new javax.swing.JLabel();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USUARIO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONTRASEÑA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txt_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraActionPerformed(evt);
            }
        });
        txt_contra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contraKeyPressed(evt);
            }
        });
        getContentPane().add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 170, -1));

        Barrita.setBackground(new java.awt.Color(0, 102, 255));
        Barrita.setForeground(new java.awt.Color(255, 102, 51));
        getContentPane().add(Barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 320, 20));

        btn_login.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(0, 51, 51));
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        btn_exit.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(0, 51, 51));
        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 110, 30));

        jLabel_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jLabel_icono.setText("jLabel1");
        getContentPane().add(jLabel_icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 240, 220));

        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_blue.jpg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyTyped

    }//GEN-LAST:event_txt_usuarioKeyTyped

    private void txt_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraActionPerformed

    private void txt_contraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            inicioSesion();
        }
    }//GEN-LAST:event_txt_contraKeyPressed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        inicioSesion();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        //solo cierra una sola ventana
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barrita;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JLabel jLabel_icono;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
