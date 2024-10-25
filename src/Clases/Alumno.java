
package Clases;

import javax.swing.JComboBox;

public class Alumno {
    String nombre;
    String id;
    String direccion;
    String telefono;
    String correo;
    int rutaAsignada;

    public Alumno() {
    }

    public Alumno(String nombre, String id, String direccion, String telefono, int rutaAsignada) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getRutaAsignada() {
        return rutaAsignada;
    }

    public void setRutaAsignada(int rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", rutaAsignada=" + rutaAsignada + '}';
    }

    void setRutaAsignada(JComboBox<String> spnRutaAsignada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
