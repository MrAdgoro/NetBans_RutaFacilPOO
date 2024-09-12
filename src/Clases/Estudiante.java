/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author gordi
 */
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String rutaAsignada;

    private static final List<Estudiante> estudiantesRegistrados = new ArrayList<>();

    public Estudiante(String id, String nombre, String direccion, String telefono, String rutaAsignada) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rutaAsignada = rutaAsignada;
    }

    public void registrarEstudiante(String id, String nombre, String direccion, String telefono, String rutaAsignada) {
        Estudiante estudiante = new Estudiante(id, nombre, direccion, telefono, rutaAsignada);
        estudiantesRegistrados.add(estudiante);
    }

    public void editarEstudiante(String id, String nombre, String direccion, String telefono, String rutaAsignada) {
        for (Estudiante estudiante : estudiantesRegistrados) {
            if (estudiante.getId().equals(id)) {
                estudiante.setNombre(nombre);
                estudiante.setDireccion(direccion);
                estudiante.setTelefono(telefono);
                estudiante.setRutaAsignada(rutaAsignada);
                break;
            }
        }
    }

    public void eliminarEstudiante(String id) {
        for (Estudiante estudiante : estudiantesRegistrados) {
            if (estudiante.getId().equals(id)) {
                estudiantesRegistrados.remove(estudiante);
                break;
            }
        }
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
}

   

