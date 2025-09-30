package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombre;
    private String correo;
    private Long celular;
    private Long cedula;

    public Usuario(String nombre, String correo, Long celular, Long cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.cedula = cedula;
    }
    public Usuario()
    {;}
    
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public Long getCelular() {
        return celular;
    }
    public Long getCedula() {
        return cedula;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setCelular(Long celular) {
        this.celular = celular;
    }
    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    
}
