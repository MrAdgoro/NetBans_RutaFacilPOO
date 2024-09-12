/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

public class GestionEstudiantes {
    private final List<Estudiante> estudiantes;

    public GestionEstudiantes() {
        this.estudiantes = new ArrayList<>();
    }

    public List<Estudiante> listarEstudiantes() {
        return estudiantes;
    }

    // Agregamos un método para agregar estudiantes a la lista
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Agregamos un método para eliminar estudiantes de la lista
    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }
    
}
