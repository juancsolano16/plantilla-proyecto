package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="revision")
public class Revision {

    private Long id;
    private int evaluacion;
    private String comentario;

    public Revision(int evaluacion, String comentario) {
        this.evaluacion = evaluacion;
        this.comentario = comentario;
    }
    public Revision()
    {;}
    public Long getId() {
        return id;
    }
    public int getEvaluacion() {
        return evaluacion;
    }
    public String getComentario() {
        return comentario;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setEvaluacion(int evaluacion) {
        this.evaluacion = evaluacion;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    

}
