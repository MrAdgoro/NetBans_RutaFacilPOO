/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RegistroEstudiante;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroEstudiantes extends javax.swing.JFrame {

    DefaultTableModel modelo=new DefaultTableModel();
    ArrayList<Estudiante> listaEstudiante=new ArrayList<Estudiante>();
    public RegistroEstudiantes() {
        initComponents();
        this.setTitle("REGISTRO ESTUDIANTES");
        this.setSize(465,380);
        this.setLocationRelativeTo(null);
        modelo.addColumn("Nombre");
        modelo.addColumn("ID");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Ruta Asignada");
        refrescarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroEstudiantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtIDEstudiante = new javax.swing.JTextField();
        txtDireccionEstudiante = new javax.swing.JTextField();
        txtTelefonoEstudiante = new javax.swing.JTextField();
        txtRutaEstudiante = new javax.swing.JTextField();
        btnAgregarEstudiante = new javax.swing.JButton();
        btnBorrarEstudiante = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistroEstudiantes.setAutoCreateRowSorter(true);
        tblRegistroEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRegistroEstudiantes.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblRegistroEstudiantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 410, 202));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ruta Asignada");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtNombreEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 210, -1));
        getContentPane().add(txtIDEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 210, -1));
        getContentPane().add(txtDireccionEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 210, -1));

        txtTelefonoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefonoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 210, -1));
        getContentPane().add(txtRutaEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 210, -1));

        btnAgregarEstudiante.setText("Agregar");
        btnAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        btnBorrarEstudiante.setText("Borrar");
        btnBorrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtNombreEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEstudianteActionPerformed

    private void txtTelefonoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEstudianteActionPerformed

    private void btnBorrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarEstudianteActionPerformed

    private void btnAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstudianteActionPerformed
      try {
        Estudiante estudiante=new Estudiante();
        estudiante.setNombre(txtNombreEstudiante.getText());
        estudiante.setId(txtIDEstudiante.getText());
        estudiante.getDireccion(txtDireccionEstudiante.getText());
        estudiante.getTelefono(txtTelefonoEstudiante.getText());
        estudiante.getRutaAsignada(txtRutaEstudiante.getText());
        listaEstudiante.add(estudiante);
        refrescarTabla(); 
      } catch (Exception e) {
          JOptionPane.showMessageDialog(this,"Error al agregar Estudiante");
      }
    }//GEN-LAST:event_btnAgregarEstudianteActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroEstudiantes().setVisible(true);
        });
    }
    
    public void refrescarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        
        for (Estudiante estudiante: listaEstudiante){
            Object a[]=new Object[5];
            a[0]=estudiante.getNombre();
            a[1]=estudiante.getId();
            a[2]=estudiante.getDireccion();
            a[3]=estudiante.getTelefono();
            a[4]=estudiante.getRutaAsignada();
            modelo.addRow(a);
        }
        
        tblRegistroEstudiantes.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btnBorrarEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tblRegistroEstudiantes;
    private javax.swing.JTextField txtDireccionEstudiante;
    private javax.swing.JTextField txtIDEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtRutaEstudiante;
    private javax.swing.JTextField txtTelefonoEstudiante;
    // End of variables declaration//GEN-END:variables
}
