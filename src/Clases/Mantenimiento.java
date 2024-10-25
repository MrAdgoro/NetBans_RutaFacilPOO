package Clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mantenimiento implements Serializable {
    
     private static final long serialVersionUID = 1L; // Agregar un serialVersionUID
    private String id;
    private String modeloBus;
    private LocalDate fechaProgramada;
    private String tipoMantenimiento;
    private String detallesTrabajo;
    private double costo;

    public Mantenimiento() {
    }

    public Mantenimiento(String id, String modeloBus, LocalDate fechaProgramada, String tipoMantenimiento, String detallesTrabajo, double costo) {
        this.id = id;
        this.modeloBus = modeloBus;
        this.fechaProgramada = fechaProgramada;
        this.tipoMantenimiento = tipoMantenimiento;
        this.detallesTrabajo = detallesTrabajo;
        this.costo = costo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModeloBus() {
        return modeloBus;
    }

    public void setModeloBus(String modeloBus) {
        this.modeloBus = modeloBus;
    }

    public LocalDate getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(LocalDate fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public String getDetallesTrabajo() {
        return detallesTrabajo;
    }

    public void setDetallesTrabajo(String detallesTrabajo) {
        this.detallesTrabajo = detallesTrabajo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override 
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Mantenimiento{" +
               "id='" + id + '\'' +
               ", modeloBus='" + modeloBus + '\'' +
               ", fechaProgramada=" + fechaProgramada.format(formatter) +
               ", tipoMantenimiento='" + tipoMantenimiento + '\'' +
               ", detallesTrabajo='" + detallesTrabajo + '\'' +
               ", costo=" + String.format("%.2f", costo) +
               '}';
    }

    // Método para verificar si el mantenimiento está próximo (en los próximos 7 días)
    public boolean esMantenimientoProximo() {
        LocalDate hoy = LocalDate.now();
        LocalDate limiteProximo = hoy.plusDays(7);
        return !fechaProgramada.isBefore(hoy) && !fechaProgramada.isAfter(limiteProximo);
    }

    // Método para calcular los días restantes hasta el mantenimiento
    public long diasHastaMantenimiento() {
        LocalDate hoy = LocalDate.now();
        return hoy.until(fechaProgramada).getDays();
    }
}

