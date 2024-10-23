/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Clases. Mantenimiento;
import Clases.Alumno;
import Vista.GestionMantenimiento;
import Vista.RegistroAlumnos;
import Vista.RegistroBuses;
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
        btnRegistroAlumnos1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnGestionMantenimiento = new javax.swing.JButton();
        btnGotoCorreos = new javax.swing.JButton();
        btnSimuladorCostos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloLogin.setFont(new java.awt.Font("Rockwell Condensed", 2, 24)); // NOI18N
        lblTituloLogin.setText("Ruta Facil");
        getContentPane().add(lblTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 90, -1));

        btnRegistroBuses.setText("Registro de Buses");
        btnRegistroBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroBusesActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, -1));

        btnRegistroAlumnos1.setText("Registro de Alumnos");
        btnRegistroAlumnos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAlumnos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroAlumnos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, -1));

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        btnGestionMantenimiento.setText("Gestion Mantenimiento");
        btnGestionMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionMantenimientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, -1));

        btnGotoCorreos.setText("Envio de Notificaciones");
        btnGotoCorreos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoCorreosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGotoCorreos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));

        btnSimuladorCostos.setText("Simulador de Costos");
        btnSimuladorCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimuladorCostosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimuladorCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        JFRMLogin objJFRMLogin = new JFRMLogin();
        this.setVisible(false);
        objJFRMLogin.setVisible(true);
         int confirm = JOptionPane.showConfirmDialog(null, "�Est�s seguro de que deseas cerrar sesi�n?", "Confirmar cierre de sesi�n", JOptionPane.YES_NO_OPTION);
    
   
    if (confirm == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Sesi�n cerrada exitosamente.");
        this.setVisible(false); // Ocultar la ventana actual (MenuPrincipal)
        JFRMLogin login = new JFRMLogin(); // Crear una nueva instancia de la ventana de login
        login.setVisible(true); // Mostrar la ventana de login
    }
     
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRegistroAlumnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAlumnos1ActionPerformed
        RegistroAlumnos objRegistroAlumnos = new RegistroAlumnos();
        this.setVisible(false);
        objRegistroAlumnos.setVisible(true);
    }//GEN-LAST:event_btnRegistroAlumnos1ActionPerformed

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

    private void btnGotoCorreosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoCorreosActionPerformed
EnvioCorreo objEnvioCorreo=new EnvioCorreo();
this.setVisible(false);
objEnvioCorreo.setVisible(true);
    }//GEN-LAST:event_btnGotoCorreosActionPerformed

    private void btnSimuladorCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimuladorCostosActionPerformed
FRMSimuladorcostos objFRMSimuladorcostos=new FRMSimuladorcostos();
this.setVisible(false);
objFRMSimuladorcostos.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnSimuladorCostosActionPerformed

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
    private javax.swing.JButton btnGestionMantenimiento;
    private javax.swing.JButton btnGotoCorreos;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegistroAlumnos1;
    private javax.swing.JButton btnRegistroBuses;
    private javax.swing.JButton btnSimuladorCostos;
    private javax.swing.JLabel lblTituloLogin;
    // End of variables declaration//GEN-END:variables
}
