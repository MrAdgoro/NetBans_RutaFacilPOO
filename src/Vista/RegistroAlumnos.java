/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Clases.Alumno;
import Clases.Bus;
import Clases.Flotilla;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroAlumnos extends javax.swing.JFrame {

       DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    public RegistroAlumnos() {
        initComponents();
       
        this.setTitle("REGISTRO DE ALUMNOS");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        modelo.addColumn("NOMBRE");
        modelo.addColumn("ID");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("CORREO");
        modelo.addColumn("RUTA");
        modelo.addColumn("BUS");
        cargarAlumnos(); // Cargar los datos al iniciar la aplicación
        cargarBuses();
        cargarBusqueda();
        refrescarTabla();
    }
    private void cargarBuses(){
        Flotilla objFlotilla = new Flotilla();
        List<Bus> lstBuses = objFlotilla.ListarBuses();
        spnBusAsignado.removeAllItems(); // Limpiamos cualquier elemento previo
        spnBus.removeAllItems();
        // Iteramos sobre la lista y añadimos los elementos al comboBox
        for (Bus objBus : lstBuses) {
            // Añade el nombre o cualquier otro atributo del objeto como texto en el comboBox
            spnBusAsignado.addItem(objBus.getStrPlaca()); // Ajusta esto según el atributo que desees mostrar
            spnBus.addItem(objBus.getStrPlaca()); // Ajusta esto según el atributo que desees mostrar
        }
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
        jLabel6 = new javax.swing.JLabel();
        txtCorreoAlumno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spnBusAsignado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        spnBus = new javax.swing.JComboBox<>();
        btnBuscarAlumnos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBusquedaAlumnos = new javax.swing.JTable();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 570, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Bus:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        txtNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, -1));

        txtIDAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIDAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 200, -1));

        txtDireccionAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccionAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 200, -1));
        getContentPane().add(txtTelefonoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 200, -1));

        spnRutaAsignada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        spnRutaAsignada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnRutaAsignadaActionPerformed(evt);
            }
        });
        getContentPane().add(spnRutaAsignada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, -1));

        btnAgregarAlumno.setText("Agregar");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        btnBorrarAlumno.setText("Borrar");
        btnBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtCorreoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ruta Asignada");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        spnBusAsignado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Bus 1", "Bus 2", "Bus 3", "Bus 4", "Bus 5" }));
        spnBusAsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnBusAsignadoActionPerformed(evt);
            }
        });
        getContentPane().add(spnBusAsignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 270, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Bus:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        spnBus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Bus 1", "Bus 2", "Bus 3", "Bus 4", "Bus 5" }));
        spnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnBusActionPerformed(evt);
            }
        });
        getContentPane().add(spnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 270, -1));

        btnBuscarAlumnos.setText("Buscar");
        btnBuscarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        tblBusquedaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblBusquedaAlumnos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 570, 200));

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
        Alumno x = new Alumno();
        x.setNombre(txtNombreAlumno.getText());
        x.setId(txtIDAlumno.getText());
        x.setDireccion(txtDireccionAlumno.getText());
        x.setTelefono(txtTelefonoAlumno.getText());
        x.setCorreo(txtCorreoAlumno.getText());
        x.setRutaAsignada(Integer.parseInt(spnRutaAsignada.getSelectedItem().toString()));
        x.setStrBus(spnBusAsignado.getSelectedItem().toString());
        listaAlumnos.add(x);
        guardarAlumnos();
        refrescarTabla();
        
        // Limpiar los campos de texto después de agregar
        txtNombreAlumno.setText("");
        txtIDAlumno.setText("");
        txtDireccionAlumno.setText("");
        txtTelefonoAlumno.setText("");
        txtCorreoAlumno.setText("");
        spnRutaAsignada.setSelectedIndex(0); // Opcional: resetear la selección del combo
        spnBusAsignado.setSelectedIndex(0);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "ERROR AL AGREGAR ALUMNO");
    }
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void btnBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlumnoActionPerformed
       int filaSeleccionada = tblRegistroAlumnos.getSelectedRow();
    
    if (filaSeleccionada >= 0) {
        // Eliminar el alumno de la lista
        listaAlumnos.remove(filaSeleccionada);
        guardarAlumnos(); // Guardar la lista actualizada en el archivo
        refrescarTabla(); // Actualizar la tabla
        JOptionPane.showMessageDialog(this, "Alumno eliminado correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un alumno para eliminar.");
    }
        
    }//GEN-LAST:event_btnBorrarAlumnoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    
      MenuPrincipal objMenuPrincipal = new MenuPrincipal();
        objMenuPrincipal.setVisible(true); // Muestra el menú principal
        this.dispose();
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void spnRutaAsignadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnRutaAsignadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnRutaAsignadaActionPerformed

    private void txtCorreoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoAlumnoActionPerformed

    private void spnBusAsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnBusAsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnBusAsignadoActionPerformed

    private void spnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnBusActionPerformed

    private void btnBuscarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlumnosActionPerformed
        cargarBusqueda();
    }//GEN-LAST:event_btnBuscarAlumnosActionPerformed
    private void cargarBusqueda(){
        // TODO add your handling code here:
        DefaultTableModel modeloBusqueda = new DefaultTableModel();
        modeloBusqueda.addColumn("NOMBRE");
        modeloBusqueda.addColumn("TELEFONO");
        modeloBusqueda.addColumn("RUTA");
        while (modeloBusqueda.getRowCount() > 0) {
            modeloBusqueda.removeRow(0);
        }
        cargarAlumnos();
        Boolean blnEncontrado=false;
        for (Alumno objAlumno : this.listaAlumnos) {
            if(objAlumno.getStrBus().compareToIgnoreCase(spnBus.getSelectedItem().toString())==0){
                Object a[]=new Object[3];
                a[0]=objAlumno.getNombre();
                a[1]=objAlumno.getTelefono();
                a[2]=objAlumno.getId();
                modeloBusqueda.addRow(a);
                blnEncontrado=true;
            }
        }
        tblBusquedaAlumnos.setModel(modeloBusqueda);
        if(!blnEncontrado){
            JOptionPane.showMessageDialog(this, "No existe alumnos asociados al bus.");
        }
    }
    public void refrescarTabla(){
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        
        for (Alumno alumno : listaAlumnos) {
            Object a[]=new Object[7];
            a[0]=alumno.getNombre();
            a[1]=alumno.getId();
            a[2]=alumno.getDireccion();
            a[3]=alumno.getTelefono();
            a[4]=alumno.getCorreo();
            a[5]=alumno.getRutaAsignada();
            a[6]=alumno.getStrBus();
            modelo.addRow(a);
        }
        
        tblRegistroAlumnos.setModel(modelo);
    }
    
       private void guardarAlumnos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Alumnos.dat"))) {
            out.writeObject(listaAlumnos);
            JOptionPane.showMessageDialog(this, "Alumnos guardados correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los alumnos: " + e.getMessage());
        }
    }

    private void cargarAlumnos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Alumnos.dat"))) {
            listaAlumnos = (ArrayList<Alumno>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar el archivo de alumnos.");
        }
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
    private javax.swing.JButton btnBuscarAlumnos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> spnBus;
    private javax.swing.JComboBox<String> spnBusAsignado;
    private javax.swing.JComboBox<String> spnRutaAsignada;
    private javax.swing.JTable tblBusquedaAlumnos;
    private javax.swing.JTable tblRegistroAlumnos;
    private javax.swing.JTextField txtCorreoAlumno;
    private javax.swing.JTextField txtDireccionAlumno;
    private javax.swing.JTextField txtIDAlumno;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtTelefonoAlumno;
    // End of variables declaration//GEN-END:variables
}
