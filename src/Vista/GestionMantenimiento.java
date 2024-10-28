/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import Clases.Mantenimiento;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GestionMantenimiento extends javax.swing.JFrame {
    
  
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Mantenimiento> mantenimientos = new ArrayList<>();
    private final String nombreArchivo = "Mantenimiento";
    
    public GestionMantenimiento() {
       initComponents();
        this.setTitle("GESTION DE MANTENIMIENTO DE");
        this.setLocationRelativeTo(null);

        modelo.addColumn("ID");
        modelo.addColumn("MODELO");
        modelo.addColumn("FECHA");
        modelo.addColumn("MANTENIMIENTO");
        modelo.addColumn("DETALLES");
        modelo.addColumn("COSTO");

        tblGestionMantenimiento.setModel(modelo);

        // Ocultar campos de detalles y costo inicialmente
        jLabel7.setVisible(false);
        txtDetallesTrabajo.setVisible(false);
        jLabel2.setVisible(false);
        txtCosto.setVisible(false);

        cargarDatos();
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtModeloBus = new javax.swing.JTextField();
        txtDetallesTrabajo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGestionMantenimiento = new javax.swing.JTable();
        jcbxTipoMantenimiento = new javax.swing.JComboBox<>();
        txtFechaProgramada = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Costo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Modelo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Fecha (\"dd/mm/yyyy\"):");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mantenimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Detalles:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 130, -1));

        txtModeloBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloBusActionPerformed(evt);
            }
        });
        getContentPane().add(txtModeloBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, -1));

        txtDetallesTrabajo.setAutoscrolls(false);
        txtDetallesTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetallesTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDetallesTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 130, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        tblGestionMantenimiento.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGestionMantenimiento.setDragEnabled(true);
        jScrollPane2.setViewportView(tblGestionMantenimiento);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 240));

        jcbxTipoMantenimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Frenos", "Aceite", "Mantenimiento general", "Otro..." }));
        jcbxTipoMantenimiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbxTipoMantenimientoItemStateChanged(evt);
            }
        });
        jcbxTipoMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbxTipoMantenimientoMouseClicked(evt);
            }
        });
        jcbxTipoMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxTipoMantenimientoActionPerformed(evt);
            }
        });
        getContentPane().add(jcbxTipoMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, 20));

        txtFechaProgramada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaProgramadaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaProgramada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        jLabel8.setText("Gestion de mantenimiento");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarMantenimiento();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDetallesTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetallesTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetallesTrabajoActionPerformed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void jcbxTipoMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxTipoMantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxTipoMantenimientoActionPerformed

    private void jcbxTipoMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbxTipoMantenimientoMouseClicked
    }//GEN-LAST:event_jcbxTipoMantenimientoMouseClicked

    private void jcbxTipoMantenimientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbxTipoMantenimientoItemStateChanged
        int opcion = jcbxTipoMantenimiento.getSelectedIndex();
        switch(opcion){
            case 0: jLabel7.setVisible(false);
                txtDetallesTrabajo.setVisible(false);
                jLabel2.setVisible(false);
                txtCosto.setVisible(false);
                break;
            case 1: 
                jLabel7.setVisible(true);
                txtDetallesTrabajo.setVisible(true);
                jLabel2.setVisible(true);
                txtCosto.setVisible(true);
                txtDetallesTrabajo.setEnabled(false);
                txtCosto.setEnabled(false);
                txtDetallesTrabajo.setText("Cambio de Pastillas");
                txtCosto.setText("1500");
                break;
            case 2: 
                jLabel7.setVisible(true);
                txtDetallesTrabajo.setVisible(true);
                jLabel2.setVisible(true);
                txtCosto.setVisible(true);
                txtDetallesTrabajo.setEnabled(false);
                txtCosto.setEnabled(false);
                txtDetallesTrabajo.setText("Cambio de Aceite del motor");
                txtCosto.setText("2100");
                break;
            case 3:
                jLabel7.setVisible(true);
                txtDetallesTrabajo.setVisible(true);
                jLabel2.setVisible(true);
                txtCosto.setVisible(true);
                txtDetallesTrabajo.setEnabled(false);
                txtCosto.setEnabled(false);
                txtDetallesTrabajo.setText("Chequeo y Mantenimiento necesario");
                txtCosto.setText("12700");
                break;
            case 4:
                jLabel7.setVisible(true);
                txtDetallesTrabajo.setVisible(true);
                jLabel2.setVisible(true);
                txtCosto.setVisible(true);
                txtDetallesTrabajo.setEnabled(true);
                txtCosto.setEnabled(true);
                txtDetallesTrabajo.setText("");
                txtCosto.setText("");
                break;
                
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxTipoMantenimientoItemStateChanged

    private void txtFechaProgramadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaProgramadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaProgramadaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       this.setVisible(false); // Oculta la ventana actual (GestionMantenimiento)
    new MenuPrincipal().setVisible(true); // Muestra el menú principal
    this.dispose(); 
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtModeloBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloBusActionPerformed

        private void agregarMantenimiento() {
       try {
            String id = txtId.getText();
            String modeloBus = txtModeloBus.getText();
            LocalDate fechaProgramada = LocalDate.parse(txtFechaProgramada.getText(), DateTimeFormatter.ofPattern("dd/mm/yyyy"));
            String tipoMantenimiento = jcbxTipoMantenimiento.getSelectedItem().toString();
            String detallesTrabajo = txtDetallesTrabajo.getText();
            double costo = Double.parseDouble(txtCosto.getText());

            Mantenimiento mantenimiento = new Mantenimiento(id, modeloBus, fechaProgramada, tipoMantenimiento, detallesTrabajo, costo);
            mantenimientos.add(mantenimiento);

            actualizarTabla();
            guardarDatos(); // Guardar después de agregar

            limpiarCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar mantenimiento: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarTabla() {
        modelo.setRowCount(0);

        for (Mantenimiento m : mantenimientos) {
            modelo.addRow(new Object[]{
                m.getId(),
                m.getModeloBus(),
                m.getFechaProgramada().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                m.getTipoMantenimiento(),
                m.getDetallesTrabajo(),
                String.format("%.2f", m.getCosto())
            });
        }
    }

    private void limpiarCampos() {
        txtId.setText("");
        txtModeloBus.setText("");
        txtFechaProgramada.setText("");
        jcbxTipoMantenimiento.setSelectedIndex(0);
        txtDetallesTrabajo.setText("");
        txtCosto.setText("");
    }
    
     private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(mantenimientos);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para cargar los datos de mantenimiento desde un archivo binario
    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            mantenimientos = (ArrayList<Mantenimiento>) ois.readObject();
            actualizarTabla();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado. Se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionMantenimiento().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbxTipoMantenimiento;
    private javax.swing.JTable tblGestionMantenimiento;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDetallesTrabajo;
    private javax.swing.JTextField txtFechaProgramada;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModeloBus;
    // End of variables declaration//GEN-END:variables
}
