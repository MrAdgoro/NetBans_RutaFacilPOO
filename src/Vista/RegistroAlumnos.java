/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Clases.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroAlumnos extends javax.swing.JFrame {

    DefaultTableModel modelo=new DefaultTableModel();
    ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>();
    public RegistroAlumnos() {
        initComponents();
       
        this.setTitle("REGISTRO DE ALUMNOS");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        modelo.addColumn("NOMBRE");
        modelo.addColumn("ID");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("RUTA");
        refrescarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        txtIDAlumno = new javax.swing.JTextField();
        txtDireccionAlumno = new javax.swing.JTextField();
        txtTelefonoAlumno = new javax.swing.JTextField();
        spnRutaAsignada = new javax.swing.JComboBox<>();
        btnAgregarAlumno = new javax.swing.JButton();
        btnBorrarAlumno = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistroAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRegistroAlumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 217, -1, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ruta Asignada");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 200, -1));

        txtIDAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIDAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, -1));

        txtDireccionAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccionAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 200, -1));
        getContentPane().add(txtTelefonoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 200, -1));

        spnRutaAsignada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        spnRutaAsignada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnRutaAsignadaActionPerformed(evt);
            }
        });
        getContentPane().add(spnRutaAsignada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 120, -1));

        btnAgregarAlumno.setText("Agregar");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnBorrarAlumno.setText("Borrar");
        btnBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlumnoActionPerformed

    private void txtIDAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDAlumnoActionPerformed

    private void txtDireccionAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionAlumnoActionPerformed

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        try {
        
        Alumno x=new Alumno();
        x.setNombre(txtNombreAlumno.getText());
        x.setId(txtIDAlumno.getText());
        x.setDireccion(txtDireccionAlumno.getText());
        x.setTelefono(txtTelefonoAlumno.getText());
        x.setRutaAsignada(Integer.parseInt(spnRutaAsignada.getSelectedItem().toString()));
        listaAlumnos.add(x);
        refrescarTabla();
        } catch (Exception e){
            JOptionPane.showMessageDialog(this,"ERROR AL AGREGAR ALUMNO");
        }
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void btnBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlumnoActionPerformed
        txtNombreAlumno.setText("");
        txtIDAlumno.setText("");
        txtDireccionAlumno.setText("");
        txtTelefonoAlumno.setText("");
        spnRutaAsignada.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnBorrarAlumnoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    
        MenuPrincipal objMenuPrincipal = new MenuPrincipal();
        this.setVisible(false);
        objMenuPrincipal.setVisible(true);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void spnRutaAsignadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnRutaAsignadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnRutaAsignadaActionPerformed

    public void refrescarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        
        for (Alumno alumno : listaAlumnos) {
            Object a[]=new Object[5];
            a[0]=alumno.getNombre();
            a[1]=alumno.getId();
            a[2]=alumno.getDireccion();
            a[3]=alumno.getTelefono();
            a[4]=alumno.getRutaAsignada();
            modelo.addRow(a);
        }
        
        tblRegistroAlumnos.setModel(modelo);
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnBorrarAlumno;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> spnRutaAsignada;
    private javax.swing.JTable tblRegistroAlumnos;
    private javax.swing.JTextField txtDireccionAlumno;
    private javax.swing.JTextField txtIDAlumno;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtTelefonoAlumno;
    // End of variables declaration//GEN-END:variables
}
