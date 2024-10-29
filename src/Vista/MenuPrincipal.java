/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import javax.swing.JOptionPane;



/**
 *
 * @author gordi
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloLogin = new javax.swing.JLabel();
        btnRegistroBuses = new javax.swing.JButton();
        btnRegistroAlumnos = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnGestionMantenimiento = new javax.swing.JButton();
        btnSimuladorCostos = new javax.swing.JButton();
        btnRegistroPilotos = new javax.swing.JButton();
        btnEnvioCorreo = new javax.swing.JButton();
        btnFeedbackPil = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloLogin.setFont(new java.awt.Font("Rockwell Condensed", 2, 26)); // NOI18N
        lblTituloLogin.setText("Ruta Facil");
        getContentPane().add(lblTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, -1));

        btnRegistroBuses.setText("Registro de Buses");
        btnRegistroBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroBusesActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, -1));

        btnRegistroAlumnos.setText("Registro de Alumnos");
        btnRegistroAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, -1));

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        btnGestionMantenimiento.setText("Gestion Mantenimiento");
        btnGestionMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionMantenimientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 160, -1));

        btnSimuladorCostos.setText("Simulador de Costos");
        btnSimuladorCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimuladorCostosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimuladorCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, -1));

        btnRegistroPilotos.setText("Registro de Pilotos");
        btnRegistroPilotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPilotosActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, -1));

        btnEnvioCorreo.setText("Envio Notificaciones");
        btnEnvioCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvioCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnvioCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 160, -1));

        btnFeedbackPil.setText("Feedback Pilotos");
        btnFeedbackPil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackPilActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeedbackPil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, -1));

        btnFeedback.setText("Reporte Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cerrar sesión?", "Confirmar cierre de sesión", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Sesión cerrada exitosamente.");
        this.dispose(); // Cierra la ventana actual (MenuPrincipal) y libera los recursos
        JFRMLogin login = new JFRMLogin(); // Crea una única instancia de la ventana de login
        login.setVisible(true); // Muestra la ventana de login
    }
     
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRegistroAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAlumnosActionPerformed
        RegistroAlumnos objRegistroAlumnos = new RegistroAlumnos();
        this.setVisible(false);
        objRegistroAlumnos.setVisible(true);
    }//GEN-LAST:event_btnRegistroAlumnosActionPerformed

    private void btnRegistroBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroBusesActionPerformed
        RegistroBuses objRegistroBuses = new RegistroBuses();
        this.setVisible(false);
        objRegistroBuses.setVisible(true);
    }//GEN-LAST:event_btnRegistroBusesActionPerformed

    private void btnGestionMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionMantenimientoActionPerformed
        GestionMantenimiento objGestionMantenimiento = new GestionMantenimiento();
        this.setVisible(false);
        objGestionMantenimiento.setVisible(true);
    }//GEN-LAST:event_btnGestionMantenimientoActionPerformed

    private void btnSimuladorCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimuladorCostosActionPerformed
FRMSimuladorcostos objFRMSimuladorcostos=new FRMSimuladorcostos();
this.setVisible(false);
objFRMSimuladorcostos.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnSimuladorCostosActionPerformed

    private void btnRegistroPilotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPilotosActionPerformed
        RegistroPilotos objRegistroPilotos=new RegistroPilotos();
        this.setVisible(false);
        objRegistroPilotos.setVisible(true);

    }//GEN-LAST:event_btnRegistroPilotosActionPerformed

    private void btnEnvioCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvioCorreoActionPerformed
        EnvioCorreo objEnvioCorreo=new EnvioCorreo();
        this.setVisible(false);
        objEnvioCorreo.setVisible(true);
    }//GEN-LAST:event_btnEnvioCorreoActionPerformed

    private void btnFeedbackPilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackPilActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnFeedbackPilActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:
        Reportefeedback objReportefeedback=new Reportefeedback();
        this.setVisible(false);
        objReportefeedback.setVisible(true);
    }//GEN-LAST:event_btnFeedbackActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnvioCorreo;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnFeedbackPil;
    private javax.swing.JButton btnGestionMantenimiento;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegistroAlumnos;
    private javax.swing.JButton btnRegistroBuses;
    private javax.swing.JButton btnRegistroPilotos;
    private javax.swing.JButton btnSimuladorCostos;
    private javax.swing.JLabel lblTituloLogin;
    // End of variables declaration//GEN-END:variables
}
