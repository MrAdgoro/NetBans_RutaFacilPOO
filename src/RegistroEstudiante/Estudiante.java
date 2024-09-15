
package RegistroEstudiante;

public class Estudiante {
    private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String rutaAsignada;
    
    public Estudiante(){
        
    }

    public Estudiante(String id, String nombre, String direccion, String telefono, String rutaAsignada) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rutaAsignada = rutaAsignada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getRutaAsignada() {
        return rutaAsignada;
    }

    public void setRutaAsignada(String rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }

    void getDireccion(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getTelefono(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getRutaAsignada(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}