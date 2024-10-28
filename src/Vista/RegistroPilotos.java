
package Vista;
import Clases.Bus;
import Clases.Flotilla;
import Clases.Piloto;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;



public class RegistroPilotos extends javax.swing.JFrame {
     DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Piloto> listaPilotos = new ArrayList<>();
    private final String archivoPilotos = "Pilotos";
    
    public RegistroPilotos() {
        initComponents();
        this.setTitle("REGISTRO DE PILOTOS");
        this.setLocationRelativeTo(null);
        modelo.addColumn("NOMBRE");
        modelo.addColumn("ID");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("RUTA ASIGNADA");
        modelo.addColumn("BUS ASIGNADO");

        cargarDesdeArchivo();
        cargarBuses();
        refrescarTabla();
        setCharacterLimit(txtIDPiloto, 13);
        setCharacterLimit(txtTelefonoPiloto, 8);
    }
    
     private void setCharacterLimit(JTextField textField, int limit) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { checkLength(e); }
            public void removeUpdate(DocumentEvent e) { checkLength(e); }
            public void changedUpdate(DocumentEvent e) { checkLength(e); }

            private void checkLength(DocumentEvent e) {
                SwingUtilities.invokeLater(() -> {
                    if (e.getDocument().getLength() > limit) {
                        try {
                            e.getDocument().remove(limit, e.getDocument().getLength() - limit);
                        } catch (BadLocationException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
            }
        });
    }
     
    private void cargarBuses(){
        Flotilla objFlotilla = new Flotilla();
        List<Bus> lstBuses = objFlotilla.ListarBuses();
        spnBusAsignado.removeAllItems(); // Limpiamos cualquier elemento previo
        // Iteramos sobre la lista y añadimos los elementos al comboBox
        for (Bus objBus : lstBuses) {
            // Añade el nombre o cualquier otro atributo del objeto como texto en el comboBox
            spnBusAsignado.addItem(objBus.getStrPlaca()); // Ajusta esto según el atributo que desees mostrar
        }
    }
    
     private void guardarEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoPilotos))) {
            oos.writeObject(listaPilotos);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar en archivo: " + e.getMessage());
        }
    }

    private void cargarDesdeArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoPilotos))) {
            listaPilotos = (ArrayList<Piloto>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar desde archivo: " + e.getMessage());
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombrePiloto = new javax.swing.JTextField();
        txtIDPiloto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefonoPiloto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        spnRutaAsignada = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        spnBusAsignado = new javax.swing.JComboBox<>();
        btnAgregarPiloto = new javax.swing.JButton();
        btnBorrarPiloto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroPiloto = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtNombrePiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePilotoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombrePiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 200, -1));

        txtIDPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDPilotoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIDPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 200, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtTelefonoPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoPilotoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefonoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ruta Asignada");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        spnRutaAsignada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "1", "2", "3", "4", "5" }));
        spnRutaAsignada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnRutaAsignadaActionPerformed(evt);
            }
        });
        getContentPane().add(spnRutaAsignada, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Bus Asignado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        spnBusAsignado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Bus 1", "Bus 2", "Bus 3", "Bus 4", "Bus 5" }));
        spnBusAsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnBusAsignadoActionPerformed(evt);
            }
        });
        getContentPane().add(spnBusAsignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 120, -1));

        btnAgregarPiloto.setText("Agregar");
        btnAgregarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPilotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btnBorrarPiloto.setText("Borrar");
        btnBorrarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPilotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        tblRegistroPiloto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRegistroPiloto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 590, 200));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, 20));

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        jLabel7.setText("Registro Pilotos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePilotoActionPerformed

    private void txtIDPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDPilotoActionPerformed

    private void spnRutaAsignadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnRutaAsignadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnRutaAsignadaActionPerformed

    private void spnBusAsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnBusAsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnBusAsignadoActionPerformed

    private void btnAgregarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPilotoActionPerformed
         try {
        Piloto x = new Piloto();
        x.setNombre(txtNombrePiloto.getText());
        x.setId(txtIDPiloto.getText());
        x.setTelefono(txtTelefonoPiloto.getText());
        x.setRutaAsignada(spnRutaAsignada.getSelectedIndex());
        x.setBusAsignado(spnBusAsignado.getSelectedItem().toString());
        listaPilotos.add(x);

        // Guardar cambios en el archivo
        guardarEnArchivo();
        refrescarTabla();

        // Limpiar campos de texto después de agregar
        txtNombrePiloto.setText("");
        txtIDPiloto.setText("");
        txtTelefonoPiloto.setText("");
        spnRutaAsignada.setSelectedIndex(0);
        spnBusAsignado.setSelectedIndex(0);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "ERROR AL AGREGAR PILOTO");
    }
    }//GEN-LAST:event_btnAgregarPilotoActionPerformed

    private void btnBorrarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPilotoActionPerformed
         int filaSeleccionada = tblRegistroPiloto.getSelectedRow();

        if (filaSeleccionada >= 0) {
            // Confirmar la eliminación
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este piloto?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                // Eliminar el piloto de la lista
                listaPilotos.remove(filaSeleccionada);

                // Guardar cambios en el archivo
                guardarEnArchivo();
                refrescarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor selecciona un piloto para eliminar.");
        }

    }//GEN-LAST:event_btnBorrarPilotoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

       MenuPrincipal objMenuPrincipal = new MenuPrincipal();
        this.setVisible(false);
        objMenuPrincipal.setVisible(true);

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtTelefonoPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoPilotoActionPerformed

    public void refrescarTabla() {
       modelo.setRowCount(0); // Limpiar tabla
        for (Piloto piloto : listaPilotos) {
            Object[] fila = { piloto.getNombre(), piloto.getId(), piloto.getTelefono(), piloto.getRutaAsignada(), piloto.getBusAsignado() };
            modelo.addRow(fila);
        }
        tblRegistroPiloto.setModel(modelo);
    }
    
   
    
    public static void main(String args[]) {
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPilotos().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPiloto;
    private javax.swing.JButton btnBorrarPiloto;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> spnBusAsignado;
    private javax.swing.JComboBox<String> spnRutaAsignada;
    private javax.swing.JTable tblRegistroPiloto;
    private javax.swing.JTextField txtIDPiloto;
    private javax.swing.JTextField txtNombrePiloto;
    private javax.swing.JTextField txtTelefonoPiloto;
    // End of variables declaration//GEN-END:variables

    private void setCharacterLimit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
