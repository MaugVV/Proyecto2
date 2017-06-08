package Formularios;

import Utilidades.Cliente_Utilidades;
import Utilidades.vld_textbox;
import Clases.Clientes;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frm_Cliente extends javax.swing.JFrame {

    ArrayList<Clientes> clientes = new ArrayList<>();
    String cedula;

    public Frm_Cliente() {
        initComponents();
        this.getContentPane().setBackground(new Color(0, 51, 51));
        this.setLocationRelativeTo(rootPane);
        this.setLocationRelativeTo(null);
    }

    public void cargarClientes() {
        File f = new File("src\\Archivos\\clientes.txt");
        try {

            if (f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                clientes = (ArrayList<Clientes>) ois.readObject();
                fis.close();
                ois.close();
                System.out.println("archivo cargado");
            } else {
                f.createNewFile();
                System.out.println("archivo creado");
            }
        } catch (Exception e) {
        }
    }

    public void borrar() {
        txtcedula.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtedad.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnbusqueda = new javax.swing.JButton();
        btnsalir2 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Niagara Solid", 1, 48)); // NOI18N
        jLabel1.setText("REGISTRO DE CLIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnguardar.setBackground(new java.awt.Color(51, 51, 51));
        btnguardar.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 91, -1));

        btnmodificar.setBackground(new java.awt.Color(51, 51, 51));
        btnmodificar.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        btneliminar.setBackground(new java.awt.Color(51, 51, 51));
        btneliminar.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 91, -1));

        btnbusqueda.setBackground(new java.awt.Color(51, 51, 51));
        btnbusqueda.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        btnbusqueda.setText("BUSCAR POR CÉDULA");
        btnbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(btnbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 188, -1));

        btnsalir2.setBackground(new java.awt.Color(51, 51, 51));
        btnsalir2.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        btnsalir2.setText("MENU");
        btnsalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 91, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        jLabel2.setText("Cedula");

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        jLabel4.setText("Apellido:");

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        jLabel5.setText("Dirección:");

        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        jLabel6.setText("Teléfono:");

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        jLabel8.setText("Edad");

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtcedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtapellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtedad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txttelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtdireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 330, 260));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1487471430_user-group-new.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoazulceleste.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (!camposllenos()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            return;
        }
        try {

            Cliente_Utilidades co = new Cliente_Utilidades();
            co.setRuta("src\\Archivos\\clientes.txt");

            for (Clientes elem : clientes) {
                if (txtcedula.getText().equals(elem.getCedula())) {

                    JOptionPane.showMessageDialog(rootPane, "Cliente ya Existente!!");
                    return;

                }
            }
            Clientes c = new Clientes();

            c.setCedula(txtcedula.getText());
            c.setNombre(txtnombre.getText());
            c.setApellido(txtapellido.getText());
            c.setDireccion(txtdireccion.getText());
            c.setTelefono(txttelefono.getText());
            c.setEdad(txtedad.getText());

            clientes.add(c);

            Cliente_Utilidades cu = new Cliente_Utilidades();
            cu.setRuta("src\\Archivos\\clientes.txt");

            cu.guardarCliente(clientes);

            JOptionPane.showMessageDialog(null, "Guardado con éxito!!");
            borrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error" + e.toString());
        }


    }//GEN-LAST:event_btnguardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarClientes();
    }//GEN-LAST:event_formWindowOpened

    private void btnbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusquedaActionPerformed

        Boolean confirma = false;
        for (Clientes elem : clientes) {
            if (txtcedula.getText().equals(elem.getCedula())) {
                cedula = elem.getCedula();
                txtnombre.setText(elem.getNombre());
                txtapellido.setText(elem.getApellido());
                txtdireccion.setText(elem.getDireccion());
                txttelefono.setText(elem.getTelefono());
                txtedad.setText(elem.getEdad());
                confirma=true;
            }
        }
        if (!confirma) {
            JOptionPane.showMessageDialog(null, "CEDULA NO REGISTRADA");
        }
    }//GEN-LAST:event_btnbusquedaActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (!camposllenos()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            return;
        }
        try {
            remover:
            for (Clientes elem : clientes) {

                if (txtcedula.equals(elem.getCedula())) {
                    clientes.remove(elem);
                    break remover;
                }
            }
        } catch (Exception e) {
        }

        try {
            Clientes c = new Clientes();
            c.setCedula(txtcedula.getText());
            c.setNombre(txtnombre.getText());
            c.setApellido(txtapellido.getText());
            c.setDireccion(txtdireccion.getText());
            c.setTelefono(txttelefono.getText());
            c.setEdad(txtedad.getText());

            clientes.add(c);

            Cliente_Utilidades cu = new Cliente_Utilidades();
            cu.setRuta("src\\Archivos\\clientes.txt");

            cu.guardarCliente(clientes);

            JOptionPane.showMessageDialog(null, "Guardado con éxito!!");
            borrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Cliente_Utilidades cu = new Cliente_Utilidades();
        cu.setRuta("src\\Archivos\\clientes.txt");

        for (Clientes elem : clientes) {

            if (cedula.equals(elem.getCedula())) {
                clientes.remove(elem);
                cu.guardarCliente(clientes);

                JOptionPane.showMessageDialog(null, "Eliminado!!");
                borrar();
                return;
            }
        }

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir2ActionPerformed
        dispose();
        Menu mcli = new Menu();
        mcli.setVisible(true);
    }//GEN-LAST:event_btnsalir2ActionPerformed

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        new vld_textbox().soloLetras(evt);
    }//GEN-LAST:event_txtedadKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        new vld_textbox().soloNumeros(evt);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyTyped

    public Boolean camposllenos() {
        JTextField campos[] = {txtapellido, txtcedula, txtdireccion, txtnombre, txttelefono};
        if (new vld_textbox().camposLlenos(campos)) {
            if (new vld_textbox().validaCedula(txtcedula.getText())) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "INGRESE UNA CEDULA VALIDA");
                return false;
            }
        }

        return false;
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
            java.util.logging.Logger.getLogger(Frm_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbusqueda;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
