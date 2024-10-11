/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Seguridad {
    JFRMLogin login = new JFRMLogin();
    String res;
    public void validarUsuario(String usuarios[], String user, String contra, int intentos)
    {
      boolean encontrado=false;  
      
      for(int i=0; i < usuarios.length; i++){
        if ((usuarios[i].equalsIgnoreCase(user) && usuarios[i + 1].equals(contra))){  
        res=" Bienvenido " + user ;
        encontrado=true;
        JOptionPane.showMessageDialog(null, res, "Inicio de Sesion ",JOptionPane.INFORMATION_MESSAGE);
        intentos=0;
        login.setIntentos(intentos);
        break;
    }
    
      }// fIN DEL FOR
      if(encontrado==false){
          
          res="Clave y/o usuario erroneos van " + intentos + " intentos fallidos ";
          JOptionPane.showMessageDialog(null, res, "Inicio de Sesion ",JOptionPane.INFORMATION_MESSAGE);
      }
      if(intentos>2){
          JOptionPane.showMessageDialog(null, "3 intentos fallidos, esto se cerrara", "Inicio de Sesion",JOptionPane.ERROR_MESSAGE);
      System.exit(0);}
      
}
    
}
