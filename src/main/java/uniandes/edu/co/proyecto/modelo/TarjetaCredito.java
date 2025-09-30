package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Tarjeta_Credito")
public class TarjetaCredito {
    private Long id;
    private Long numero;
    private String nombreTarjeta;
    private String fechaVencimiento;
    private Long codigo;

    public TarjetaCredito(Long numero, String nombreTarjeta, String fechaVencimiento, Long codigo) {
        this.numero = numero;
        this.nombreTarjeta = nombreTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.codigo = codigo;
    }
    public TarjetaCredito()
    {;}
    public Long getId() {
        return id;
    }
    public Long getNumero() {
        return numero;
    }
    public String getNombreTarjeta() {
        return nombreTarjeta;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public Long getCodigo() {
        return codigo;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    
}
