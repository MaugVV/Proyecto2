package Formularios;

import Clases.Empleados;
import Utilidades.Empleado_Utilidades;
import Utilidades.vld_textbox;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Frm_Empleado extends javax.swing.JFrame {

    public Frm_Empleado() {
        initComponents();
        tabla();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdirec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        txtsalario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_em = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        busc = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txtsexo = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        date_fecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel2.setText("sexo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, -1));

        cbTipo.setBackground(new java.awt.Color(51, 0, 255));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecionar", "CEDULA", "RUC", "PASAPORTE" }));
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 180, 30));

        jLabel3.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel3.setText("Fecha de ingreso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 210, 30));

        jLabel4.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel4.setText("Identificación:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 320, 30));

        jLabel5.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel5.setText("Nombres:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));
        getContentPane().add(txtdirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 470, 30));

        jLabel6.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel7.setText("Ciudad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel8.setText("Teléfono");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel9.setText("Correo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel10.setText("Cargo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel11.setText("Codigo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));
        getContentPane().add(txtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 200, 30));

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 200, 30));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 190, 30));
        getContentPane().add(txtcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 200, 30));

        txtsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 200, 30));

        Tabla_em.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        Tabla_em.getTableHeader().setResizingAllowed(false);
        Tabla_em.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla_em);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 840, 200));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setOpaque(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 110, 40));

        jLabel12.setFont(new java.awt.Font("Niagara Solid", 1, 48)); // NOI18N
        jLabel12.setText("Empleados");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1487471430_user-group-new.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        busc.setText("BUSCAR");
        busc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscActionPerformed(evt);
            }
        });
        getContentPane().add(busc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 263, 90, 30));

        jLabel14.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel14.setText("Salario:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 100, 30));

        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 255));
        btnModificar.setText("Modificar");
        btnModificar.setOpaque(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, 38));

        btnInsertar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(0, 0, 255));
        btnInsertar.setText("Guardar");
        btnInsertar.setBorderPainted(false);
        btnInsertar.setOpaque(false);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 38));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 830, 10));

        jLabel15.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel15.setText("Número:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));
        getContentPane().add(txtsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 40, 30));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, 50, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Hora:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel16.setText("Edad");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, -1, -1));
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 40, 30));
        getContentPane().add(date_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoazulceleste.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (!camposllenos()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            return;
        }
        try {
            Empleado_Utilidades eu = new Empleado_Utilidades();
            eu.setRuta("src\\Archivos\\empleados.txt");
            //List<Medicos> lista = new ArrayList();
            for (Empleados elem : empleados) {
                if (txtcodigo.getText().equals(elem.getCodigo())) {
                    JOptionPane.showMessageDialog(rootPane, "Paciente ya Registrado!!");
                    return;
                }
            }
            Empleados e = new Empleados();

            e.setCargo(txtcargo.getText());
            e.setCedula(txtcedula.getText());
            e.setCiudad(txtciudad.getText());
            e.setCodigo(txtcodigo.getText());
            e.setCorreo(txtcorreo.getText());
            e.setDireccion(txtdirec.getText());
            e.setEdad(txtedad.getText());
            e.setTelefono(txttelefono.getText());
            e.setFecha_registro(String.valueOf(date_fecha.getCalendar().get(Calendar.DAY_OF_MONTH)) + "/" + String.valueOf(date_fecha.getCalendar().get(Calendar.MONTH) + 1) + "/" + String.valueOf(date_fecha.getCalendar().get(Calendar.YEAR)).toString());
            e.setGenero(txtsexo.getText());
            e.setNombres(txtnombre.getText());
            e.setSalario(Double.parseDouble(txtsalario.getText()));
            e.setTipo_doc(cbTipo.getSelectedItem().toString());
            empleados.add(e);
            Empleado_Utilidades mun = new Empleado_Utilidades();
            mun.setRuta("src\\Archivos\\empleados.txt");
            mun.guardarEmpleado(empleados);
            JOptionPane.showMessageDialog(null, "Guardado con éxito!!");
            borrar();
            tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    

    public Boolean camposllenos() {
        JTextField campos[] = {txtcargo, txtcedula, txtciudad, txtcodigo, txtcorreo, txtdirec, txtedad, txtnombre, txtsalario, txtsexo, txttelefono};
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

    public static String fechaActual() {
        Date Fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(Fecha);
    }

    
    public void cargarPacientes() {
        File f = new File("src\\Archivos\\empleados.txt");
        try {

            if (f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                empleados = (ArrayList<Empleados>) ois.readObject();
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
        txtcargo.setText("");
        txtcedula.setText("");
        txtciudad.setText("");
        txtcodigo.setText("");
        txtcorreo.setText("");
        txtdirec.setText("");
        txtedad.setText("");
        txtnombre.setText("");
        txtsalario.setText("");
        txtsexo.setText("");
        txttelefono.setText("");
        cbTipo.setSelectedItem("");
        date_fecha.setDate(new Date());
    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (!camposllenos()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            return;
        }
        try {
            remover:
            for (Empleados elem : empleados) {
               
                if (txtcodigo.getText().trim().equals(elem.getCodigo())) {
                    empleados.remove(elem);
                    break remover;
                }
            }
        } catch (Exception e) {
        }

        try {
            Empleados e = new Empleados();
            e.setCargo(txtcargo.getText());
            e.setCedula(txtcedula.getText());
            e.setCiudad(txtciudad.getText());
            e.setCodigo(txtcodigo.getText());
            e.setCorreo(txtcorreo.getText());
            e.setDireccion(txtdirec.getText());
            e.setEdad(txtedad.getText());
            e.setTelefono(txttelefono.getText());
            e.setFecha_registro(String.valueOf(date_fecha.getCalendar().get(Calendar.DAY_OF_MONTH)) + "/" + String.valueOf(date_fecha.getCalendar().get(Calendar.MONTH) + 1) + "/" + String.valueOf(date_fecha.getCalendar().get(Calendar.YEAR)).toString());
            e.setGenero(txtsexo.getText());
            e.setNombres(txtnombre.getText());
            e.setSalario(Double.parseDouble(txtsalario.getText()));
            e.setTipo_doc(cbTipo.getSelectedItem().toString());
            empleados.add(e);
            Empleado_Utilidades eu = new Empleado_Utilidades();
            eu.setRuta("src\\Archivos\\empleados.txt");

            eu.guardarEmpleado(empleados);

            JOptionPane.showMessageDialog(null, "Guardado con éxito!!");
            borrar();
            tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Empleado_Utilidades eu = new Empleado_Utilidades();
        eu.setRuta("src\\Archivos\\empleados.txt");

        for (Empleados elem : empleados) {

            if (codigo.equals(elem.getCodigo())) {
                empleados.remove(elem);
                eu.guardarEmpleado(empleados);

                JOptionPane.showMessageDialog(null, "Eliminado!!");
                borrar();
                tabla();
                return;
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalarioActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        dispose();
        Menu inter = new Menu();
        inter.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void buscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscActionPerformed
       
        Boolean confirma = false;
        for (Empleados elem : empleados) {
            if (txtcodigo.getText().equals(elem.getCodigo())) {
                codigo = elem.getCodigo();
                txtcargo.setText(elem.getCargo());
                txtcedula.setText(elem.getCedula());
                txtciudad.setText(elem.getCiudad());
                txtcorreo.setText(elem.getCorreo());
                txtdirec.setText(elem.getDireccion());
                txtedad.setText(elem.getEdad());
                txtnombre.setText(elem.getNombres());
                txtsalario.setText(elem.getSalario().toString());
                txtsexo.setText(elem.getGenero());
                txttelefono.setText(elem.getTelefono());
                cbTipo.setSelectedItem(elem.getTipo_doc());
                confirma=true;
                //date_fecha.setDate(elem.getFecha_registro());
            } 
        }        // TODO add your handling code here:
        if(!confirma) {
                JOptionPane.showMessageDialog(null, "CEDULA NO REGISTRADA");
        }
    }//GEN-LAST:event_buscActionPerformed

    public void tabla() {

        String columnas[] = {"CODIGO", "TIPO DOCUMENTO" , "CEDULA", "NOMBRE", "EDAD", "GENERO", "DIRECCION" , "CIUDAD" , "TELEFONO" , "CORREO" , "CARGO" , "SALARIO" , "FECHA INGRESO"};
        DefaultTableModel tm = new DefaultTableModel(null, columnas);

        Empleado_Utilidades eu = new Empleado_Utilidades();
        eu.setRuta("src\\Archivos\\empleados.txt");

        List<Empleados> lista = new ArrayList();

        try {
            lista = eu.consultarEmpleados();

            for (Empleados elem : lista) {

                String registros[] = {elem.getCodigo(),elem.getTipo_doc(),elem.getCedula(), elem.getNombres(), elem.getEdad(), elem.getGenero(), elem.getDireccion(), elem.getCiudad(),elem.getTelefono(),elem.getCorreo(),elem.getCargo(),elem.getSalario().toString(),elem.getFecha_registro()};
                tm.addRow(registros);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "error");
        }

        Tabla_em.setModel(tm);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarPacientes();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Empleado().setVisible(true);
            }
        });
    }
    ArrayList<Empleados> empleados = new ArrayList();
    String codigo;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_em;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton busc;
    private javax.swing.JComboBox<String> cbTipo;
    private com.toedter.calendar.JDateChooser date_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdirec;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsalario;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}
