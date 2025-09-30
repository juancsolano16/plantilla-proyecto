package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Embeddable
public class Usuario_TarjetaPK implements Serializable {
    @OneToOne
    @JoinColumn(name="id_usuario", referencedColumnName="id")
    private Usuario id_usuario;
    @OneToOne
    @JoinColumn(name="id_tarjeta", referencedColumnName="id"    )
    private TarjetaCredito id_tarjeta;

}
