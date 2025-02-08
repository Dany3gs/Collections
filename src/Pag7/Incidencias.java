package Pag7;

import java.time.LocalDate;

public class Incidencias {
    private int idIncidencia;
    private int idInspector;
    private String descripcionIncidencia;
    private LocalDate fechaIncidencia;
    private String nivelError;

    public Incidencias(int idIncidencia, int idInspector, String descripcionIncidencia, LocalDate fechaIncidencia, String nivelError) {
        this.idIncidencia = idIncidencia;
        this.idInspector = idInspector;
        this.descripcionIncidencia = descripcionIncidencia;
        this.fechaIncidencia = fechaIncidencia;
        this.nivelError = nivelError;
    }

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public int getIdInspector() {
        return idInspector;
    }

    public void setIdInspector(int idInspector) {
        this.idInspector = idInspector;
    }

    public String getDescripcionIncidencia() {
        return descripcionIncidencia;
    }

    public void setDescripcionIncidencia(String descripcionIncidencia) {
        this.descripcionIncidencia = descripcionIncidencia;
    }

    public LocalDate getFechaIncidencia() {
        return fechaIncidencia;
    }

    public void setFechaIncidencia(LocalDate fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
    }

    public String getNivelError() {
        return nivelError;
    }

    public void setNivelError(String nivelError) {
        this.nivelError = nivelError;
    }

    @Override
    public String toString() {
        return "Incidencias{" +
                "idIncidencia=" + idIncidencia +
                ", idInspector=" + idInspector +
                ", descripcionIncidencia='" + descripcionIncidencia + '\'' +
                ", fechaIncidencia='" + fechaIncidencia + '\'' +
                ", nivelError='" + nivelError + '\'' +
                '}';
    }
}
