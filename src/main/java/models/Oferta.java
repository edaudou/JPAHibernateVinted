package models;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = true)
    private Integer id_oferta;
    @NotNull
    private double precio_oferta;
    @NotNull
    private Date fecha;
    @NotNull
    private String mensaje;
    @ManyToOne(optional = true)
    @JoinColumn(name="usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @Override
    public String toString() {
        return "Oferta{" +
                "id_oferta=" + id_oferta +
                ", precio_oferta=" + precio_oferta +
                ", fecha=" + fecha +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto producto;

}
