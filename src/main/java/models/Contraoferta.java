package models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contraoferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable= true)
    private Integer id_contraoferta;
    @NotNull
    private double precioContraOferta;
    @NotNull
    private Date fecha_oferta;
    @NotNull
    private String mensaje;
    @ManyToOne(optional = false)
    @JoinColumn(name = "oferta_id",referencedColumnName = "id")
    private Oferta oferta;
    @ManyToOne(optional = true)
    @JoinColumn(name = "usuario_id",referencedColumnName = "id")
    private Usuario usuario;


}
