
package Clases;
import java.io.Serializable;

public class Piloto implements Serializable {
      private static final long serialVersionUID = 1L;
    String nombre;
    String id;
    String telefono;
    String busAsignado;
    int rutaAsignada;

    public Piloto () {
        
    }
    
    public Piloto(String nombre, String id, String telefono, String busAsignado, int rutaAsignada) {
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

    public String getBusAsignado() {
        return busAsignado;
    }

    public void setBusAsignado(String busAsignado) {
        this.busAsignado = busAsignado;
    }

    public int getRutaAsignada() {
        return rutaAsignada;
    }

    public void setRutaAsignada(int rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }
    
}