/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Vista.JFRMLogin;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Seguridad {
    int intIntentos=0;
    public Boolean validarUsuario(String strUsuario, String strClave)
    {
        InputStream isArchivo = getClass().getResourceAsStream("/BD/usuarios");
        if (isArchivo==null) {
            return false;
        }       
        try {
            String Registro;
            BufferedReader reader = new BufferedReader(new InputStreamReader(isArchivo));
            while ((Registro = reader.readLine()) != null) {
                String[] Usuario = Registro.split(",");
                if(Usuario.length!=2) continue;
                if(Usuario[0].compareTo(strUsuario)== 0 && Usuario[1].compareTo(strClave)==0){
                    return true;
                }    
            }
        } catch (Exception e) {
            return false;
        }
        this.intIntentos++;
        return false;
    }
    public int getIntentos(){
        return this.intIntentos;
    }
    
}
