package Formularios;

import Clases.Inventarios;
import Utilidades.Inventario_Utilidades;
import Utilidades.vld_textbox;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Frm_Inventario extends javax.swing.JFrame {

    public Frm_Inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        Disable();
        
    }

    public void borrar() {
        txtcode.setText("");
        txtnombre.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtcantidad.setText("");
        txtprecio.setText("");
        txtcos.setText("");
        txtven.setText("");
        txtdes.setText("");
        date_fecha.setDate(new Date());
    }

    public void cargarClientes() {
        File f = new File("src\\Archivos\\inventarios.txt");
        try {

            if (f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                inventarios = (ArrayList<Inventarios>) ois.readObject();
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nuev = new javax.swing.JButton();
        guarda = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        txtcos = new javax.swing.JTextField();
        txtven = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_pro = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date_fecha = new com.toedter.calendar.JDateChooser();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Niagara Solid", 1, 48)); // NOI18N
        jLabel2.setText("Nuevo producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 240, -1));

        nuev.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        nuev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        nuev.setText("Nuevo");
        nuev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevActionPerformed(evt);
            }
        });
        getContentPane().add(nuev, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 100, 40));

        guarda.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        guarda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save_over.png"))); // NOI18N
        guarda.setText("Guardar");
        guarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardaActionPerformed(evt);
            }
        });
        getContentPane().add(guarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 110, 40));

        eliminar.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        eliminar.setText("Cancelar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 110, 40));

        salir.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1487472258_Exit.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 110, 40));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        jLabel4.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel4.setText("Código");
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(10, 20, 41, 26);

        txtcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodeKeyTyped(evt);
            }
        });
        jLayeredPane1.add(txtcode);
        txtcode.setBounds(70, 20, 230, 30);

        jLabel5.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel5.setText("Modelo");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(10, 140, 50, 26);

        jLabel9.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel9.setText("Nombre ");
        jLayeredPane1.add(jLabel9);
        jLabel9.setBounds(10, 60, 60, 26);

        jLabel10.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel10.setText("Marca");
        jLayeredPane1.add(jLabel10);
        jLabel10.setBounds(10, 100, 50, 26);
        jLayeredPane1.add(txtmodelo);
        txtmodelo.setBounds(70, 140, 230, 30);

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        jLayeredPane1.add(txtcantidad);
        txtcantidad.setBounds(70, 180, 230, 30);

        jLabel6.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel6.setText("Cantidad");
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(10, 180, 70, 26);

        jLabel7.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel7.setText("Precio");
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(10, 220, 50, 26);

        jLabel3.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel3.setText("Descripción");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(110, 350, 80, 26);

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        jLayeredPane1.add(txtprecio);
        txtprecio.setBounds(70, 220, 230, 30);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jLayeredPane1.add(txtnombre);
        txtnombre.setBounds(70, 60, 230, 30);
        jLayeredPane1.add(txtmarca);
        txtmarca.setBounds(70, 100, 230, 30);

        jLabel11.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel11.setText("Costo compra");
        jLayeredPane1.add(jLabel11);
        jLabel11.setBounds(10, 260, 90, 26);
        jLayeredPane1.add(txtdes);
        txtdes.setBounds(20, 380, 280, 90);

        txtcos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcosKeyTyped(evt);
            }
        });
        jLayeredPane1.add(txtcos);
        txtcos.setBounds(110, 260, 190, 30);

        txtven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvenKeyTyped(evt);
            }
        });
        jLayeredPane1.add(txtven);
        txtven.setBounds(110, 300, 190, 30);

        jLabel12.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jLabel12.setText("Costo venta");
        jLayeredPane1.add(jLabel12);
        jLabel12.setBounds(10, 300, 80, 26);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 480));

        Table_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        Table_pro.getTableHeader().setResizingAllowed(false);
        Table_pro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table_pro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 540, 320));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Hora:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        jLabel8.setText("Fecha");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        getContentPane().add(date_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 80, 40));

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoazulceleste_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardaActionPerformed
        if (!camposllenos()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            return;
        }
        try {
            Inventario_Utilidades iu = new Inventario_Utilidades();
            iu.setRuta("src\\Archivos\\inventarios.txt");
            //List<Medicos> lista = new ArrayList();
            for (Inventarios elem : inventarios) {
                if (txtcode.getText().equals(elem.getCodigo())) {
                    JOptionPane.showMessageDialog(rootPane, "Paciente ya Registrado!!");
                    return;
                }
            }
            Inventarios i = new Inventarios();
            i.setCantidad(Integer.parseInt(txtcantidad.getText()));
            i.setCodigo(txtcode.getText());
            i.setCostoCompra(Double.parseDouble(txtcos.getText()));
            i.setCostoVenta(Double.parseDouble(txtven.getText()));
            i.setDescripcion(txtdes.getText());
            i.setFecha(String.valueOf(date_fecha.getCalendar().get(Calendar.DAY_OF_MONTH)) + "/" + String.valueOf(date_fecha.getCalendar().get(Calendar.MONTH) + 1) + "/" + String.valueOf(date_fecha.getCalendar().get(Calendar.YEAR)).toString());
            i.setMarca(txtmarca.getText());
            i.setModelo(txtmodelo.getText());
            i.setNombre(txtnombre.getText());
            i.setPrecio(Double.parseDouble(txtprecio.getText()));
            inventarios.add(i);
            Inventario_Utilidades mun = new Inventario_Utilidades();
            mun.setRuta("src\\Archivos\\inventarios.txt");
            mun.guardarInventario(inventarios);
            JOptionPane.showMessageDialog(null, "Guardado con éxito!!");
            borrar();
            tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_guardaActionPerformed

    public static String fechaActual() {
        Date Fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(Fecha);
    }
    
    public void cargarInventarios() {
        File f = new File("src\\Archivos\\inventarios.txt");
        try {

            if (f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                inventarios = (ArrayList<Inventarios>) ois.readObject();
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
    
    public Boolean camposllenos() {
        JTextField campos[] = {txtcantidad, txtcode, txtcos, txtdes, txtmarca, txtmodelo, txtprecio, txtnombre, txtven};
        if (new vld_textbox().camposLlenos(campos)) {
            return true;
        }
        return false;
    }
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
        Menu inv = new Menu();
        inv.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void nuevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevActionPerformed
        txtcode.enable(true);
        txtnombre.enable(true);
        txtmarca.enable(true);
        txtmodelo.enable(true);
        txtcantidad.enable(true);
        txtprecio.enable(true);
        txtcos.enable(true);
        txtven.enable(true);
        txtdes.enable(true);
        date_fecha.enable(true);        // TODO add your handling code here:
    }//GEN-LAST:event_nuevActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (!camposllenos()) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            return;
        }
        try {
            remover:
            for (Inventarios elem : inventarios) {
               
                if (txtcode.getText().trim().equals(elem.getCodigo())) {
                    inventarios.remove(elem);
                    break remover;
                }
            }
        } catch (Exception e) {
        }

        try {
            Inventarios i = new Inventarios();
            i.setCantidad(Integer.parseInt(txtcantidad.getText()));
            i.setCodigo(txtcode.getText());
            i.setCostoCompra(Double.parseDouble(txtcos.getText()));
            i.setCostoVenta(Double.parseDouble(txtven.getText()));
            i.setDescripcion(txtdes.getText());
            i.setFecha(String.valueOf(date_fecha.getCalendar().get(Calendar.DAY_OF_MONTH)) + "/" + String.valueOf(date_fecha.getCalendar().get(Calendar.MONTH) + 1) + "/" + String.valueOf(date_fecha.getCalendar().get(Calendar.YEAR)).toString());
            i.setMarca(txtmarca.getText());
            i.setModelo(txtmodelo.getText());
            i.setNombre(txtnombre.getText());
            i.setPrecio(Double.parseDouble(txtprecio.getText()));
            inventarios.add(i);
            Inventario_Utilidades mun = new Inventario_Utilidades();
            mun.setRuta("src\\Archivos\\inventarios.txt");
            mun.guardarInventario(inventarios);
            JOptionPane.showMessageDialog(null, "Guardado con éxito!!");
            borrar();
            tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        Inventario_Utilidades eu = new Inventario_Utilidades();
        eu.setRuta("src\\Archivos\\inventarios.txt");

        for (Inventarios elem : inventarios) {

            if (codigo.equals(elem.getCodigo())) {
                inventarios.remove(elem);
                eu.guardarInventario(inventarios);

                JOptionPane.showMessageDialog(null, "Eliminado!!");
                borrar();
                tabla();
                return;
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Boolean confirma = false;
        for (Inventarios elem : inventarios) {
            if (txtcode.getText().equals(elem.getCodigo())) {
                codigo = elem.getCodigo();
                txtcantidad.setText(String.valueOf(elem.getCantidad()));
                txtcos.setText(elem.getCostoCompra().toString());
                txtdes.setText(elem.getDescripcion());
                txtmarca.setText(elem.getMarca());
                txtmodelo.setText(elem.getModelo());
                txtnombre.setText(elem.getNombre());
                txtprecio.setText(elem.getPrecio().toString());
                txtven.setText(elem.getCostoVenta().toString());
                confirma=true;
                //date_fecha.setDate(elem.getFecha_registro());
            } 
        }        // TODO add your handling code here:
        if(!confirma) {
                JOptionPane.showMessageDialog(null, "CEDULA NO REGISTRADA");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarInventarios();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void txtcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodeKeyTyped
        new vld_textbox().soloNumeros(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodeKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        new vld_textbox().soloLetras(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        new vld_textbox().soloNumeros(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        new vld_textbox().soloNumeros(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtcosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcosKeyTyped
        new vld_textbox().soloNumeros(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtcosKeyTyped

    private void txtvenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvenKeyTyped
        new vld_textbox().soloNumeros(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtvenKeyTyped

    public void tabla() {

        String columnas[] = {"CODIGO", "NOMBRE" , "MARCA", "MODELO", "CANTIDAD", "PRECIO", "COSTO COMPRA" , "COSTO VENTA" , "DESCRIPCION" , "FECHA"};
        DefaultTableModel tm = new DefaultTableModel(null, columnas);

        Inventario_Utilidades eu = new Inventario_Utilidades();
        eu.setRuta("src\\Archivos\\inventarios.txt");

        List<Inventarios> lista = new ArrayList();

        try {
            lista = eu.consultarInventario();

            for (Inventarios elem : lista) {

                String registros[] = {elem.getCodigo(),elem.getNombre(),elem.getMarca(),elem.getModelo(),String.valueOf(elem.getCantidad()),elem.getPrecio().toString(),elem.getCostoCompra().toString(),elem.getCostoVenta().toString(),elem.getDescripcion(),elem.getFecha()};
                tm.addRow(registros);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "error");
        }

        Table_pro.setModel(tm);
    }
    
    public void Disable(){
        txtcode.enable(false);
        txtnombre.enable(false);
        txtmarca.enable(false);
        txtmodelo.enable(false);
        txtcantidad.enable(false);
        txtprecio.enable(false);
        txtcos.enable(false);
        txtven.enable(false);
        txtdes.enable(false);
        date_fecha.enable(false); 
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
            java.util.logging.Logger.getLogger(Frm_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Inventario().setVisible(true);
            }
        });
    }
ArrayList<Inventarios> inventarios = new ArrayList<>();
String codigo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_pro;
    private javax.swing.JButton buscar;
    private com.toedter.calendar.JDateChooser date_fecha;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guarda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuev;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtcos;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtven;
    // End of variables declaration//GEN-END:variables
}
