package Preuniversitario.Arquitectura.Models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class DocumentarArancelMastricula {

    private Integer rut ;
    private String tipoDocumentacion;
    private Integer egreso;
    private int cuotasSeleccionadas;

    public DocumentarArancelMastricula() {
    }

    public DocumentarArancelMastricula(Integer rut, String tipoDocumentacion, Integer egreso, int cuotasSeleccionadas) {
        this.rut = rut;
        this.tipoDocumentacion = tipoDocumentacion;
        this.egreso = egreso;
        this.cuotasSeleccionadas = cuotasSeleccionadas;
    }

    public Integer getRut() {
        return rut;
    }

    public String getTipoDocumentacion() {
        return tipoDocumentacion;
    }

    public Integer getEgreso() {
        return egreso;
    }

    public int getCuotasSeleccionadas() {
        return cuotasSeleccionadas;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public void setTipoDocumentacion(String tipoDocumentacion) {
        this.tipoDocumentacion = tipoDocumentacion;
    }

    public void setEgreso(Integer egreso) {
        this.egreso = egreso;
    }

    public void setCuotasSeleccionadas(int cuotasSeleccionadas) {
        this.cuotasSeleccionadas = cuotasSeleccionadas;
    }
}
