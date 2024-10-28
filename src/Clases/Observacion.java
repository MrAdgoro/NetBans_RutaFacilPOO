/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Observacion implements Serializable {
    private static final long serialVersionUID = 1L;
    private String pilotoNombre;
    private String observacion;

    public Observacion(String pilotoNombre, String observacion) {
        this.pilotoNombre = pilotoNombre;
        this.observacion = observacion;
    }

    public String getPilotoNombre() {
        return pilotoNombre;
    }

    public String getObservacion() {
        return observacion;
    }
    
}
