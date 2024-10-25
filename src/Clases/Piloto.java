/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.Serializable;

public class Piloto implements Serializable {
      private static final long serialVersionUID = 1L;
    String nombre;
    String id;
    String telefono;
    int busAsignado;
    int rutaAsignada;

    public Piloto () {
        
    }
    
    public Piloto(String nombre, String id, String telefono, int busAsignado, int rutaAsignada) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.busAsignado = busAsignado;
        this.rutaAsignada = rutaAsignada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getBusAsignado() {
        return busAsignado;
    }

    public void setBusAsignado(int busAsignado) {
        this.busAsignado = busAsignado;
    }

    public int getRutaAsignada() {
        return rutaAsignada;
    }

    public void setRutaAsignada(int rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }
    
}

