package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class Usuario_RevisionPK implements Serializable{

    @ManyToOne
    @JoinColumn(name="id_usuario", referencedColumnName="id")
    private Usuario id_usuario;

    @ManyToOne
    @JoinColumn(name="id_revision", referencedColumnName="id")
    private Revision id_revision;

    public Usuario_RevisionPK(Usuario id_usuario, Revision id_revision) {
        super();
        this.id_usuario = id_usuario;
        this.id_revision = id_revision;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public Revision getId_revision() {
        return id_revision;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_revision(Revision id_revision) {
        this.id_revision = id_revision;
    }

    
    
}
