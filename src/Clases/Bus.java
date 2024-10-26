    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author HP
 */
public class Bus  implements Serializable{
    String strPlaca;
    String strMarca;
    int intModelo;
    int intCapacidad;
    //List<Estudiante> lstEstudiantes;
    public Bus(String strPlaca,String strMarca,int intModelo,int intCapacidad){
        this.strMarca=strMarca;
        this.strPlaca=strPlaca;
        this.intModelo=intModelo;
        this.intCapacidad=intCapacidad;
    }
    public String getStrPlaca(){
        return strPlaca;
    }
    public String getStrMarca(){
        return strMarca;
    }
    public int getIntModelo(){
        return intModelo;
    }
    public int getIntCapacidad(){
        return intCapacidad;
    }
}
