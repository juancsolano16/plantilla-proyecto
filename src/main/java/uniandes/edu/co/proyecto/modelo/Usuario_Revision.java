package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario_revision")
public class Usuario_Revision {
    @EmbeddedId
    private Usuario_RevisionPK pk;

    public Usuario_Revision(Usuario id_usuario, Revision id_revision) {
        this.pk = new Usuario_RevisionPK(id_usuario, id_revision);
        }

    public Usuario_Revision() {;}

    public Usuario_RevisionPK getPk() {
        return pk;
    }
    public void setPk(Usuario_RevisionPK pk) {
        this.pk = pk;
    }

}
